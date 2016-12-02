package org.j8unit.repository.java.awt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import org.junit.Test;

public class RectangleClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = Rectangle.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(Rectangle.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        Rectangle.class.getDeclaredMethod("hashCode");
    }

}
