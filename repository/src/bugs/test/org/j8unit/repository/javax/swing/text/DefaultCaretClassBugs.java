package org.j8unit.repository.javax.swing.text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import javax.swing.text.DefaultCaret;
import org.junit.Test;

public class DefaultCaretClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = DefaultCaret.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(DefaultCaret.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        DefaultCaret.class.getDeclaredMethod("hashCode");
    }

}
