package org.j8unit.repository.java.awt.image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.awt.image.ComponentColorModel;
import java.lang.reflect.Method;
import org.junit.Test;

public class ComponentColorModelClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = ComponentColorModel.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(ComponentColorModel.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        ComponentColorModel.class.getDeclaredMethod("hashCode");
    }

}
