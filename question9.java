import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}
