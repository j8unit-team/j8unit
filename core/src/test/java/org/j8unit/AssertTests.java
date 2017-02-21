package org.j8unit;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AssertTests {

    @Test
    public void testInstanciability()
    throws Exception {
        final Assert instance = new Assert();
        assertNotNull(instance);
    }

}
