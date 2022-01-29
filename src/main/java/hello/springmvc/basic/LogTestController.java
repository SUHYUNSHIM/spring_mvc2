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
        System.out.println("name = "+name); //특정 로그만 남기고 싶기 때문에 sysout을 쓰지 말자.

        log.trace("trace logs={}",name);
        log.debug("info logs={}",name);
        log.warn("warn logs={}",name);
        log.info("info log={}",name);
        log.error("error logs={}",name); //아래로 갈 수록 level이 높아지는 것

        log.debug("String concat log=" +name);
        return "ok";
    }
}
