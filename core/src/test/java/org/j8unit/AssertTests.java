package org.j8unit;

import static java.lang.reflect.Modifier.isFinal;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class AssertTests {

    @Test
    public void testInstanciability()
    throws Exception {
        final Assert instance = new Assert();
        assertNotNull(instance);
    }

    @Test
    public void testExtendability()
    throws Exception {
        assertFalse(isFinal(Assert.class.getModifiers()));
        final Assert subInstance = new Assert() {};
        assertNotNull(subInstance);
    }

}
