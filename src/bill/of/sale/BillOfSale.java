/*
 * Kaia Mac
 * this program shows the cost of a shirt, tax, and how much we owe back
 * September 20th, 2018
 */

package bill.of.sale;

/**
 *
 * @author kamac8665
 */
public class BillOfSale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double HST = 1.13;
        
        double shirtcost = 12.49;
        
        double paidwith = 20.00;
        
        double totalcost = 0.0;
        
        double changeback = 0.0;
        
        totalcost = shirtcost*HST;
        
        changeback = paidwith - totalcost;
        
        System.out.println("Cost of shirt..." + shirtcost);
        
        System.out.println("HST..." + HST +"%");
        
        System.out.println("Total cost...$" + totalcost);
        
        System.out.println("Paid With...$" + paidwith);
        
        System.out.println("Change back...$" + changeback);
        
    }
    
}
