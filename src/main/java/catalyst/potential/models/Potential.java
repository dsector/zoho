package catalyst.potential.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by rgb24 on 4/11/15.
 */
@Document
public class Potential {

    @Id
    private String _id;

    private String potentialName;

    private String owner;

    private Integer probability;

    private Float contractAmount;

    private Float contract;

    private Date closingDate;

    @DBRef
    private Stage stage;

    public String getId() {
        return _id;
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

    public String getPotentialName() {
        return potentialName;
    }

    public void setPotentialName(String potentialName) {
        this.potentialName = potentialName;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }
}
