package catalyst.crm.zoho.common;


import org.springframework.web.util.UriComponentsBuilder;

public class Request {


    protected UriComponentsBuilder builder;

    public static String base = "https://crm.zoho.com/";

    public static String request = "/crm/private/json/";

    protected String entity = "";

    protected String query = "/getRecords";

    protected String auth = "?authtoken=7d987658943g4j09h43dd0b167dda34b&scope=crmapi";

    protected boolean entitySetted = false;

    public Request() {
        builder = UriComponentsBuilder.fromHttpUrl(base);
    }

    public UriComponentsBuilder builder() {
        return builder;
    }

    public String url() {

        builder.path(request);

        builder.path(entity);

        builder.path(query);

        builder.queryParam("authtoken", "7d987658943g4j09h43dd0b167dda34b");
        builder.queryParam("scope", "crmapi");

        return builder.toUriString();
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        if(!entitySetted){
            builder().path(entity);
            entitySetted = true;
        }
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
}
