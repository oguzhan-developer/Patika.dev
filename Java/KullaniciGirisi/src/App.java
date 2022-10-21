import java.util.Arrays;

public class App {
    
    static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }
    
    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }
    
    public static void main(String[] args) throws Exception {
        boolean a = true, b = false;
System.out.println((a && b) || (a || b));
    }
}
