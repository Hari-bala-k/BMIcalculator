import java.util.Scanner;
class BankAccount{
    private String name;
    private int accNumber;
    private double balance;
    
 BankAccount(String name ,int accNumber,double balance){
        this.name = name;
        if(accNumber > 0){
            this.accNumber = accNumber;
        }
        else {
            throw new IllegalArgumentException("invalid input");
        }
        if(balance >= 0) this.balance = balance;
        else throw new IllegalArgumentException("invalid input");
    }
    
    public String getName(){
        return name;
    }
    public int getAccNumber(){
        return accNumber;
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance ) {
            balance -= amount;
        }
        else throw new IllegalArgumentException("insufficiant amount");
    }
    public void deposit(double amount){
        if(amount > 0  ) {
            balance += amount;
        }
        else throw new IllegalArgumentException("invalid input");
    }
    public double getBalance(){
        return balance;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account Number  :");
        int accNo = sc.nextInt();

        System.out.print("Enter your full name       :");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.print("Enter your balance amount  :");
        double balance =sc.nextDouble();

        System.out.print("Enter your deposite amount :");
        double depositAmount =sc.nextDouble();

        System.out.print("Enter your withdraw amount :");
         double withdrawAmount =sc.nextDouble();
    
        BankAccount b = new BankAccount(name,accNo,balance);
        try {
            b.deposit(depositAmount);
            b.withdraw(withdrawAmount);
          System.out.println("Balance Amount :" + b.getBalance());  
        } catch (IllegalArgumentException e) {
          System.out.println("Error :" +e.getMessage());
        }
        
        sc.close();
    }
}