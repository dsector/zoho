package catalyst.crm.zoho;

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

    @Scheduled(fixedDelay = 50000)
    public void syncWithZoho(){
        //System.out.println("adqwdqwdqwd");
    }
}
