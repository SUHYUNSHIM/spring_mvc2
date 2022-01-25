package hello.springmvc.basic;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {
    private final Logger log = LoggerFactory.getLogger(getClass()); //LogTestController.class

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "spring";
        System.out.println("name = "+name);
        log.info("info log={}",name);

        return "ok";
    }
}
