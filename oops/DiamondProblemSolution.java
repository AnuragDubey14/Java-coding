interface Printer {
    default void start() {
        System.out.println("Printer starting...");
    }
}

interface Scanner {
    default void start() {
        System.out.println("Scanner starting...");
    }
}

class AllInOneMachine implements Printer, Scanner {
//    public void start(){
//        Printer.super.start();
//    }

    public void start() {
        Scanner.super.start();
    }

//    @Override
//    public void start() {
//        Printer.super.start();
//        Scanner.super.start();
//        System.out.println("All-in-One Machine ready.");
//    }
}





public class DiamondProblemSolution {
    public static void main(String[] args) {
    AllInOneMachine obj=new AllInOneMachine();
    obj.start();
    }
}
