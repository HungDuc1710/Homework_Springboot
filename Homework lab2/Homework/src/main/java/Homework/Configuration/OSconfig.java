package Homework.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Homework.bean.OperationSystem;

@Configuration
public class OSconfig {
    @Bean(name = "normalOS")
    public OperationSystem normalOS() {
        return new OperationSystem("Normal OS");
    }

    @Bean(name = "IOS")
    public OperationSystem IOS() {
        return new OperationSystem("IOS Operation system");
    }

    @Bean(name = "androidOS")
    public OperationSystem androidOS() {
        return new OperationSystem("Android OS");
    }

    @Bean(name = "flutterOS")
    public OperationSystem flutterOS() {
        return new OperationSystem("Flutter OS");
    }
}
