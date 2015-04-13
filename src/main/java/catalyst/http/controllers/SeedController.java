package catalyst.http.controllers;

import catalyst.potential.models.Potential;
import catalyst.potential.models.Stage;
import catalyst.potential.repositories.PotentialRepository;
import catalyst.potential.repositories.StageRepository;
import catalyst.potential.services.PotentialCreator;
import catalyst.potential.services.StageCreator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by rgb24 on 4/12/15.
 */

@RestController
@RequestMapping("/development")
public class SeedController {

    protected static final int AM_20 = 20;

    protected int counter = 0;

    @Autowired
    private StageRepository stageRepository;

    @Autowired
    private PotentialRepository potentialRepository;


    @RequestMapping("seed")
    public String seed(){

        seedStage();
        seedPotentials();

        return "ok";
    }

    private void seedStage(){

        Stage stage;

        String name;

        for(counter=0; counter<AM_20; counter++){
            stage = new Stage();
            stage.setName(RandomStringUtils.randomAlphanumeric(10));

            stageRepository.save(stage);
        }
    }

    private void seedPotentials(){
        Potential potential;

        Random rand = new Random();

        List<Stage> stages = new ArrayList<Stage>();
        stages = stageRepository.findAll();

        Stage stage;

        for(counter=0; counter<AM_20; counter++){
            stage = stages.get(rand.nextInt(20));

            potential = new Potential();
            potential.setOwner(RandomStringUtils.randomAlphanumeric(7));
            potential.setProbability(rand.nextInt(100));
            potential.setContract(rand.nextFloat() * 10);
            potential.setContractAmount(rand.nextFloat() * 10);
            potential.setPotentialName(RandomStringUtils.randomAlphabetic((9)));
            potential.setClosingDate(new Date());

            //potential = potentialRepository.save(potential);

            potential.setStage(stage);

            potentialRepository.save(potential);
        }
    }
}
