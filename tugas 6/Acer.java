public class Acer implements Laptop {

    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Laptop Acer menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Laptop Acer mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 10;
            System.out.println("Volume Acer: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 10;
            System.out.println("Volume Acer: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu.");
        }
    }
}