import java.util.*;
class Solution
{
    private static Scanner sc =new Scanner(System.in);
    
    static int[] locker={15,15,15,15};

    static int[] den={2000,500,200,100};

    static int[] balance={40000,20000,30000,60000};
    
    static int total;
    
    static int ch,tp,attempt=0;
    static int pin=1234;

    static void home()
    {
        while(true)
        {
            System.out.println("********ATM Machine*******");
            System.out.println("press 1 for Admin Login");
            System.out.println("press 2 for User Login");
            System.out.println("press 3 for Exit");
            System.out.print("Enter a number : ");
            
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("\033[H\033[2J");
                admin();  
                break;
                case 2:
                System.out.println("\033[H\033[2J");
                // user();
                break;
                case 3:
                System.exit(0);
                break;
            }
        }
    }
    
    
    static void admin()
    {
        System.out.println("user id : ");
                String user=sc.next();
                System.out.println("password :");
                int pwd=sc.nextInt();
                if(user.equals("sakthi") && pwd==1234)
                {
                    System.out.println("\033[H\033[2J");
                    System.out.println("Admin login successful!");
    
                }
                else if(user.equals("Admin2")&& pwd==1234)
                {
                    System.out.println("\033[H\033[2J");
                    System.out.println("Admin login successful!");
                }
                else 
                {
                    System.out.println("\033[H\033[2J");
                    System.out.println("Incorrect Input");return;
                }
                adminpage();
            }
           
            
            
    static void adminpage()
    {
        System.out.println("press 1 for add money");
        System.out.println("press 2 for view balance");
           System.out.println("press 3 for exit");
                int choice=sc.nextInt();
                if(choice==1)
                {
                    addMoney();
                }
                else if(choice==2)
                {
                  viewBal();
                }
                else if(choice ==3)
                {
                   home();
                }
            }
            
    
    
    static void viewBal()
    {
        int n=0;
        for(int i=0;i<locker.length;i++)
        {
            System.out.println(den[i]+"-->"+(locker[i]));
            n=n+(locker[i]*(den[i]));
        }
    System.out.print("Your balance: ");
    System.out.println(n); 
    adminpage();
    }

    
    
    static void addMoney()
    {
        System.out.println("Enter Denominations");
        for(int i=0;i<4;i++)
        {
            System.out.print(den[i]+"-->");
            locker[i]=locker[i]+sc.nextInt();
        }
        System.out.println("\033[H\033[2J");
        System.out.println("Amount Added Successfully!");
        
    }


public static void main(String args[])

{
    home();

}
}