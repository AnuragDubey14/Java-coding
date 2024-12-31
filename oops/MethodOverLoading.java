class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}

public class MethodOverLoading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 numbers (int): " + calc.add(10, 20));        // Calls add(int, int)
        System.out.println("Sum of 3 numbers (int): " + calc.add(10, 20, 30));    // Calls add(int, int, int)
        System.out.println("Sum of 2 numbers (double): " + calc.add(10.5, 20.5)); // Calls add(double, double)

    }
}
