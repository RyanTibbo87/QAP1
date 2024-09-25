public class TestAccount {
    public static void main(String[] args) {
        // 3.a: Create two accounts
        Account acc1 = new Account("A001", "Ryan Tibbo", 5000);
        Account acc2 = new Account("A002", "Ainee Malik", 4000);

        // 3.b: Display balance of both accounts
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());

        // 3.c: Transfer $1000 from Acc1 to Acc2
        System.out.println("Transferring $1000 from Acc1 to Acc2...");
        acc1.transferTo(acc2, 1000);

        // 3.d: Display balance of both accounts again
        System.out.println("Balance of Acc1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Acc2 after transfer: $" + acc2.getBalance());
    }
}