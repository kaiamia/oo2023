public class Main {
    public static void main(String[] args) {

        //CelsiusConversionTable(20,40);

        //FahrenheitConversionTable(30, 45);

        Grade(50,35);
    }

    private static void CelsiusConversionTable(int CelsiusMin, int CelsiusMax) {
        while (CelsiusMin <= CelsiusMax) {
            double Fahrenheit = CelsiusMin*1.8+32;
            String line = "Celsius: " + CelsiusMin + " -> Fahrenheit: " + String.format("%.2f", Fahrenheit);
            System.out.println(line);
            CelsiusMin++;
        }
    }

    private static void FahrenheitConversionTable(int FahrenheitMin, int FahrenheitMax) {
        while (FahrenheitMin <= FahrenheitMax) {
            double Celsius = (FahrenheitMin-32)*0.5556;
            String line = "Fahrenheit: " + FahrenheitMin + " -> Celsius: " + String.format("%.2f", Celsius);
            System.out.println(line);
            FahrenheitMin++;
        }
    }
    private static void Grade(int MaxPoints, double StudentPoints){
        double percentage = StudentPoints*100/MaxPoints;
        if (percentage >= 90){
            System.out.println("Hinne: 5");
        } else if (percentage >= 80) {
            System.out.println("Hinne: 4");
        }else if (percentage >= 50) {
            System.out.println("Hinne: 3");
        } else {
            System.out.println("Hinne: 2");
        }
    }

}