package Homework.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import Homework.bean.LEDpanel;
import Homework.bean.OLEDpanel;

@Configuration
public class Panelconfig {
    @Primary
    @Bean
    public LEDpanel ledpanel() {
        return new LEDpanel();
    }
    @Bean
    public OLEDpanel oledpanel() {
        return new OLEDpanel();
    }
}
