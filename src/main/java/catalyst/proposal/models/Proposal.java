package catalyst.proposal.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rgb24 on 4/27/15.
 */

@Document
public class Proposal {

    @Id
    private String id;

    private String sample;

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getId() {
        return id;
    }
}
