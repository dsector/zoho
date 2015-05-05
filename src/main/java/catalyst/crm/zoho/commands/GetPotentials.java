package catalyst.crm.zoho.commands;

import catalyst.crm.zoho.common.Command;
import catalyst.crm.zoho.common.RequestExecutor;
import catalyst.crm.zoho.common.Response;
import catalyst.crm.zoho.response.potential.PotentialFlObject;
import catalyst.crm.zoho.response.potential.PotentialRow;
import catalyst.crm.zoho.response.potential.PotentialsObject;
import catalyst.crm.zoho.services.Authenticator;
import catalyst.potential.models.Potential;
import catalyst.potential.repositories.PotentialRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by rgb24 on 5/3/15.
 */

@Service
public class GetPotentials implements Command<ArrayList<Potential>> {

    @Autowired
    PotentialRepository potentialRepository;

    @Autowired
    RequestExecutor requestExecutor;

    @Autowired
    Authenticator authenticator;

    @Override
    public ArrayList<Potential> execute() {
        //https://crm.zoho.com/crm/private/json/
        //PotentialsObject/getRecords?authtoken=4ad4710df50692fb762381dace410626&scope=crmapi&
        //selectColumns=PotentialsObject(Amount,Potential Owner)&version=1&newFormat=2

        //build uri
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://crm.zoho.com");
        builder.path("crm/private/json/");
        builder.path("Potentials/");
        builder.path("getRecords");

        builder = authenticator.authenticate(builder);

        builder.queryParam("scope", "crmapi");
        //builder.queryParam("selectColumns", "Potentials(Amount,Potential Owner,Electric Utility,Average Electric Bill,Annual KWH,Rate Schedule)");
        builder.queryParam("selectColumns", "All");
        //create response
        Response<PotentialsObject> response = new Response<PotentialsObject>();

        PotentialsObject potentialsObject = new PotentialsObject();

        response.setResponseObject(potentialsObject);

        //execute request
        JsonNode node = requestExecutor.execute(builder, response);

        ObjectMapper mapper = new ObjectMapper();

        if (node != null) {
            try {
                PotentialsObject pot = mapper.readValue(node.findValue("Potentials").toString(), PotentialsObject.class);

                for (PotentialRow row : pot.getRows()) {

                    Map<String, String> responseMap = new HashMap<String, String>();

                    //create a map with <key,value> from the response
                    //since the api is a bullshit
                    for (PotentialFlObject fl : row.getFl()) {

                        responseMap.put(fl.getVal(), fl.getContent());
                        //System.out.println(fl.getVal() + " " + fl.getContent());
                    }

                    //now, the map should contain all pairs of key:value
                    Potential potential = null;
                    if (responseMap.containsKey("POTENTIALID")) {
                        potential = potentialRepository.findByExternalId(responseMap.get("POTENTIALID"));
                    }

                    if (potential == null) {
                        potential = new Potential();
                    }

                    potential.setPotentialName(responseMap.get("Potential Name"));
                    potential.setExternalId(responseMap.get("POTENTIALID"));

                    if (responseMap.containsKey("Electric Utility")) {
                        potential.setUtility(responseMap.get("Electric Utility"));
                    }
                    if (responseMap.containsKey("Rate Schedule")) {
                        potential.setRateSchedule(responseMap.get("Rate Schedule"));
                    }
                    if (responseMap.containsKey("Average Electric Bill")) {
                        potential.setAverageBill(responseMap.get("Average Electric Bill"));
                    }
                    if (responseMap.containsKey("Annual KWH")) {
                        potential.setAnualUsage(Double.valueOf(responseMap.get("Annual KWH")));
                    }

                    //System.out.println(potential.toString());

                    potentialRepository.save(potential);
                }

            } catch (JsonParseException e) {
                System.out.println("Error 1402: " + e.getMessage() + " " + e.getLocalizedMessage());
            } catch (IOException e) {
                System.out.println("Error 1202: " + e.getMessage() + " " + e.getLocalizedMessage());
            }
        }

        return null;
    }
}


