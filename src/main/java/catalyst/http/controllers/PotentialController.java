package catalyst.http.controllers;

import catalyst.potential.models.Potential;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
public class PotentialController {

    @RequestMapping(value = "potential", method = RequestMethod.GET)
    public String getAllPotential() {
        return "private data here!";
    }

    @RequestMapping(value = "potential", method = RequestMethod.POST)
    public Potential createPotential(
            @RequestParam(value = "owner") String owner,
            @RequestParam(value = "probability") Integer probability

    ) {
        return null;
    }


}
