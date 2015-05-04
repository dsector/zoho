package catalyst.http.controllers;

import catalyst.crm.zoho.commands.GetPotentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rgb24 on 5/3/15.
 */

@RestController
@RequestMapping("/dev")

public class Dev {

    @Autowired
    GetPotentials getPotentials;

    @RequestMapping(value = "potentials", method = RequestMethod.GET)
    public String getPotentials(){
        getPotentials.execute();

        return "asdf";
    }
}
