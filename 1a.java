import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, World!");
        double l, b, a;
        System.out.println("enter l \n");
        l = scan.nextDouble();
        System.out.println("enter b \n");
        b = scan.nextDouble();
        a = l*b;
        System.out.println("Area = "+a);
        scan.close();
        
        
    }
}
