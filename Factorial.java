public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnmo=factorial(n-1);
        int fact=n*fnmo;
        return fact;
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum0=sum(n-1);
        int sum=n+sum0;
        return sum;
    }
    public static void  main(String[] args){
        int n=5;
        System.out.println(factorial(n));
        System.out.println(sum(n));

    }
}
