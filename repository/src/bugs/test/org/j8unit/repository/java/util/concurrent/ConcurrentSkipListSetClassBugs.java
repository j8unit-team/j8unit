package org.j8unit.repository.java.util.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentSkipListSet;
import org.junit.Test;

public class ConcurrentSkipListSetClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = ConcurrentSkipListSet.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(ConcurrentSkipListSet.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        ConcurrentSkipListSet.class.getDeclaredMethod("hashCode");
    }

}
