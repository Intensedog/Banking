import java.util.*;
public class Newaccountmain
{
    public static void main (String[] args){
        LinkedList<String> newaccount = new LinkedList<String>(); 
        LinkedList<String> deposit = new LinkedList<String>();
        LinkedList<String> withdrawal = new LinkedList<String>();
        LinkedList<Integer> Integers = new LinkedList<Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Account Number:");
        String acc = sc.nextLine();
        System.out.println("Last Name:");
        String lastname = sc.nextLine();
        System.out.println("First Name:");
        String firstname = sc.nextLine();
        System.out.println("Middle Initial:");
        String mi = sc.nextLine();
        System.out.println("Address:");
        String add = sc.nextLine(); 
        System.out.println("Telephone no:");
        String tn = sc.nextLine(); 
        System.out.println("Mobile no:");
        String mn = sc.nextLine();
        System.out.println("Opening Balance:");
        String ob = sc.nextLine(); 
        System.out.println("Opening Date:");
        String od = sc.nextLine();
        
        newaccount.add(0,acc);
        newaccount.add(1,lastname);
        newaccount.add(2,firstname);
        newaccount.add(3,mi);
        newaccount.add(4,add);
        newaccount.add(5,tn);
        newaccount.add(6,mn);
        newaccount.add(7,ob);
        newaccount.add(8,od);
        newaccount.add(9,"A");
        
        
        New_Account a = new New_Account(newaccount.get(0),newaccount.get(1),newaccount.get(2),
        newaccount.get(3),newaccount.get(4),newaccount.get(5),newaccount.get(6),newaccount.get(7),newaccount.get(8)
        ,newaccount.get(9));
        System.out.print (a);
        
        System.out.print ("\n\n Deposit\n");
        System.out.println("Account Number:");
        String acc1 = sc.nextLine();
        System.out.println("Amount of Deposit:");
        String aod = sc.nextLine();
        System.out.println("Date Deposited:");
        String dd = sc.nextLine();
        
        deposit.add(0,acc1);
        deposit.add(1,"Leopoldo");
        deposit.add(2,"Jancel");
        deposit.add(3,"M.");
        deposit.add(4,"Cadahuan");
        deposit.add(5,"369-8521");
        deposit.add(6,"09064589635");
        deposit.add(7,"5,000,000");
        deposit.add(8,"A");
        deposit.add(9,aod);
        deposit.add(10,dd);
        
        Deposit d1 = new Deposit(deposit.get(0),deposit.get(1),deposit.get(2),deposit.get(3),deposit.get(4),deposit.get(5),
        deposit.get(6),deposit.get(7),deposit.get(8),deposit.get(9),deposit.get(10));
        System.out.print (d1);
        
        System.out.print ("\n\n Withdraw \n");
        System.out.println("Account Number:");
        String acc2 = sc.nextLine();
        System.out.println("Withdrawal Amount:");
        int ab  = sc.nextInt();
        System.out.println("Date Withdrawn:");
        String dd11 = sc.nextLine();
        String dd1 = sc.nextLine();
        
        int num1 = 5000000;
        int balanceminus= num1-ab;
        
        withdrawal.add(0,acc2);
        withdrawal.add(1,"Codilla");
        withdrawal.add(2,"Jay");
        withdrawal.add(3,"S.");
        withdrawal.add(4,"Talamban");
        withdrawal.add(5,"389-8958");
        withdrawal.add(6,"09885695742");
        withdrawal.add(7,"A");
        withdrawal.add(8,dd1);
        
        Integers.add(0,balanceminus);
        
        Withdrawal w1 = new Withdrawal(withdrawal.get(0),withdrawal.get(1),withdrawal.get(2),withdrawal.get(3),withdrawal.get(4),withdrawal.get(5),
        withdrawal.get(6),deposit.get(7),deposit.get(8),Integers.get(0));
        System.out.print (w1);
        
        System.out.print ("\n\n Account number search \n");
        System.out.print ("Account number");
        int accs =sc.nextInt();
        Accnum ac= new Accnum(accs);
        
    }
}
