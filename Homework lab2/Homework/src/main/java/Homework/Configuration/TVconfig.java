package Homework.Configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Homework.bean.LEDpanel;
import Homework.bean.OperationSystem;
import Homework.bean.Television;

@Configuration
public class TVconfig {
    @Autowired
    private ApplicationContext context;

    @Value("${systemType}")
    private String systemType;

    @Value("${panelType}")
    private String panelType;

    @Bean
    public Television tv() {
        OperationSystem operationSystem;
        LEDpanel panel = new LEDpanel();
        
        switch (systemType) {
        case "normal":
            operationSystem = (OperationSystem) context.getBean("normalOS");
            break;
        case "ios":
            operationSystem = (OperationSystem) context.getBean("IOS");
            break;
        case "android":
            operationSystem = (OperationSystem) context.getBean("androidOS");
            break;
        case "flutter":
            operationSystem = (OperationSystem) context.getBean("flutterOS");
            break;
        default:
            operationSystem = (OperationSystem) context.getBean("normalOS");
        }

        // switch (panelType) {
        // case "led":
        //     panel = new LEDpanel();
        //     break;
        // case "oled":
            
        // }

        return new Television(operationSystem, panel);
    }
    
}
