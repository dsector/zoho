package catalyst.proposal.repositories;

import catalyst.proposal.models.Proposal;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by rgb24 on 4/27/15.
 */

public interface ProposalRepository extends MongoRepository<Proposal, String>{
}
