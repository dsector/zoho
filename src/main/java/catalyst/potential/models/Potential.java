package catalyst.potential.models;

/**
 * Created by rgb24 on 4/11/15.
 */
public class Potential {

    public String owner;

    public Integer probability;

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
