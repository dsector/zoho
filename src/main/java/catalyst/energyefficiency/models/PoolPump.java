package catalyst.energyefficiency.models;

/**
 * Created by rgb24 on 4/27/15.
 */
public class PoolPump implements EnergyType {

    private double existingDraw;

    private double newDraw;

    private int hoursUsed;

    public double getExistingDraw() {
        return existingDraw;
    }

    public void setExistingDraw(double existingDraw) {
        this.existingDraw = existingDraw;
    }

    public double getNewDraw() {
        return newDraw;
    }

    public void setNewDraw(double newDraw) {
        this.newDraw = newDraw;
    }

    public int getHoursUsed() {
        return hoursUsed;
    }

    public void setHoursUsed(int hoursUsed) {
        this.hoursUsed = hoursUsed;
    }
}
