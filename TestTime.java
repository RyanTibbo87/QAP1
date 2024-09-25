public class TestTime {
    public static void main(String[] args) {
        // 3: Create two time objects t1 and t2
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // 4: Call nextSecond() for t1
        t1.nextSecond();
        System.out.println("Time t1 after nextSecond(): " + t1.toString());

        // Call previousSecond() for t2
        t2.previousSecond();
        System.out.println("Time t2 after previousSecond(): " + t2.toString());

        // 5: Display final times
        System.out.println("Final time for t1: " + t1.toString());
        System.out.println("Final time for t2: " + t2.toString());
    }
}

