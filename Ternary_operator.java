import java.util.Scanner;
class demo1 {
    public static void main(String args[])
    {
        
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();             

        String elegible = a > b ? "a is greater than b" : "a is not greater than b";
        System.out.println(elegible);

        scan.close();
    }
   
} 