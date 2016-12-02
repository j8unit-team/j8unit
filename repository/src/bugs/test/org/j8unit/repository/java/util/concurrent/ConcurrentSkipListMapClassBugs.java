package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentSkipListMap;
import org.junit.Test;

/**
 * @since 0.9.7
 */
public class ConcurrentSkipListMapClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = ConcurrentSkipListMap.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(ConcurrentSkipListMap.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        ConcurrentSkipListMap.class.getDeclaredMethod("hashCode");
    }

}
