import java.util.Scanner;
class Bank
{
     private:
            double bal=5000;
            int pwd;
     public void deposit(double money)
     {
          Scanner sc=new Scanner(System.in);
          System.out.println("enter password:");
          pwd=sc.nextInt();
          if(pwd==123)
          {
               bal = bal+money;
               System.out.println("deposit money:"+money);
               System.out.println("total bal:"+bal);
           }
           else
           {
                System.out.println("incorrect password");
            }
        }
        public void withdraw(double money)
        {
            

