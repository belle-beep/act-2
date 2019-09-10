import java.util.Scanner;

public class Exercise2 
{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      
      // Number 1
      
     double fedtax,statetax,sstax,medtax,penplan,healthinsurance,grossamount,netpay,finalnetpay;
     String employeename;
     
     //Input
     System.out.println("input employee name: ");
     employeename = input.nextLine();
     System.out.println("Enter Gross Amount: ");
     grossamount = input.nextDouble();
     
     //Assingning of values
     
     fedtax = grossamount * 0.015;
     statetax = grossamount * 0.035;
     sstax = grossamount * 0.0575;
     medtax = grossamount * 0.0275;
     penplan = grossamount * 0.05;
     healthinsurance = 75;
     
     netpay = (fedtax + statetax + sstax+ medtax + penplan + healthinsurance);
     finalnetpay = grossamount - netpay;
             
         //Display
     
         System.out.println(employeename);
         System.out.printf("Gross Amount: %.2f ",grossamount);
         System.out.println();
         System.out.println("Federal tax: " + fedtax);
         System.out.printf("State tax: %.2f",statetax);
         System.out.println();
         System.out.printf("Social Security Tax: %.2f ",sstax);
         System.out.println();
         System.out.printf("Medicare/Medicaid Tax: %.2f ",medtax);
         System.out.println();
         System.out.printf("Pension plan: %.2f ",penplan);
         System.out.println();
         System.out.printf("Health Insurance: %.2f",healthinsurance);
         System.out.println();
         System.out.printf("Net pay: %.2f",finalnetpay);
         System.out.println();
         System.out.println();
     
     
        //Number 2
     
         int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
     
        //Input
     
        System.out.println("Enter 1st number: ");
        n1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = input.nextInt();
        System.out.println("Enter 3rd number: ");
        n3 = input.nextInt();
        System.out.println("Enter 4th number: ");
        n4 = input.nextInt();
        System.out.println("Enter 5th number: ");
        n5 = input.nextInt();
        System.out.println("Enter 6th number: ");
        n6 = input.nextInt();
        System.out.println("Enter 7th number: ");
        n7 = input.nextInt();
        System.out.println("Enter 8th number: ");
        n8 = input.nextInt();
        System.out.println("Enter 9th number: ");
        n9 = input.nextInt();
        System.out.println("Enter 10th number: ");
        n10 = input.nextInt();
     
        //Assingning 
        
        r1 = n1;
        r2 = n1 + n2;
        r3 = r2 + n3;
        r4 = r3 + n4;
        r5 = r4 + n5;
        r6 = r5 + n6;
        r7 = r6 + n7;
        r8 = r7 + n8;
        r9 = r8 + n9;
        r10= r9 + n10;
        
        System.out.println("running sum: ");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println();
                
    }
    
}
