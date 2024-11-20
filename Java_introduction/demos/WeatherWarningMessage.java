package demos;

public class WeatherWarningMessage {

    public static void main(String[] args) {
        double degreesC = 45;
        double degreesF = (degreesC * 9/5) + 32;

        System.out.println(degreesF + "F");

        
        if (degreesF < 32) {
            System.out.println("WARNING: FREEZING TEMPERATURES");
        }
        else if (degreesF > 105) {
            System.out.println("WARNING: HEAT ADVISORY");
        }
        else {
            System.out.println("Weather should be pleasant");
        }

    }

}
