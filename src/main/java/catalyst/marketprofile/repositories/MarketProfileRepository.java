package catalyst.marketprofile.repositories;

import catalyst.marketprofile.models.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MarketProfileRepository extends MongoRepository<Profile, String> {

}
