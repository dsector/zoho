package catalyst.potential.services;

import catalyst.common.AppService;
import catalyst.potential.models.Stage;
import catalyst.potential.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rgb24 on 4/12/15.
 */
@Service
public class StageCreator implements AppService<Stage, Stage> {

    @Autowired
    private StageRepository stageRepository;

    @Override
    public Stage execute(Stage stage) {
        //todo: validate

        //todo: fire events
        return stageRepository.save(stage);
    }
}
