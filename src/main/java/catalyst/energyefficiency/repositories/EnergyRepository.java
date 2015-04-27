package catalyst.energyefficiency.repositories;

import catalyst.energyefficiency.models.Energy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rgb24 on 4/27/15.
 */

@Repository
public interface EnergyRepository extends MongoRepository<Energy, String>{
}
