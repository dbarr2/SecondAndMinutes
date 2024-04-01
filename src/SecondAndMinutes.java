public class SecondAndMinutes {

    public static void main(String[] args) {

        System.out.println("Function 1: " + getDurationString(3945));
        System.out.println("Function 2: " + getDurationString(5, 70));


    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid Value";
        }

        int minutes = seconds / 60; //Calculate the minutes from the seconds
        return getDurationString(minutes, seconds); //Call the method you're overloading


    }

    public static String getDurationString(int minutes, int seconds) {

        if(minutes < 0 || seconds < 0) {
            return "Invalid Values";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
