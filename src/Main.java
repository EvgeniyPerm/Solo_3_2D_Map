import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String map = sc.nextLine();
        int p1 = map.indexOf('P');
        int p2 = map.indexOf('P', p1+1);
        int w = Math.abs(p1/6 - p2/6);
        int h = Math.abs(p1%6 - p2%6);
        System.out.println(w+h);
    }
}