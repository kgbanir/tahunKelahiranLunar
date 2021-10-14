import java.util.Scanner;

public class tahunCina {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Taipkan Tahun Kelahiran anda:");
        int tahun=input.nextInt();

        switch (tahun % 12) {
            case 0 : System.out.println("Monyet");
            break;
            case 1 : System.out.println("Ayam");
            break;
            case 2 : System.out.println("Anjing");
            break;
            case 3 : System.out.println("Khinzir");
            break;
            case 4 : System.out.println("Tikus");
            break;
            case 5 : System.out.println("Lembu");
            break;
            case 6 : System.out.println("Harimau");
            break;
            case 7 : System.out.println("Arnab");
            break;
            case 8 : System.out.println("Naga");
            break;
            case 9 : System.out.println("Ular");
            break;
            case 10 : System.out.println("Kuda");
            break;
            case 11 : System.out.println("Kambing");
            break;


        }

    }
}
