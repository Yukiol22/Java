public class OrientationTask1_3 {
    private static String toClock(long minutes) {
        long hours = minutes / 60;
        long mins = minutes % 60;

        String h = "" + hours;
        String m = "" + mins;

        if (hours < 10) h = "0" + h;   // 9  -> "09"
        if (mins < 10)  m = "0" + m;   // 5  -> "05"

        return h + ":" + m;
    }
    private static long time(int hour, int minute) {
        return hour * 60 + minute;
    }
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();


        c1.setStartTime(time(9, 0));   c1.setEndTime(time(9, 15));
        c2.setStartTime(time(10, 30)); c2.setEndTime(time(11, 45));
        c3.setStartTime(time(13, 0));  c3.setEndTime(time(15, 20));


        Customer[] customers = {c1, c2, c3};
        for (Customer c : customers) {
            System.out.println(c.getTimeSpent());
            System.out.println("Customer ID " + c.getId() + ": start " + toClock(c.getStartTime()) + ", end " +  toClock(c.getEndTime())+ ", time spent " + (c.getTimeSpent() / 60) + " h " + (c.getTimeSpent()  %  60) + " min");;
        }
    }
}