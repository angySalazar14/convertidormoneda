import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tasas de cambio fijas
        double usdToEur = 0.92; // 1 USD = 0.92 EUR
        double usdToMxn = 20.0; // 1 USD = 20 MXN
        double eurToUsd = 1.09; // 1 EUR = 1.09 USD
        double eurToMxn = 21.74; // 1 EUR = 21.74 MXN
        double mxnToUsd = 0.05; // 1 MXN = 0.05 USD
        double mxnToEur = 0.046; // 1 MXN = 0.046 EUR
        
        System.out.println("Bienvenido al conversor de monedas.");
        System.out.println("1. USD a EUR");
        System.out.println("2. USD a MXN");
        System.out.println("3. EUR a USD");
        System.out.println("4. EUR a MXN");
        System.out.println("5. MXN a USD");
        System.out.println("6. MXN a EUR");
        System.out.print("Elige una opción (1-6): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Ingresa la cantidad a convertir: ");
        double amount = scanner.nextDouble();

        switch (choice) {
            case 1:
                convertCurrency(amount, usdToEur, "USD", "EUR");
                break;
            case 2:
                convertCurrency(amount, usdToMxn, "USD", "MXN");
                break;
            case 3:
                convertCurrency(amount, eurToUsd, "EUR", "USD");
                break;
            case 4:
                convertCurrency(amount, eurToMxn, "EUR", "MXN");
                break;
            case 5:
                convertCurrency(amount, mxnToUsd, "MXN", "USD");
                break;
            case 6:
                convertCurrency(amount, mxnToEur, "MXN", "EUR");
                break;
            default:
                System.out.println("Opción inválida. Por favor selecciona un número entre 1 y 6.");
                break;
        }
        
        scanner.close();
    }
    
    public static void convertCurrency(double amount, double rate, String fromCurrency, String toCurrency) {
        double converted = amount * rate;
        System.out.printf("%.2f %s son %.2f %s\n", amount, fromCurrency, converted, toCurrency);
    }
}
