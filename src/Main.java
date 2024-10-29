public class Main {
    public static void main(String[] args) {
        // Customer One
        Account customerOne_AccountOne = new Account(113532677, 456.45f, "Checking");
        Account customerOne_AccountTwo = new Account(113532678, 123.99f, "Savings");

        Customer customerOne = new Customer("Luka", "Gabrielashvili", "21-Oct-2002", customerOne_AccountOne);
        customerOne.addAccount(customerOne_AccountTwo);

        // Customer Two
        Account customerTwo_AccountOne = new Account(113532679, 245.45f, "Checking");

        Customer customerTwo = new Customer("Jimi", "Hendrix", "27-Nov-1942", customerTwo_AccountOne);


        System.out.println("*****************************************\n");
        System.out.println(customerOne.toString());
        System.out.println("*****************************************\n");
        System.out.println(customerTwo.toString());
        System.out.println("*****************************************\n");
        customerOne_AccountOne.deposit(50.72f);
        System.out.println("*****************************************\n");
        customerOne_AccountOne.withdraw(600f);
        System.out.println("*****************************************\n");

    }
}