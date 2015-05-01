package catalyst.http.request.wrappers;

import catalyst.proposal.models.Proposal;
import catalyst.proposal.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rgb24 on 4/30/15.
 */
public class ProposalWrapper {

    @Autowired
    private ProposalRepository proposalRepository;

    private Proposal proposal;

    public Proposal getProposal() {
        return proposal;
    }

    public void setProposal(Proposal proposal) {
        this.proposal = proposal;
    }
}
