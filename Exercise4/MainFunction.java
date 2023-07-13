package Exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFunction {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount accountInUse = new BankAccount();
        List<BankAccount> list = new ArrayList<BankAccount>();
        boolean check=false;
        int op = 0;
        do {
            System.out.println("1.  Create Account");
            System.out.println("2.  Withdraw");
            System.out.println("3.  Deposit");
            System.out.println("4.  Transfer");
            System.out.println("5.  Generate Report");
            System.out.println("6.  Exit the program");
            System.out.print("Choose option = ");
            op = scanner.nextInt();
            switch (op) {
                case 1 -> {
                    accountInUse = new BankAccount();
                    accountInUse.createAccount();
                    list.add(accountInUse);
                }
                case 2 -> {                  
                    System.out.print("Enter AccountNumber = "); int acc=scanner.nextInt();
                    for(int i=0;i<list.size();i++){
                        if(acc==list.get(i).getAccountNumber()){
                            System.out.print("Enter amount to withdraw = ");
                            double withdrawAmount = scanner.nextDouble();
                            accountInUse.withdraw(list.get(i),withdrawAmount);
                            check=true;
                            System.out.println("Success !");
                        }
                    }
                    if(!check){
                        System.out.println("Field");
                    }
                }
                case 3 -> { 
                    System.out.print("Enter AccountNumber = "); int acc=scanner.nextInt();
                    for(int i=0;i<list.size();i++){
                        if(acc==list.get(i).getAccountNumber()){
                            System.out.print("Enter amount to deposit =");
                            double deposit = scanner.nextDouble();   
                            accountInUse.deposit(list.get(i),deposit);
                            check=true;
                            System.out.println("Success !");
                        }
                    }if(!check){
                        System.out.println("Field");
                    }
                }
                case 4 -> {
                    System.out.println("Please login");
                    System.out.print("Enter AccountNumber     = ");
                    int acc_id = scanner.nextInt();
                    System.out.print("Enter AccountHolderName = ");
                    String name = scanner.next();
                    for (int i = 0; i < list.size(); i++) {
                        if (acc_id == list.get(i).getAccountNumber() && name.equals(list.get(i).getAccountHolderName())) {
                            System.out.print("Enter AccountNumber = ");
                            int id = scanner.nextInt();
                            for (int j = 0; j < list.size(); j++) {
                                if (id == list.get(j).getAccountNumber()) {
                                    System.out.print("Enter amount to transfer = ");
                                    double amount = scanner.nextDouble();
                                    accountInUse.transfer(list.get(i),list.get(j), amount);
                                    check=true;
                                    System.out.println("Success !");
                                }
                            }
                        }
                    }if(!check){
                        System.out.println("Field");
                    }
                }
                case 5 -> {
                    for (int i = 0; i < list.size(); i++) {
                        list.get(i).generateReport();
                    }
                }

            }
        } while (op != 6);

    }
}
