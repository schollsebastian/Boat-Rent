public class BootBesetztExeption extends Exception {

    public BootBesetztExeption() {

        super("Boot ist besetzt");
    }

    public BootBesetztExeption(String message) {
        super(message);
    }
}