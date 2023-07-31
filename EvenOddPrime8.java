import java.util.Scanner;

public class EvenOddPrime8 
{
   public EvenOddPrime8() {
   }

   public static boolean isEven(int var0)
    {
      return var0 % 2 == 0;
   }

   public static boolean isPrime(int var0) {
      if (var0 < 2) {
         return false;
      } else {
         for(int var1 = 2; (double)var1 <= Math.sqrt((double)var0); ++var1) {
            if (var0 % var1 == 0) {
               return false;
            }
         }

         return true;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (isEven(var2)) {
         System.out.println("" + var2 + "is Even");
      } else { 
         System.out.println("" + var2 + "is Odd");
      }

      if (isPrime(var2)) {
         System.out.println("" + var2 + "is Prime");
      } else {
         System.out.println("" + var2 + "is Not Prime");
      }

      System.out.print("Perfect factors of " + var2);

      for(int var3 = 1; var3 <= var2; ++var3) {
         if (var2 % var3 == 0) {
            System.out.print("" + var3 + " ");
         }
      }

   }
}
