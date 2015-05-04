package catalyst.crm.zoho.common;

/**
 * Created by rgb24 on 5/3/15.
 */
public class Response<ResponseObject> {

    protected ResponseObject responseObject;

    public ResponseObject getResponseObject() {
        return responseObject;
    }

    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }
}
