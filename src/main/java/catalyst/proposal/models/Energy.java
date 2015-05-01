package catalyst.proposal.models;

/**
 * Created by rgb24 on 4/30/15.
 */
public class Energy {

    private Double existingPoolPump;

    private Double newPoolPump;

    private Double hoursUsed;

    private Double aerosolPercentage;

    private Double solarHoursUsed;


    public Double getExistingPoolPump() {
        return existingPoolPump;
    }

    public void setExistingPoolPump(Double existingPoolPump) {
        this.existingPoolPump = existingPoolPump;
    }

    public Double getNewPoolPump() {
        return newPoolPump;
    }

    public void setNewPoolPump(Double newPoolPump) {
        this.newPoolPump = newPoolPump;
    }



    public Double getAerosolPercentage() {
        return aerosolPercentage;
    }

    public void setAerosolPercentage(Double aerosolPercentage) {
        this.aerosolPercentage = aerosolPercentage;
    }


    public Double getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(Double hoursUsed) {
        this.hoursUsed = hoursUsed;
    }

    public Double getSolarHoursUsed() {
        return solarHoursUsed;
    }

    public void setSolarHoursUsed(Double solarHoursUsed) {
        this.solarHoursUsed = solarHoursUsed;
    }
}
