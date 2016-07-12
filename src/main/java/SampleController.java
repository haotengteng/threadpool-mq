import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;

/**
 * Created by htt on 2016/7/12.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
