import java.util.*;

class CyberCafe{
    public static void main(String[]args){
        Scanner sc = new Scanner(system.in);

            System.out.println("Choose an item"+"\n1:Italian Maggie"+"\n2:Coffee Moose"+"\n3:Schezwan Pasta"+"\n4:Passion Fruit Shake");

            int botton =Sc.nextInt();
            int quantity=Sc.nextInt();
            int a=350,b=200,c=300,d=500;

            switch(botton){
                case 1:System.out.println("Italian Maggie\n"+a+"Rupees");
                break;
                case 2:System.out.println("Coffee Moose\n"+b+"Rupees");
                break;
                case 3:System.out.println("Schezwan Pasta\n"+c+"Rupees");
                break;
                case 4:System.out.println("Passion Fruit Shake\n"+c+"Rupees");
                break;
                default:System.out.println("Invalid botton");
            }
            System.out.println("How much do you want?");

            switch(quantity){
                case 1:System.out.println("Total="+a*Sc.nextInt());
                break;
                case 2:System.out.println("Total="+b*Sc.nextInt());
                break;
                case 3:System.out.println("Total="+c*Sc.nextInt());
                break;
                case 4:System.out.println("Total="+d*Sc.nextInt());
                break;
                default:System.out.println("Invalid botton");
            }
            System.out.println("#Thanks For Order!!");
        }
    
}

            
        
            

            
    

