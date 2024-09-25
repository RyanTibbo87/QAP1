public class TestDate {
    public static void main(String[] args) {
        // 3: Create a Date object
        Date date = new Date(23, 9, 2024);

        // Print the date using toString() method
        System.out.println("The date is: " + date.toString());

        // Test the setDate method
        date.setDate(2, 7, 1995); // My Birthday :)
        System.out.println("Updated date is: " + date.toString());
    }
}
