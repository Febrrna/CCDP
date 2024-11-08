public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Contoh penggunaan metode kalkulator
        System.out.println("Penjumlahan: " + calculator.add(5, 3));
        System.out.println("Pengurangan: " + calculator.subtract(5, 3));
        System.out.println("Perkalian: " + calculator.multiply(5, 3));
        System.out.println("Pembagian: " + calculator.divide(5, 3));
    }
}