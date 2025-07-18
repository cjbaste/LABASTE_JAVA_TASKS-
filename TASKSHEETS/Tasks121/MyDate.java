package Tasks121;
public class MyDate {
     public static void main(String[] args) {
        DateTask date1 = new DateTask();
        DateTask date2 = new DateTask();

        date1.setDate(1, 1, 1978);      // January 1st, 1978
        date2.setDate(9, 21, 1984);     // September 21st, 1984

        System.out.println(date1.toString());
        System.out.println(date2.toString());

        // Display leap years between date1 and date2
        date1.leapYears(date2);
    }
}