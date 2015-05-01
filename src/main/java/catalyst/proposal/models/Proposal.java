package catalyst.proposal.models;

import catalyst.potential.models.Potential;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rgb24 on 4/27/15.
 */

@Document
public class Proposal {

    @Id
    private String id;

    private String sample;

    @DBRef
    private Potential potential;

    private Design design;

    private Energy energy;

    public String getSample() {
        return sample;
    }

    public void setSample(String sample) {
        this.sample = sample;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Potential getPotential() {
        return potential;
    }

    public void setPotential(Potential potential) {
        this.potential = potential;
    }

    public Energy getEnergy() {
        return energy;
    }

    public void setEnergy(Energy energy) {
        this.energy = energy;
    }

    public Design getDesign() {
        return design;
    }

    public void setDesign(Design design) {
        this.design = design;
    }
}
