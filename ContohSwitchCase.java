public class ContohSwitchCase {

    public static void main(String[] args) {

        int nomor = 1;

        switch (nomor) {
            case 1:
                System.out.println("Kamu pilih satu");
                break;
            case 2:
                System.out.println("Kamu pilih dua");
                break;
            case 3:
                System.out.println("Kamu pilih tiga");
                break;
            default:
                System.out.println("Kamu pilih selain angka 1, 2, dan 3");
        }
    }
}
