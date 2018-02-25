package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingke
 * @Description:
 * @Date: create in 16:50 2018/2/24
 */
@RestController
public class HelloController {

    @RequestMapping(value = "sayhello", method = RequestMethod.GET)
    public String sayhello() {
        return "Hello SpringBoot !";
    }

}