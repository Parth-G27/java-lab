import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 10;
        int w;
        int[] my = new int[max];
        int[] my2 = new int[max];
        System.out.println("enter no. of elements \n");
        w = scan.nextInt();
        System.out.println("enter elements for array 1\n");
        for(int i = 0 ; i<w;i++){
            my[i] = scan.nextInt();
        }
        System.out.println("enter elements for array 2\n");
        for(int i = 0 ; i<w;i++){
            my2[i] = scan.nextInt();
        }
        int[] my3 = new int[max];
        for(int i =0 ;i<w;i++){
            my3[i]=my[i]*my2[i];
        }
        System.out.println("Multiplied array \n");
        for(int i =0 ;i<w;i++){
            System.out.println(my3[i]);
        }
        
        scan.close();
        
        
    }
}
