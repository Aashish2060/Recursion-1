public class Main {
    public static void printDEca(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDEca(n-1);
    }
    public static void printAsc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printDEca(n-1);
        System.out.println(n+" ");

    }
    public static void main(String[] args) {
       printDEca(10);
       System.out.println("Ascending...");
       printAsc(10);
    }
}