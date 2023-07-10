import java.io.*;
class BankingSystem
{
    BankOperation bo = new BankOperation();
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    void disp()throws IOException
    {
        System.out.println("\f");
        System.out.println(" ****************");
        System.out.println(" **** WELCOME TO SADIYA BANK ****");
        System.out.println(" ****************");
        
        while(true)
        {
            System.out.print("\n 1. Create new account");            
            System.out.print("\n 2. Bank details");
            System.out.print("\n 3. Print Customer List");
            System.out.print("\n 4. Exit");
            System.out.print("\n Choose your option   : ");
            int ch =Integer.parseInt(br.readLine());
            switch (ch)
            {
                case 1: bo.createAccount();
                        break;            
                case 2: bo.printBankDetails();
                        break;
                case 3: bo.printCustomerList();
                        break;
                case 4: System.out.print("\n** Thanks for using online banking system ** ");
                        return;
                default: System.out.print("\n** Invalid choice ** ");
            }
        }
    }
}
