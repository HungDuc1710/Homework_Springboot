package Homework.bean;

import Homework.interfaces.Panel;

public class LEDpanel implements Panel {
    @Override
    public String panel() {
        return "LED panel";
    }
}
