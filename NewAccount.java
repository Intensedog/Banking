import java.util.*;
public class NewAccount{
   public static void main (String[] a){
        ArrayList<Object> newaccount = new ArrayList<Object>(); 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Account Number:");
        int acc = sc.nextInt();
        System.out.println("Last Name:");
        String zxc = sc.nextLine();
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
        float ob = sc.nextFloat(); 
        System.out.println("Opening Date:");
        String zxcv = sc.nextLine();
        String od = sc.nextLine();
        
        sc.close();
        //System.out.println("Account Status: A");
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
        //for (int i = 0; i < newaccount.size(); i++) {  
            
            System.out.print("Account Number:"+newaccount.get(0) + "\n"+
            "Last Name:"+newaccount.get(1) + "\n"+
            "First Name:"+newaccount.get(2) + "\n"+
            "Middle Initial:"+newaccount.get(3) + "\n"+
            "Address:"+newaccount.get(4) + "\n"+
            "Telephone no:"+newaccount.get(5) + "\n"+
            "Mobile no:"+newaccount.get(6) + "\n"+
            "Opening Balance:"+newaccount.get(7) + "\n"+
            "Opening Date:"+newaccount.get(8) + "\n"+
            "Account Status:"+newaccount.get(9));  
    }
  
}
