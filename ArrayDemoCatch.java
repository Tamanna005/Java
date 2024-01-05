import java.io.*;
class ArrayDemo1{
    static int arr[]=new int[10];
    public static void add()throws IOException{
        int p,n;
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter array element");
        n=Integer.parseInt(dis.readLine());
        System.out.println("At which index you want to insert this element");
        p=Integer.parseInt(dis.readLine());

        try{
            arry[p]=n;
            System.out.println("Element inserted");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurs");
            System.out.println("Provide index is out of array bounds");
        }
    }
    public static void main(String[]args)throws IOException{
        System.out.println("Calling add method to insert element into the array");
        add();
    }
    
}
