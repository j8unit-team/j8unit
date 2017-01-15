package org.j8unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class J8UnitTestTest {

    @Test
    public void testFunctionalInterfaceStyle() {
        final J8UnitTest<String> t = String::new;
        final String sut = t.createNewSUT();
        assertNotNull(sut);
        assertEquals("", sut);
    }

}
