package Homework.bean;

public class OperationSystem {
    private String system;

    public String getSystem() {
        return system;
    }

    public OperationSystem(String system) {
        this.system = system;
    }

    @Override
    public String toString() {
        return system;
    }
    
}
