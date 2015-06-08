package catalyst.http.controllers.setup;

import catalyst.http.request.wrappers.marketprofile.ProfileWrapper;
import catalyst.marketprofile.models.Profile;
import catalyst.marketprofile.repositories.MarketProfileRepository;
import catalyst.marketprofile.services.MarketProfileCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/1.0/marketProfile/profiles")
public class MarketProfileController {

    @Autowired
    private MarketProfileCreator profileCreator;

    @Autowired
    private MarketProfileRepository profileRepository;


    @RequestMapping(value = "", method = RequestMethod.GET)
    public Map<String, List<Profile>> getAll()
    {
        List<Profile> profiles = this.profileRepository.findAll();

        HashMap<String, List<Profile>> map = new HashMap<>();
        map.put("marketProfile/profiles", profiles);

        return map;
    }


    @RequestMapping(method = RequestMethod.POST)
    public  Map<String, Profile> create(@RequestBody Map<String, Profile> profileMap) {
        Profile p = profileRepository.save(profileMap.get("marketProfile/profile"));

        HashMap<String, Profile> map = new HashMap<>();
        map.put("marketProfile/profile", p);

        return map;
    }
}
