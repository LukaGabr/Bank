//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Customer One
        Account customerOne_AccountOne = new Account(113532677, 456.45f, "Checking");
        Account customerOne_AccountTwo = new Account(113532678, 123.99f, "Savings");

        Customer customerOne = new Customer("Luka", "Gabrielashvili", "21-Oct-2002", customerOne_AccountOne);
        customerOne.addAccount(customerOne_AccountTwo);

        // Customer Two
        Account customerTwo_AccountOne = new Account(113532679, 245.45f, "Checking");
        Account customerTwo_AccountTwo = new Account(113532680, 65.99f, "Savings");

        Customer customerTwo = new Customer("Jimi", "Hendrix", "27-Nov-1942", customerTwo_AccountOne);
        //customerTwo.addAccount(customerTwo_AccountTwo);



        System.out.println("\n" + customerOne.toString());
        System.out.println("****************************************");
        System.out.println("\n" + customerTwo.toString());
        System.out.println("****************************************");
        System.out.println("\n" + customerOne.getAccNumber());

    }
}