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
    private String id;

    private String potentialName;

    private String address;

    private Integer rateSchedule;

    private Double averageBill;

    private Double anualUsage;

    private Double utility;

    public void setId(String id) {
        this.id=id;
    }

    public String getId(){
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


    public Integer getRateSchedule() {
        return rateSchedule;
    }

    public void setRateSchedule(Integer rateSchedule) {
        this.rateSchedule = rateSchedule;
    }

    public Double getAverageBill() {
        return averageBill;
    }

    public void setAverageBill(Double averageBill) {
        this.averageBill = averageBill;
    }

    public Double getAnualUsage() {
        return anualUsage;
    }

    public void setAnualUsage(Double anualUsage) {
        this.anualUsage = anualUsage;
    }

    public Double getUtility() {
        return utility;
    }

    public void setUtility(Double utility) {
        this.utility = utility;
    }

    public String toString(){
        return "id: " + getId() + " name: " + getPotentialName() + " address: " + getAddress();
    }
}
