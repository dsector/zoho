package catalyst.energyefficiency.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rgb24 on 4/27/15.
 */
@Document
public class Energy {
    @Id
    private String id;

    private Aerosol aerosol;

    private PoolPump poolPump;

    private SolarWater solarWater;

    public String getId() {
        return id;
    }

    public Aerosol getAerosol() {
        return aerosol;
    }

    public void setAerosol(Aerosol aerosol) {
        this.aerosol = aerosol;
    }

    public PoolPump getPoolPump() {
        return poolPump;
    }

    public void setPoolPump(PoolPump poolPump) {
        this.poolPump = poolPump;
    }

    public SolarWater getSolarWater() {
        return solarWater;
    }

    public void setSolarWater(SolarWater solarWater) {
        this.solarWater = solarWater;
    }
}
