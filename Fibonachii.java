public class Fibonachii {
    public static int fib(int n){
        if(n==1||n==0){
            return n;
        }
        int feb1=fib(n-1);
        int fib2=fib(n-2);
        int fibonachi= feb1+fib2;
        return fibonachi;
    }
    public static void main(String[] args){
        int n=25;
        System.out.println(fib(n));
    }
}
