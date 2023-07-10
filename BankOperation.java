import java.io.*;
class BankOperation
{
    final int AC_TYPE_SB = 1;
    final int AC_TYPE_CC = 2;
    final int AC_TYPE_RD = 3;
    final int AC_TYPE_LOAN = 4;
                
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Customer arrCust[]=new Customer[50];
    int custIndx = 0;
    void createAccount()throws IOException
    {
        System.out.println("*** WELCOME TO NEW CUSTOMER ENTRY SECTION ****");
        Customer obj = new Customer ();
        System.out.print("\nEnter name  :   ");
        obj.name=br.readLine();
        obj.AC_No = "1123000000"+(custIndx+1);
        System.out.print("\nEnter EpicNo  :   ");
        obj.EpicNo=br.readLine();
        System.out.print("\nEnter AdharNO  :   ");
        obj.AdharNo=Long.parseLong(br.readLine());
        System.out.print("\nEnter Address  :   ");
        obj.Address=br.readLine();
        System.out.print("\nEnter PIN code  :   ");
        obj.PIN=Integer.parseInt(br.readLine());
        System.out.println("\nEnter Account type  :");
        obj.AC_Type = returnAC_Type();       
        
        double bal=getOPBalance();
        obj.OPBlnce= bal;
        System.out.print("\nEnter PAN no  :   ");
        obj.PAN=br.readLine();
        arrCust[custIndx++]=obj;
        System.out.print("* ONE CUSTOMER ADDED SUCCESSFULLY *");
    }
    
    void printCustomerList()
    {
        //Character.isSpaceChar('c');
        System.out.print("NAME\t|\tACCOUNT NO\t| OPENING BALANCE");
        System.out.print("----------------------------------------------------------");
        for(int i=0;i<50;i++)
        {
            Customer cus = arrCust[i];
            if(cus == null)
                return;
            System.out.print("\n"+cus.name+ "\t|\t" + cus.AC_No + "\t|" + cus.OPBlnce); 
            System.out.print("\n----------------------------------------------------------");
        }
    }
    int returnAC_Type()throws IOException
    {
        System.out.println(" 1.Savings Account ");
        System.out.println(" 2.Cash Credit Account ");
        System.out.println(" 3.Recurring Deposit Account ");
        System.out.println(" 4.Loan Account ");
        //System.out.print(" Choose your Account Type :   ");
        while(true)
        {
            System.out.print("\n Enter your Account Type : ");
            int ch = Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:                    
                case 2:
                case 3:                        
                case 4: return ch; 
                default :
                    System.out.println(" Wrong choice \n Please enter the correct choice");
                
            }
        }
    }
    double getOPBalance()throws IOException
    {
        System.out.print("\nEnter Opening balance(Balance required minimum Rs.1000)  :   ");
        
        while(true)
        {
             double bal=Double.parseDouble(br.readLine());
             if(bal<1000)
             {
                 System.out.print("\n Balance required minimum Rs 1000. Please re-enter : ");                
             }
             else
                 return bal;
        }
    }
    
    void printBankDetails()
    {
        System.out.print(" ** This feature is under construction ** ");
    }
}
