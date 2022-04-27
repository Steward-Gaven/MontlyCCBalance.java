class Main {

    public static void main(String[] args) {

    int balance = 5000;
    double interest = balance * .17;
    double balance1 = balance + interest;
    double balance2 = balance1 + interest;

        System.out.println("The initial balance is:" + balance);
        System.out.println("The interest of the initial balance is:" + interest);
        System.out.println("The total payment due after one month is:" + balance1);
        System.out.println("The total payment due after two months is: " + balance2);
    }
}
