import java.util.Scanner;
public class RumusBangunRuang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = Math.PI;

        System.out.println("Program penghitung bangun ruang.");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.println("5. Bola");
        System.out.print("Masukkan nomer pada opsi sesuai dengan bangun ruang yang ingin dihitung: ");
        int opsi = input.nextInt();

        switch(opsi) {
            case 1 :
                System.out.println("Menghitung bangun ruang kubus");
                System.out.print("Masukkan panjang sisi kubus: ");
                int s = input.nextInt();
                int VKubus = s*s*s;
                int LPKubus = 6*s*s;
                System.out.println("Hasil volume kubus: " + VKubus);
                System.out.println("Hasil luas permukaan kubus: " + LPKubus);
                break;

            case 2 :
                System.out.println("Menghitung bangun ruang balok");
                System.out.print("Masukkan panjang balok: ");
                int p = input.nextInt();
                System.out.print("Masukkan lebar balok: ");
                int l = input.nextInt();
                System.out.print("Masukkan tinggi balok: ");
                int t = input.nextInt();
                int LPBalok = 2*((p*l)+(p*t)+(l*t));
                int VBalok = p*l*t;
                System.out.println("Hasil volume balok: " + VBalok);
                System.out.println("Hasil luas permukaan balok: " + LPBalok);
                break;

            case 3 :
                System.out.println("Menghitung bangun ruang tabung");
                System.out.print("Masukkan jari-jari alas tabung: ");
                int rtabung = input.nextInt();
                System.out.print("Masukkan tinggi tabung: ");
                int ttabung = input.nextInt();
                int VTabung = (int) (pi*rtabung*rtabung*ttabung);
                int LPTabung = (int) (2*pi*rtabung*(rtabung+ttabung));
                System.out.println("Hasil volume tabung: " + VTabung);
                System.out.println("Hasil luas permukaan tabung: " + LPTabung);
                break;

            case 4 :
                System.out.println("Menghitung bangun ruang kerucut");
                System.out.print("Masukkan jari-jari alas kerucut: ");
                int rkerucut = input.nextInt();
                System.out.print("Masukkan garis pelukis kerucut: ");
                int gkerucut = input.nextInt();
                int VKerucut = (int) (((double) 1/3)*pi*rkerucut*rkerucut);
                int LPKerucut = (int) (pi*rkerucut*(rkerucut+gkerucut));
                System.out.println("Hasil volume kerucut: " + VKerucut);
                System.out.println("Hasil luas permukaan kerucut: " + LPKerucut);
                break;

            case 5 :
                System.out.println("Menghitung bangun ruang bola");
                System.out.print("Masukkan jari-jari bola: ");
                int rbola = input.nextInt();
                int VBola = (int) (((double) 4/3)*pi*rbola*rbola*rbola);
                int LPBola = (int) (4*pi*rbola*rbola);
                System.out.println("Hasil volume bola: " + VBola);
                System.out.println("Hasil luas permukaan tabung: " + LPBola);
                break;

            default:
                System.out.println("Anda salah memasukkan nomer.");
                break;
        }

    }
}
