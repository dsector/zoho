package catalyst.http.controllers;

import catalyst.http.request.wrappers.PotentialWrapper;
import catalyst.potential.models.Potential;
import catalyst.potential.models.UtilityUsage;
import catalyst.potential.repositories.PotentialRepository;
import catalyst.potential.services.PotentialCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
public class PotentialController {

    @Autowired
    private PotentialRepository potentialRepository;

    @Autowired
    private PotentialCreator potentialCreator;

    @RequestMapping(value = "potentials", method = RequestMethod.GET)
    public Map<String, List<Potential>> getAllPotential() {
        Map<String, List<Potential>> map = new HashMap<>();
        List<Potential> potentials = potentialRepository.findAll();

        map.put("potentials", potentials);

        return map;
    }

    @RequestMapping(value = "potentials", method = RequestMethod.POST)
    public Potential createPotential(
            @RequestParam(value = "probability") String probability

    ) {
        Potential potential = new Potential();
        potential.setRateSchedule(probability);

        return potentialCreator.execute(potential);
    }

    @RequestMapping(value = "potentials/{id}", method = RequestMethod.PUT)
    public Map<String, Potential> updatePotential(@PathVariable("id") String id, @RequestBody String requestBody) {
        Map<String, Potential> map = new HashMap();

        /*
        Potential potential = potentialWrapper.getPotential();
        potential.setId(id);

        UtilityUsage utilityUsage = potential.getUtiltyUsage();

        if(utilityUsage == null){
            System.out.println("shit null");
        }

        //System.out.println(resp);

        potentialRepository.save(potential);
        */

        ObjectMapper mapper = new ObjectMapper();

        //JsonNode node = null;
        PotentialWrapper potentialWrapper = null;

        System.out.println(requestBody);

        try {
            potentialWrapper = mapper.readValue(requestBody, PotentialWrapper.class);
        } catch (IOException e) {
            System.out.println("Exception here" + e.getMessage());
        }

        Potential potential = null;

        if (potentialWrapper != null) {
            potential = potentialWrapper.getPotential();
            potential.setId(id);
            potentialRepository.save(potential);
        } else {
            System.out.println("it is fucking null");
        }

        map.put("potential", potential);

        return map;
    }


    @RequestMapping(value = "potentials/{id}", method = RequestMethod.GET)
    public Map<String, Potential> findOne(@PathVariable("id") String id) {
        Map<String, Potential> map = new HashMap();

        Potential potential = potentialRepository.findOne(id);
        if (potential == null) {

        }

        map.put("potential", potential);

        return map;
    }

    @RequestMapping(value = "auth", method = RequestMethod.GET)
    public String confidential() {
        return "confidential info";
    }


}
