package catalyst.http.controllers;

import catalyst.potential.models.Potential;
import catalyst.potential.repositories.PotentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
public class PotentialController {

    @Autowired
    private PotentialRepository potentialRepository;

    @RequestMapping(value = "potentials", method = RequestMethod.GET)
    public Map<String, List<Potential>> getAllPotential() {
        Map<String, List<Potential>> map = new HashMap<>();

        List<Potential> potentials = potentialRepository.findAll();

        map.put("potentials", potentials);

        return map;
    }

    @RequestMapping(value = "potentials", method = RequestMethod.POST)
    public Potential createPotential(
            @RequestParam(value = "owner") String owner,
            @RequestParam(value = "probability") Integer probability

    ) {
        Potential potential = new Potential();
        potential.setOwner(owner);
        potential.setProbability(probability);

        return potentialRepository.save(potential);
    }


}
