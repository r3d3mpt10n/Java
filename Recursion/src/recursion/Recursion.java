
package recursion;


public class Recursion {

  public static int Summation(int n){
      // Base code: WE ARE AT THE END
      if (n <= 0) {
          return 0; // additive identity property
      }
       //Recursive Case: KEEP GOING
       else {
          return n + Summation(n-1);
      }
  }
  
    public static int Factorial(int n) {
        if (n <= 1){
            return 1;
        }
        // Recursive case
        else {
            return n * Factorial(n-1);
        }
    }
    
    public static int Exponentiation(int n, int p){
        // Base Case:
        if (p <= 0) {
            return 1;
        }
        // Recursive case:
        else {
            return n * Exponentiation(n, p-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(4));
        System.out.println(Exponentiation(5, 4));
    }
    
}
