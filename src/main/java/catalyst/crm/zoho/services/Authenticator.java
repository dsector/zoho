package catalyst.crm.zoho.services;

import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by rgb24 on 5/3/15.
 */
@Service
public class Authenticator {

    private static String authToken;

    public UriComponentsBuilder authenticate(UriComponentsBuilder builder){

        builder.queryParam("authtoken", "4ad4710df50692fb762381dace410626");

        return builder;
    }
}
