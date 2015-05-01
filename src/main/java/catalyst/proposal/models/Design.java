package catalyst.proposal.models;

/**
 * Created by rgb24 on 4/30/15.
 */
public class Design {

    private Double systemSize;

    private Double systemProduction;

    private Double pricePerWatt;

    public Double getSystemSize() {
        return systemSize;
    }

    public void setSystemSize(Double systemSize) {
        this.systemSize = systemSize;
    }

    public Double getSystemProduction() {
        return systemProduction;
    }

    public void setSystemProduction(Double systemProduction) {
        this.systemProduction = systemProduction;
    }

    public Double getPricePerWatt() {
        return pricePerWatt;
    }

    public void setPricePerWatt(Double pricePerWatt) {
        this.pricePerWatt = pricePerWatt;
    }
}
