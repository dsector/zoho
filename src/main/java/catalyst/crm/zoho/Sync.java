package catalyst.crm.zoho;

import catalyst.crm.zoho.commands.GetPotentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by rgb on 4/9/15.
 */

@Configuration
@EnableAsync
@EnableScheduling
public class Sync {

    @Autowired
    GetPotentials getPotentials;

    @Scheduled(fixedDelay = 1200000)
    public void syncWithZoho(){
        getPotentials.execute();
    }
}
