public class UnitConversion {
    public static double convertCmToM(double cm) {
        return cm / 100.0;
    }

    public static double convertMToCm(double m) {
        return m * 100.0;
    }

    public static double convertKgToG(double kg) {
        return kg * 1000.0;
    }

    public static double convertGToKg(double g) {
        return g / 1000.0;
    }

    public static void main(String[] args) {
        System.out.println(convertCmToM(100)); // 1.0
        System.out.println(convertKgToG(2)); // 2000.0
        System.out.println(convertMToCm(5)); // 500.0
        System.out.println(convertGToKg(500)); // 0.5
    }
}