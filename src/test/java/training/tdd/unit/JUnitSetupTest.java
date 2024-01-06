package training.tdd.unit;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

public class JUnitSetupTest {
    @Test
    void verifyJUnit() {
        assertTrue(true);
    }

    @Test
    void verifyMockito() {
        Blah mockBlah = mock(Blah.class);
        mockBlah.doIt();
        Mockito.verify(mockBlah).doIt();
    }

    @Test
    void verifyHamcrest() {
        MatcherAssert.assertThat(new Blah(), is(not(new Blah())));
    }

    @Test
    void verifyAssertJ() {
        assertThat(new Blah()).isNotEqualTo(new Blah());
    }

    private static class Blah {
        public void doIt() {
        }
    }
}
