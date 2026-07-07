import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Laptop laptop;

        System.out.println("=== PILIH LAPTOP ===");
        System.out.println("1. Acer");
        System.out.println("2. Lenovo");
        System.out.println("3. Toshiba");
        System.out.println("4. MacBook");
        System.out.print("Pilihan : ");
        int pilih = input.nextInt();
        input.nextLine();

        switch (pilih) {
            case 1:
                laptop = new Acer();
                break;
            case 2:
                laptop = new Lenovo();
                break;
            case 3:
                laptop = new Toshiba();
                break;
            case 4:
                laptop = new MacBook();
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
                return;
        }

        String menu;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("ON    : Menyalakan Laptop");
            System.out.println("OFF   : Mematikan Laptop");
            System.out.println("UP    : Menambah Volume");
            System.out.println("DOWN  : Mengurangi Volume");
            System.out.println("EXIT  : Keluar");
            System.out.print("Masukkan Perintah : ");

            menu = input.nextLine().toUpperCase();

            switch (menu) {
                case "ON":
                    laptop.powerOn();
                    break;

                case "OFF":
                    laptop.powerOff();
                    break;

                case "UP":
                    laptop.volumeUp();
                    break;

                case "DOWN":
                    laptop.volumeDown();
                    break;

                case "EXIT":
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Perintah tidak dikenali.");
            }

        } while (!menu.equals("EXIT"));

        input.close();
    }
}