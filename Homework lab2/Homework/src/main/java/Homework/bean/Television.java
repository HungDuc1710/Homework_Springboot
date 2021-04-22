package Homework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import Homework.interfaces.Panel;

public class Television {
    private OperationSystem os;

    @Autowired
    @Qualifier("ledpanel")
    private Panel panel;

    public Television(OperationSystem os, Panel panel) {
        this.os = os;
        this.panel = panel;   }
    
    @Override
    public String toString() {
        
        return "TV [panel =" + panel.panel() + ", system =" + os + "]";

    }
    
}
