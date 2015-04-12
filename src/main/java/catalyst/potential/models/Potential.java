package catalyst.potential.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

/**
 * Created by rgb24 on 4/11/15.
 */
public class Potential {

    @Id
    private String id;

    private String owner;

    private Integer probability;

    private Float contractAmount;

    private Float contract;

    @DBRef
    private Stage stage;

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


    public Float getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Float contractAmount) {
        this.contractAmount = contractAmount;
    }

    public Float getContract() {
        return contract;
    }

    public void setContract(Float contract) {
        this.contract = contract;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
