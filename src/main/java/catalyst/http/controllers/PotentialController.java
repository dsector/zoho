package catalyst.http.controllers;

import catalyst.potential.models.Potential;
import catalyst.potential.repositories.PotentialRepository;
import catalyst.potential.services.PotentialCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private PotentialCreator potentialCreator;

    @RequestMapping(value = "potentials", method = RequestMethod.GET)
    public Map<String, List<Potential>> getAllPotential() {
        Map<String, List<Potential>> map = new HashMap<>();
        List<Potential> potentials = potentialRepository.findAll();

        map.put("potentials", potentials);

        return map;
    }

    @RequestMapping(value = "potentials", method = RequestMethod.POST)
    public Potential createPotential(
            @RequestParam(value = "probability") String probability

    ) {
        Potential potential = new Potential();
        potential.setRateSchedule(probability);

        return potentialCreator.execute(potential);
    }


    @RequestMapping(value = "potentials/{id}", method = RequestMethod.GET)
    public Map<String, Potential> findOne(@PathVariable("id") String id){
        Map<String, Potential> map = new HashMap();

        Potential potential = potentialRepository.findOne(id);
        if(potential == null){

        }

        map.put("potential", potential);

        return map;
    }

    @RequestMapping(value="auth", method=RequestMethod.GET)
    public String confidential(){
        return "confidential info";
    }



}
