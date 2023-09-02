public class New_Account
{
    public String ob="0";
    public String lastname="Lastname",firstname="Firstname",mi="Middleinit",add="address",tn="telephone",
    mn="mobilenum",od="Opening Date",as="A",accnum="00000";
    
    public New_Account(String accnum, String lastname, String firstname,
    String mi, String add, String tn, String mn, String ob,String od,String as){
        this.accnum= accnum;
        this.ob= ob;
        this.lastname=lastname;
        this.firstname=firstname;
        this.mi=mi;
        this.add=add;
        this.tn=tn;
        this.mn=mn;
        this.od=od;
        this.as=as;
    }
    
    public String getaccnum(){
        return accnum;
    }
    
    public void setaccnum(String accnum){
       this.accnum=accnum;
    }
    
    public String getob(){
        return ob;
    }
    
    public void setob(String ob){
       this.ob=ob;
    }
    
    public String getlastname(){
        return lastname;
    }
    
    public void setlastname(String lastname){
       this.lastname=lastname;
    }
   
    public String getfirstname(){
        return firstname;
    }
    
    public void setfirstname(String firstname){
       this.firstname=firstname;
    }
    
    public String getmi(){
        return mi;
    }
    
    public void setmi(String mi){
       this.mi=mi;
    }
    
    public String getadd(){
        return add;
    }
    
    public void setadd(String add){
       this.add=add;
    }
    
    public String gettn(){
        return tn;
    }
    
    public void settn(String tn){
       this.tn=tn;
    }
    
    public String getmn(){
        return mn;
    }
    
    public void setmn(String mn){
       this.mn=mn;
    }
    
    public String getod(){
        return od;
    }
    
    public void setod(String od){
       this.od=od;
    }
    
    public String getas(){
        return as;
    }
    
    public void setas(String as){
       this.as=as;
    }
    public String toString(){
        return"Account Number:"+getaccnum() + "\n"+
        "Last Name:"+getlastname() + "\n"+
        "First Name:"+getfirstname() + "\n"+
        "Middle Initial:"+getmi() + "\n"+
        "Address:"+getadd() + "\n"+
        "Telephone no:"+gettn() + "\n"+
        "Mobile no:"+getmn() + "\n"+
        "Opening Balance:"+getob() + "\n"+
        "Opening Date:"+getod() + "\n"+
        "Account Status:"+getas(); 
    }
}

