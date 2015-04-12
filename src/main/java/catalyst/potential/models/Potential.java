package catalyst.potential.models;

import org.springframework.data.annotation.Id;

/**
 * Created by rgb24 on 4/11/15.
 */
public class Potential {

    @Id
    private String id;

    public String owner;

    public Integer probability;

    public String getId() {
        return id;
    }

    public Integer getProbability() {
        return probability;
    }

    public void setProbability(Integer probability) {
        this.probability = probability;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }



}
