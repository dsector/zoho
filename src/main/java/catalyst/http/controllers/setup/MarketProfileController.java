package catalyst.http.controllers.setup;

import catalyst.marketprofile.models.Item;
import catalyst.marketprofile.models.Profile;
import catalyst.marketprofile.repositories.MarketProfileRepository;
import catalyst.marketprofile.services.MarketProfileCreator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    private String modelKey = "marketProfile/profile";
    private String modelKeyPlural = "marketProfile/profiles";

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
        Profile profile = profileMap.get(modelKey);

        for (Item i : profile.getItems())
        {
            if (null == i.getId()) {
                i.setId(new ObjectId().toString());
            }
        }

        Profile p = profileRepository.save(profile);
        HashMap<String, Profile> map = new HashMap<>();
        map.put(modelKey, p);

        return map;
    }

    @RequestMapping(value="{id}", method = RequestMethod.PUT)
    public Map<String, Profile> update(@RequestBody Map<String, Profile> profileMap, @PathVariable("id") String id) {
        profileMap.get(modelKey).setId(id);
        return this.create(profileMap);
    }

    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        this.profileRepository.delete(id);
    }
}
