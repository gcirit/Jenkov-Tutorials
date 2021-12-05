package enums;

public class Main {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        //Enum in a switch statement
        Level myVar2 = Level.HIGH;
        switch (myVar2){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + myVar2);
        }

        //Loop through enum
        for (Level myVariable: Level.values()){
            System.out.println(myVariable);
        }
    }
}
