package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.awt.Point;
import java.lang.reflect.Method;
import org.junit.Test;

/**
 * @since 0.9.7
 */
public class PointClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = Point.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(Point.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        Point.class.getDeclaredMethod("hashCode");
    }

}
