package catalyst.http.controllers.potential;

import catalyst.potential.models.Stage;
import catalyst.potential.repositories.StageRepository;
import catalyst.potential.services.StageCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rgb24 on 4/12/15.
 */

@RestController
@RequestMapping("api/1.0/potentials/")
public class StageController {

    @Autowired
    private StageRepository stageRepository;

    @Autowired
    private StageCreator stageCreator;

    @RequestMapping(value = "stages", method = RequestMethod.GET)
    public List<Stage> getAll(){
        return stageRepository.findAll();
    }

    @RequestMapping(value="stages", method = RequestMethod.POST)
    public Stage create(@RequestParam("name") String name){

        Stage stage = new Stage();

        stage.setName(name);

        return stageCreator.execute(stage);
    }

    @RequestMapping(value="/stages/{id}", method=RequestMethod.GET)
    public Stage findOne(@PathVariable("id") String id){
        Stage stage = stageRepository.findOne(id);
        if(stage == null){
            //throw 404 not found
        }
        return stage;
    }
}
