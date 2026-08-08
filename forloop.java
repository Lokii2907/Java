//import java.util.Scanner;

class loop{
     
    public static void main(String args[])
    {
      /*  Scanner scan = new Scanner(System.in);
       int a = scan.nextInt(); */
       //int count = 0;  

       for (int i = 1; i <= 100; i++) {
          if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + " is divisible by both 3 and 5");
          } else if (i % 3 == 0) {
            System.out.println(i + " is divisible by 3");
          } else if (i % 5 == 0) {
            System.out.println(i + " is divisible by 5");
          } else {
            System.out.println(i + " is not divisible by 3 or 5");
          }
       }
       //System.out.println("count of even numbers is " + (10 - count));
       //System.out.println("count of odd numbers is " + count);   
    }
}
