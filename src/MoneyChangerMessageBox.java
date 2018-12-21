/*
 9/15/14
 This program will break change into correct coins 
 JDK 1.7
 */
import javax.swing.JOptionPane;
public class MoneyChangerMessageBox {

    public static void main(String[] args) {
    //declaring variables
    String answer = JOptionPane.showInputDialog(null,"Enter amount of change");
    
    int cents = (int)(Double.parseDouble(answer) * 100);
    int centsLeft;//temporary variable for storing remaining cents
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    
    Integer dollar_val = 100;
    Integer quarter_val = 25;
    Integer dime_val = 10;
    Integer nickel_val = 5;
    Integer penny_val = 1;
    centsLeft = cents;
    int []money_val = {dollar_val,quarter_val,dime_val,nickel_val,penny_val};
    int []money = {0,0,0,0,0};
    for (int i = 0; i< money_val.length; i++){
        money[i] = centsLeft/money_val[i];
        centsLeft = centsLeft%money_val[i];
        System.out.println(money[i]);
    }
    
    //begin calculations
    dollars = cents/100;
    centsLeft = cents%100;
    quarters = centsLeft/25;
    centsLeft = centsLeft%25;
    dimes = centsLeft/10;
    centsLeft = centsLeft%10;
    nickels = centsLeft/5;
    centsLeft = centsLeft%5;
    pennies = centsLeft;
    
    //printing results
   JOptionPane.showMessageDialog(null,
            "Total Cents: " + cents
            +"\nDollars: " +dollars
            +"\nQuarters: " +quarters
            +"\nDimes: " +dimes
            +"\nNickels: " +nickels
            +"\nPennies: " + pennies);
    }
}
