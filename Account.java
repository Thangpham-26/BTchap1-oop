public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount){
        if(amount<=this.balance){
            this.balance-=amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }

    public int transferTo(Account account, int amount){
        if(amount<=this.balance){
            account.balance += amount;
            this.balance -= amount;
        }else{
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }
    public String toString(){
        return "Account ID: " + this.id + "\nAccount Name: " + this.name + "\nBalance: " + this.balance;
    }


}
