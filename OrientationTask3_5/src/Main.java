public class Main {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();
        System.out.println("Start time: " + clock.getTime());

        clock.setTime(5);
        System.out.println("Time to 5: " + clock.getTime());

        Clock sameClock = Clock.getInstance();
        System.out.println("Time variable: " + sameClock.getTime());

        sameClock.setTime(12.5);
        System.out.println("Time to: " + clock.getTime());

        System.out.println("True? " + (clock == sameClock));
    }
}