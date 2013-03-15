/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package taxcalculator;

import java.util.Scanner;

/**
 *
 * @author ranjan
 */
public class TaxCalculator {
   
    
    /**
     * @param args the command line 
     *
     */
    public static void main(String[] args) {
        System.out.println("Please enter the monthly income");
        float monthly_income;
        Scanner scan=new Scanner(System.in);
      monthly_income= scan.nextFloat();
       System.out.println(monthly_income);
       
        
        System.out.println("Please enter the monthly allowance");
        float monthly_allowance;
      Scanner scan1=new Scanner(System.in);
   monthly_allowance= scan1.nextFloat();
        System.out.println("Please enter the Investment trust in percentage..cannot exceed 10%");
        float cit;
        Scanner scan3=new Scanner(System.in);
      cit= scan3.nextFloat();
        System.out.println("Please enter insurance_premium");
        float insurance;
        Scanner scan4=new Scanner(System.in);
       insurance= scan4.nextFloat();
        System.out.println("Please enter the provident fund in percent");
        float pf;
       Scanner scan5=new Scanner(System.in);
        pf=scan5.nextFloat();
        System.out.println("Please enter where male or female:m/f");
        String sex;
        Scanner scan6=new Scanner(System.in);
       sex= scan6.nextLine();
       char check_sex= sex.charAt(0);
        System.out.println("Please enter whether married or unmarried:m/s");
       
        String status;
     Scanner scan7=new Scanner(System.in);
       status=scan7.nextLine();
       char check_married = status.charAt(0);
       //tax_calculator();
       float cash_in_hand;
       
     
    

  float mon_income_after ; 
  mon_income_after=((pf/100 * monthly_income)-(cit/100 * monthly_income-insurance));
  float yearly_income;
  yearly_income= (mon_income_after * 12);
  
  //for calculating tax
 //public void  tax_calculator()
  //checking marital status
  float tax1 = 0,tax2 = 0,tax3,totaltax = 0,monthly_tax;
  if(check_married =='m')
          
{
    
    if(yearly_income<=200000){
       tax1=(float) (0.1*yearly_income);
    totaltax=tax1; 
    }
    else if((yearly_income>200000 )&& (yearly_income<=300000))
            {  
             tax2=(float) (0.15*yearly_income);
              totaltax=tax1+tax2;   
            }
              
            
    else if(yearly_income>300000)
    {
  tax3=(float) (0.25 *yearly_income);
  totaltax=tax1+tax2+tax3;
    }
}
      



else
{
if(check_married=='s')
{
    if(yearly_income<=160000){
       tax1=(float) (0.1*yearly_income);
    totaltax=tax1; 
    } 
    
    else if((yearly_income>160000 )&& (yearly_income<=260000))
            {
              tax2=(float) (0.15*yearly_income);
              totaltax=tax1+tax2;
            }
            else
{
  tax3=(float) (0.25*yearly_income);
  totaltax=tax1 +tax2 +tax3;
}
}
    }

monthly_tax=(totaltax/12);
cash_in_hand= (monthly_income-monthly_tax+ monthly_allowance);
System.out.println("Cash:"+cash_in_hand);
System.out.println("Monthly Tax:"+monthly_tax);
if(check_sex=='f')
{
totaltax=(float) (totaltax-(0.1*totaltax));
monthly_tax=(totaltax/12);
cash_in_hand=(monthly_income-monthly_tax-monthly_allowance);
System.out.println(cash_in_hand);
System.out.println(monthly_tax);
}




}
    
    
}


