public class Simpleandcoumpoundintrest 
{
    pubic static void main (String[]args)
    {
        double p, r, t,s _interest,c_interest;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the value of the principle = ");
        p=scanner.nextDouble();
        System.out.println("Enter the annual rate of interest =");
        r=scanner.nextDouble();
        System.out.println("Enter the time (years) = ");
        t=scanner.nextDouble
        s_interest=(p * r * t)/100;
        c_interest= p * Math.pow(1.0+r/100.0,t) -p;
        System.out.println("Simple Interest:"+s_interest);
        System.out.println("compound Interest:"+c_interest);
    }    
}
