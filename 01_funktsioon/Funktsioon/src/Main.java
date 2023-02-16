public class Main {
    public static void main(String[] args) {

    TemperatureConversionTable(20,40);

    }
    
    private static void TemperatureConversionTable(int CelsiusMin, int CelsiusMax) {
        while (CelsiusMin <= CelsiusMax) {
            double Fahrenheit = CelsiusMin*1.8+32;
            String line = "Celsius: " + CelsiusMin + " -> Fahrenheit: " + String.format("%.2f", Fahrenheit);
            System.out.print(line);
            System.out.println(" ");
            CelsiusMin++;
        }
    }
}