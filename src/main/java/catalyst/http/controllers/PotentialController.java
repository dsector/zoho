package catalyst.http.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
public class PotentialController {

    @RequestMapping("potential")
    public String getAllPotential(){
        return "private data here!";
    }
}
