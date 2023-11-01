import java.util.Scanner;

public class penjumlahan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int hasil = a + b;
        int ratus = hasil / 100;
        int puluh = (hasil % 100) / 10;
        int satuan = hasil % 10;
        if (ratus <= 1 && puluh <= 1 && satuan <= 1 && hasil < 100) {
            System.exit(0);
        } else {
            String ratushuruf = letter(ratus);
            String puluhhuruf = letter(puluh);
            String satuanhuruf = letter(satuan);
            System.out.println(ratushuruf + " ratus " + puluhhuruf + " puluh " + satuanhuruf);

        }
    }

    public static String letter(int number) {
        String tulisan = null;
        switch (number) {
            case 2:
                tulisan = "dua";
                break;
            case 3:
                tulisan = "tiga";
                break;
            case 4:
                tulisan = "empat";
                break;
            case 5:
                tulisan = "lima";
                break;
            case 6:
                tulisan = "enam";
                break;
            case 7:
                tulisan = "tujuh";
                break;
            case 8:
                tulisan = "delapan";
                break;
            case 9:
                tulisan = "sembilan";

        }
        return tulisan;
    }
}