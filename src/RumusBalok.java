import java.util.Scanner;
public class RumusBalok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        int p = input.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int l = input.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int t = input.nextInt();

        int luasPermukaan = 2*((p*l)+(p*t)+(l*t));
        int volume = p*l*t;
        System.out.println("Luas permukaan balok: " + luasPermukaan);
        System.out.println("Volume balok: " + volume);
    }
}
