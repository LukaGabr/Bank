public class Main {
    public static void main(String[] args) {
        // Customer One
        PhysicalCard customerOne_PhysicalCardOne =new PhysicalCard
                ("2342 8655 4441 1233", "10-Nov-2025", "Debit", 334);
        PhysicalCard customerOne_PhysicalCardTwo =new PhysicalCard
                ("8965 0904 4324 3433", "03-May-2026", "Credit", 531);

        Account customerOne_AccountOne = new Account
                (113532677, 456.45f, "Checking", customerOne_PhysicalCardOne);
        Account customerOne_AccountTwo = new Account
                (113532678, 123.99f, "Savings", customerOne_PhysicalCardTwo);

        Customer customerOne = new Customer
                ("Luka", "Gabrielashvili", "21-Oct-2002", customerOne_AccountOne);
        customerOne.addAccount(customerOne_AccountTwo);

        // Customer Two
        PhysicalCard customerTwo_PhysicalCardOne =new PhysicalCard
                ("2341 4432 1122 0931", "30-Dec-2027", "Credit", 119);

        Account customerTwo_AccountOne = new Account
                (113532679, 245.45f, "Checking", customerTwo_PhysicalCardOne);

        Customer customerTwo = new Customer
                ("Jimi", "Hendrix", "27-Nov-1942", customerTwo_AccountOne);


        System.out.println("**********************************************\n");
        System.out.println(customerOne);
        System.out.println("**********************************************\n");
        System.out.println(customerTwo);
        System.out.println("**********************************************\n");
        customerOne_AccountOne.deposit(50.72f);
        System.out.println("**********************************************\n");
        customerOne_AccountOne.withdraw(100f);
        System.out.println("**********************************************\n");
        customerOne.internalTransfer(113532677,113532678,100.1f);
        System.out.println("**********************************************\n");
    }
}