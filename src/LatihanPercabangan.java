import java.util.Scanner;
public class LatihanPercabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Memasukkan kata: ");
        String kata = input.next().toLowerCase();

        if (kata.equals("merah")) {
            System.out.println("Anda harus berhenti.");
        } else if (kata.equals("kuning")) {
            System.out.println("Persiapan berhenti.");
        } else if (kata.equals("hijau")) {
            System.out.println("Silakan jalan.");
        } else {
            System.out.println("Warna salah.");
        }
    }
}
