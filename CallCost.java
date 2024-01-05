class CallCost{
    public static void main(String[]args){

        double balance;
        double rate;
        double duration;
        double cost;

        balance =170;
        rate=1.02;
        duration=37;
        cost = duration*rate;
        balance=balance-cost;

        System.out.println("Call Duration:");
        System.out.println(duration);
        System.out.println("Seconds");
        System.out.println("Balance:"+balance+"Rupees");
    
    }

}