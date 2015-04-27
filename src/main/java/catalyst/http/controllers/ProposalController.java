package catalyst.http.controllers;

import catalyst.proposal.models.Proposal;
import catalyst.proposal.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rgb24 on 4/27/15.
 */
@RestController
@RequestMapping("/api/1.0")
public class ProposalController {

    @Autowired
    ProposalRepository proposalRepository;

    @RequestMapping(value = "proposals", method = RequestMethod.POST)
    public Map<String, Proposal> createProposal() {

        Map<String, Proposal> map = new HashMap<>();
        Proposal proposal = new Proposal();

        proposalRepository.save(proposal);

        map.put("proposals", proposal);

        return map;
    }

    @RequestMapping(value = "proposals/{id}", method = RequestMethod.PUT)
    public Map<String, Proposal> updateProposal(@PathVariable("id") String id) {
        Map<String, Proposal> map = new HashMap<>();
        Proposal proposal = proposalRepository.findOne(id);

        map.put("proposals", proposal);
        return map;
    }
}
