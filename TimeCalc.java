public class TimeCalc {
    public static void main(String[] args) {

        // taking the input
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        //splitting into 2 parts seperated by ":"
        int colonIndex = time.indexOf(':');
        int hours = Integer.parseInt(time.substring(0, colonIndex));
        int minutes = Integer.parseInt(time.substring(colonIndex + 1));


        //calcing the new mins and adding the remainer 
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;

        // Building the time string manually and handling the 0 cases 
        String newHoursStr;
        if (newHours < 10) {
            newHoursStr = "0" + newHours;
        } else {
            newHoursStr = "" + newHours;
        }

        String newMinutesStr;
        if (newMinutes < 10) {
            newMinutesStr = "0" + newMinutes;
        } else {
            newMinutesStr = "" + newMinutes;
        }

        // Print the result properly
        System.out.println(newHoursStr + ":" + newMinutesStr);
    }
}
