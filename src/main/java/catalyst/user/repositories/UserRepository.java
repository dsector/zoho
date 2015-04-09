package catalyst.user.repositories;

import catalyst.user.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * Created by rgb on 4/9/15.
 */
@Service
public interface UserRepository extends MongoRepository<User, String> {
//    public ArrayList<User> all();
}
