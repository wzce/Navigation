package cn.edu.nju.software.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dalec
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {
    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
