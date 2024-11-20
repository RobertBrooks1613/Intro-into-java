package basics;

public class MathOperatorsExercise {

    public static void main(String[] args) {
        ClassroomRatios();
        StockPurchaseCDcalculator();
        MarathonRaceTime();
    }

    public static void ClassroomRatios() {
    
        int boys = 11;
        int girls = 16;
        int teacher = 1;
        int teacherAssistant = 1;

        int totalStudents = boys + girls;
        double girlsPercentRatio = (((double)(girls)) / totalStudents) * 100;
        double teacherStudentRatio = totalStudents / ((double)(teacher + teacherAssistant));

        String formatedReturn = String.format("""
            
            There is %d boys and %d girls in the class room with %d Teacher and %d teachers assistant.
            %.3f %% of the class are girls.
            The student-Teacher ratio is %.1f .\n""", boys, girls, teacher, teacherAssistant, girlsPercentRatio, teacherStudentRatio);

        System.out.println(formatedReturn);
    }


    public static void StockPurchaseCDcalculator() {

        int saving = 25000;
        int stockPrice = 989;
        double CDaccount = saving % 989;
        double shares = (saving - CDaccount) / 989;

        String formatedReturn = String.format("""

            Your Feeling lucky! you take your %,d and invest it into stocks!
            each stock cost %d. after the purchase you gained %.0f and thats leaves you %.0f in your CD account.
            """, saving, stockPrice, shares, CDaccount);

        System.out.println(formatedReturn);

    }


    public static void MarathonRaceTime() {
        int officalTime = 7724;
        double seconds = officalTime % 60;
        double mileRaced = 26.2;
        double mins = (officalTime / 60) % 60;
        double hours = (officalTime / 60) / 60;
        double avgMileTime = (((double)(officalTime / 60)) / mileRaced);

        String formatedReturn = String.format("""

            In 2016, Kenyan runner Eliud Kipchoge won the Olympic gold medal in the mens
            %.1f-mile marathon race. The official timer tracked his race at %.0f hrs: %.0f mins: %.0f
            making his avg time per mile %.3f mins!
            """, mileRaced, hours, mins, seconds, avgMileTime);

        System.out.println(formatedReturn);

    }

}
