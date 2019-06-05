public class Boot {

    private String firstName;
    private String lastName;
    private int bootId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBootId() {
        return bootId;
    }

    public void setBootId(int bootId) {
        this.bootId = bootId;
    }

    public Boot(String firstName, String lastName, int bootId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bootId = bootId;
    }

    @Override
    public String toString() {
        return getFirstName() +";"+ getLastName() + ";"+getBootId();
    }
}