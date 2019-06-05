public class BootMgnt {

    private Boot [] boote = new Boot[101];

    public void rentBoot(int bootId,String firstName,String lastName) throws BootBesetztExeption {

        Boot boot = new Boot(firstName,lastName,bootId);

        if ( boote[bootId] == null) {
            boote[bootId] = boot;
        } else {
            throw new BootBesetztExeption();
        }
    }

    public void printBoot(){

        for (int i = 0; i < boote.length ; i++) {
            if (boote[i] != null) {
                System.out.println(boote[i]);
            }
        }
    }

    public Boot[] getBoote() {
        return boote;
    }
}