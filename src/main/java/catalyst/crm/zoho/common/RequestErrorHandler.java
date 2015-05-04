package catalyst.crm.zoho.common;

import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by rgb24 on 5/3/15.
 */

@Component
public class RequestErrorHandler implements ResponseErrorHandler {
    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        //InputStream input = clientHttpResponse.getBody();

        //String response = IOUtils.toString(input, "UTF-8");

        //System.out.println(response);
        return false;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

    }
}
