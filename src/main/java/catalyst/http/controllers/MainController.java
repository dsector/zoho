package catalyst.http.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by rgb on 4/9/15.
 */

@RestController
@RequestMapping("/api/1.0/")
@ResponseBody
public class MainController {

    @RequestMapping("/")
    public String index(){
       return "Spring is awesome!";
    }

    @RequestMapping("/test")
    public void show(){

    }
}
