public class Deposit
{
    public String ob="0",aod="0",dd="12-4-2020", lastname="Catalan",firstname="Christian",mi="S.",
    add="B-6 L-9",tn="5050172",mn="09234492542",as="A",accnum="00000";
    public Deposit(){
        accnum="00000";ob="0";lastname="Lastname";firstname="Firstname";
        mi="Middleinit";add="address";tn="telephone";
        mn="mobilenum";as="A";aod="0";dd="12-4-2020";
    }
    
    public Deposit(String accnum, String lastname, String firstname,
    String mi, String add, String tn, String mn, String ob, String as, String aod, String dd){
        this.accnum= accnum;
        this.ob= ob;
        this.lastname=lastname;
        this.firstname=firstname;
        this.mi=mi;
        this.add=add;
        this.tn=tn;
        this.mn=mn;
        this.as=as;
        this.aod=aod;
        this.dd=dd;
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
    
    public String getas(){
        return as;
    }
    
    public void setas(String as){
       this.as=as;
    }
    
    public String getaod(){
        return aod;
    }
    
    public void setaod(String aod){
       this.aod=aod;
    }
    
    public String getdd(){
        return dd;
    }
    
    public void setdd(String dd){
       this.dd=dd;
    }
    
    public String toString(){
        return"Account Number:"+getaccnum() + "\n"+
        "Last Name:"+getlastname() + "\n"+
        "First Name:"+getfirstname() + "\n"+
        "Middle Initial:"+getmi() + "\n"+
        "Address:"+getadd() + "\n"+
        "Telephone no:"+gettn() + "\n"+
        "Mobile no:"+getmn() + "\n"+
        "Account Balance:"+getob() + "\n"+
        "Account Status:"+getas()+"\n"+"\n"+
        "Amount of Deposit:"+getaod()+"\n"+
        "Date deposited:"+getdd();
    }
}

