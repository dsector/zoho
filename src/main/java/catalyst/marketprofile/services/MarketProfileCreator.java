package catalyst.marketprofile.services;

import catalyst.marketprofile.models.Item;
import catalyst.marketprofile.models.Profile;
import catalyst.marketprofile.repositories.MarketProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketProfileCreator {

    @Autowired
    private MarketProfileRepository repo;

    /**
     * Creates a new empty profile
     *
     * @return created profile
     */
    public Profile createProfile()
    {
        return (Profile) this.repo.save(new Profile());
    }

    /**
     * Add an item to a market profile
     *
     * @param profileId Market profile id
     * @param item The item to add
     * @return the updated profile
     */
    public Profile addItem(String profileId, Item item)
    {
        Profile profile = this.repo.findOne(profileId);

        if (null == profile) {
            return null;
        }

        profile.getItems().add(item);

        repo.save(profile);

        return profile;
    }
}
