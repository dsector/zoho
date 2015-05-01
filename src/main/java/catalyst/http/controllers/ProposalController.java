package catalyst.http.controllers;

import catalyst.http.request.wrappers.ProposalWrapper;
import catalyst.proposal.models.Proposal;
import catalyst.proposal.repositories.ProposalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public Map<String, Proposal> createProposal(@RequestBody ProposalWrapper proposalWrapper) {
        Map<String, Proposal> map = new HashMap<>();
        //Proposal proposal = proposalRepository.findOne(id);

        Proposal proposal = proposalWrapper.getProposal();

        //System.out.println(proposalWrapper.getProposal().getPotential().toString());
        //System.out.println(proposalWrapper.getProposal().getId());
        //save the current proposal
        proposalRepository.save(proposal);

        map.put("proposals", proposal);
        return map;
    }

    @RequestMapping(value = "proposals", method = RequestMethod.GET)
    public Map<String, List<Proposal>> getAllProposals() {
        Map<String, List<Proposal>> map = new HashMap<>();

        List<Proposal> proposals = new ArrayList<Proposal>();

        proposals = proposalRepository.findAll();

        map.put("proposals", proposals);

        return map;
    }

    @RequestMapping(value = "proposals/{id}", method = RequestMethod.GET)
    public Map<String, Proposal> getProposal(@PathVariable("id") String id) {
        Map<String, Proposal> map = new HashMap<>();

        map.put("proposal", proposalRepository.findOne(id));

        return map;
    }

    @RequestMapping(value = "proposals/{id}", method = RequestMethod.PUT)
    public Map<String, Proposal> updateProposal(@PathVariable("id") String id, @RequestBody ProposalWrapper proposalWrapper) {
        Map<String, Proposal> map = new HashMap<>();
        //Proposal proposal = proposalRepository.findOne(id);

        Proposal proposal = proposalWrapper.getProposal();

        proposal.setId(id);

        //System.out.println(proposalWrapper.getProposal().getPotential().toString());
        //System.out.println(proposalWrapper.getProposal().getId());
        //save the current proposal
        proposalRepository.save(proposal);

        map.put("proposals", proposal);
        return map;
    }
}
