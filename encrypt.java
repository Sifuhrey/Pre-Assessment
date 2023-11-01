import java.util.Scanner;

public class encrypt{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a>9999 && a<999 && b>9999 && b<999 && c>9999 && c<999){
            System.exit(0);
        }else{
            int result1 = ubah(a);
            int result2 = ubah(b);
            int result3 = ubah(c);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        }
    }
    public static int ubah(int data){
        int digit1 = (data / 1000 + 5) % 10;
        int digit2 = ((data / 100) % 10 + 5) % 10;
        int digit3 = ((data / 10) % 10 + 5) % 10;
        int digit4 = (data % 10 + 5) % 10;

        int hasilencrypt = (digit1*1000)+(digit4*100)+(digit3*10)+digit2;
        return hasilencrypt;
    }
}
