public class Recursion {
    private static int recursion(int n) {
        if(n==0) return n;
        recursion(n-1);
        return n;
    }
    public static void main(String[] args) {
        int n=5;
        int ans = recursion(n);
        System.out.print(ans);
    }
}