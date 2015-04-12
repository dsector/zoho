package catalyst.potential.services;

import catalyst.common.AppService;
import catalyst.potential.models.Potential;
import catalyst.potential.repositories.PotentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rgb24 on 4/12/15.
 */
@Service
public class PotentialCreator implements AppService<Potential, Potential> {

    @Autowired
    private PotentialRepository potentialRepository;

    @Override
    public Potential execute(Potential potential) {

        //todo: validate

        //todo: fire events

        return potentialRepository.save(potential);
    }
}
