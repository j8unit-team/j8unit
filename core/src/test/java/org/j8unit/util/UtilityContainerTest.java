package org.j8unit.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.lang.reflect.Method;

public class UtilityContainerTest {

    public static final <E extends Enum<E>> void testUtilityContainerCharacteristics(final Class<E> clazz)
    throws Exception {
        assertTrue(clazz.isEnum());
        final Enum<?>[] constants = clazz.getEnumConstants();
        assertNotNull(constants);
        assertEquals(0, constants.length);
        final Method valuesMethod = clazz.getMethod("values");
        final E[] values = (E[]) valuesMethod.invoke(null);
        assertNotNull(values);
        assertEquals(0, values.length);
    }

}
