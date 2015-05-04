package catalyst.crm.zoho.common;

import catalyst.crm.zoho.response.potential.PotentialRow;
import catalyst.crm.zoho.response.potential.PotentialsObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by rgb24 on 5/3/15.
 */

@Service
public class RequestExecutor {

    @Autowired
    private RequestErrorHandler requestErrorHandler;

    static Logger log = Logger.getLogger(RequestExecutor.class.getName());

    public JsonNode execute(UriComponentsBuilder uriBuilder, Response response) {
        RestTemplate restTemplate = new RestTemplate();


        //List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        //MappingJackson2HttpMessageConverter map = new MappingJackson2HttpMessageConverter();

        //messageConverters.add(map);

        restTemplate.setErrorHandler(requestErrorHandler);

        //restTemplate.setMessageConverters(messageConverters);

        //sss
        log.info("HTTP request to: " + uriBuilder.toUriString());

        String json = restTemplate.getForObject(uriBuilder.toUriString(), String.class);

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node = null;

        try {
            node = mapper.readValue(json, JsonNode.class);
        } catch (Exception e) {
            System.out.println("shit error");
        }



        /*
        if (node == null) {
            System.out.println("------- node is null");
        } else {

        }
        */

        return node;

    }
}
