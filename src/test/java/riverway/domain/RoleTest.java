package riverway.domain;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoleTest {

    @Test
    public void hasAdmin_consumer() {
        assertFalse(Role.hasSeller(Role.USER));
    }

    @Test
    public void hasAdmin_seller() {
        assertTrue(Role.hasSeller(Role.ADMIN));
    }
}
