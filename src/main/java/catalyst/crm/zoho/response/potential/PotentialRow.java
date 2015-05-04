package catalyst.crm.zoho.response.potential;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by rgb24 on 5/3/15.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PotentialRow {

    private String no;

    @JsonProperty("FL")
    private List<PotentialFlObject> fl;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public List<PotentialFlObject> getFl() {
        return fl;
    }

    public void setFl(List<PotentialFlObject> fl) {
        this.fl = fl;
    }
}
