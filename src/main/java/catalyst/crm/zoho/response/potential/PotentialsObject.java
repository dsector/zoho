package catalyst.crm.zoho.response.potential;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.List;

/**
 * Created by rgb24 on 5/3/15.
 */

@JsonRootName(value = "Potentials")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PotentialsObject {

    @JsonProperty("row")
    public List<PotentialRow> rows;

    public List<PotentialRow> getRows() {
        return rows;
    }

    public void setRows(List<PotentialRow> rows) {
        this.rows = rows;
    }
}
