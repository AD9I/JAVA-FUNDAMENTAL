import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double ra = s.nextDouble();
        double he = s.nextDouble();
        double v = Math.PI * ra * ra * he;
        System.out.println(v);
    }
}
