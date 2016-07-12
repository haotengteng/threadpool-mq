package threadpool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by htt on 2016/7/12.
 */
@Controller
@RequestMapping("/thread")
public class ThreadManager {
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
