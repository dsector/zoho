package catalyst.marketprofile.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Item {

    @Id
    private String id;

    private String name;

    private Float federal;

    private Float state;

    private Float utility;

    private Float tax;

    private Float rebates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getFederal() {
        return federal;
    }

    public void setFederal(Float federal) {
        this.federal = federal;
    }

    public Float getState() {
        return state;
    }

    public void setState(Float state) {
        this.state = state;
    }

    public Float getUtility() {
        return utility;
    }

    public void setUtility(Float utility) {
        this.utility = utility;
    }

    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public Float getRebates() {
        return rebates;
    }

    public void setRebates(Float rebates) {
        this.rebates = rebates;
    }
}
