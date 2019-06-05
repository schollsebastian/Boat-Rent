import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class BootTest {
    @Test
    public void bootTest() {
        Boot boot = new Boot("Nina", "Pups", 10);

        assertThat(boot.getFirstName(), is("Nina"));
        assertThat(boot.getLastName(), is("Pups"));
        assertThat(boot.getBootId(), is(10));
    }

}