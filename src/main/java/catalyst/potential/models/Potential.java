package catalyst.potential.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rgb24 on 4/11/15.
 */
@Document
public class Potential {

    @Id
    private String id;

    private String externalId;

    private String potentialName;

    private String address;

    private String rateSchedule;

    private String averageBill;

    private Double anualUsage;

    private String utility;

    @JsonProperty("utilityUsage")
    private UtilityUsage utilityUsage;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getPotentialName() {
        return potentialName;
    }

    public void setPotentialName(String potentialName) {
        this.potentialName = potentialName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String getRateSchedule() {
        return rateSchedule;
    }

    public void setRateSchedule(String rateSchedule) {
        this.rateSchedule = rateSchedule;
    }

    public String getAverageBill() {
        return averageBill;
    }

    public void setAverageBill(String averageBill) {
        this.averageBill = averageBill;
    }

    public Double getAnualUsage() {
        return anualUsage;
    }

    public void setAnualUsage(Double anualUsage) {
        this.anualUsage = anualUsage;
    }

    public String getUtility() {
        return utility;
    }

    public void setUtility(String utility) {
        this.utility = utility;
    }

    public String toString() {
        return "id: " + id + " name: " + potentialName + " address: " + address + " " + rateSchedule + " " + anualUsage;
    }


    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }


    public UtilityUsage getUtiltyUsage() {
        return utilityUsage;
    }

    public void setUtiltyUsage(UtilityUsage utilityUsage) {
        this.utilityUsage = utilityUsage;
    }
}
