import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class BootMgntTest {
    @Test
    public void rentBootTest_success() {
        BootMgnt bootMgnt = new BootMgnt();

        try {
            bootMgnt.rentBoot(10, "Nina", "Pups");
        } catch (BootBesetztExeption bootBesetztExeption) {
            bootBesetztExeption.printStackTrace();
        }

        assertThat(bootMgnt.getBoote()[10].toString(), is("Nina;Pups;10"));
    }

    @Test
    public void rentBootTest_failure() {
        BootMgnt bootMgnt = new BootMgnt();
        boolean exception = false;

        try {
            bootMgnt.rentBoot(10, "Nina", "Pups");
            bootMgnt.rentBoot(10, "Maggi", "Baum");
        } catch (BootBesetztExeption bootBesetztExeption) {
            exception = true;
        }

        assertThat(exception, is(true));
    }
}