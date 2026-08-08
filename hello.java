import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
    
        Scanner scan = new Scanner(System.in);

        String meghana = scan.nextLine();

        if (meghana.equals("Alive") || meghana.equals("alive"))                                      
        {
            System.out.println("Surya weds meghana");
        }
        else
        {
            System.out.println("Surya meets ramya");
        }

        scan.close();
        
        /*String name = scan.nextLine();
        int score = scan.nextInt();
        String department = scan.next();

        System.out.println("Name: " + name);
        System.out.println("Score: " + score/10.f);
        System.out.println("Department: " + department);*/
    }
}