package catalyst.potential.repositories;

import catalyst.potential.models.Stage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rgb24 on 4/12/15.
 */
public interface StageRepository extends MongoRepository<Stage, String> {
}
