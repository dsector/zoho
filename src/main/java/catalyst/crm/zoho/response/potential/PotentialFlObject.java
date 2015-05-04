package catalyst.crm.zoho.response.potential;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by rgb24 on 5/4/15.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PotentialFlObject {

    private String content;

    private String val;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
