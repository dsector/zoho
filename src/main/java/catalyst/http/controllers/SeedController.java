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

import java.text.DecimalFormat;
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

        DecimalFormat df = new DecimalFormat("#.##");

        for(counter=0; counter<AM_20; counter++){
            potential = new Potential();
            potential.setRateSchedule(rand.nextInt(100));
            potential.setAverageBill(Double.valueOf(df.format(rand.nextDouble() * 10)));
            potential.setUtility(Double.valueOf(df.format(rand.nextDouble() * 10)));
            potential.setAnualUsage(Double.valueOf(df.format(rand.nextDouble() * 10)));
            potential.setPotentialName(RandomStringUtils.randomAlphabetic((9)));
            potential.setAddress(RandomStringUtils.randomAlphabetic(6));

            //potential = potentialRepository.save(potential);

            potentialRepository.save(potential);
        }
    }
}
