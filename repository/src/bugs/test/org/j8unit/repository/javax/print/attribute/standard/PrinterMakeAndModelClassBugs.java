package org.j8unit.repository.javax.print.attribute.standard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import java.lang.reflect.Method;
import javax.print.attribute.standard.PrinterMakeAndModel;
import org.junit.Test;

/**
 * @since 0.9.7
 */
public class PrinterMakeAndModelClassBugs {

    @Test(expected = NoSuchMethodException.class /* because there is a bug! */)
    public void equalsWithoutHashCode()
    throws Exception {
        // verify presence of overridden #equals(Object) method
        try {
            final Method equalsMethod = PrinterMakeAndModel.class.getDeclaredMethod("equals", Object.class);
            assert equalsMethod != null;
            assertEquals(PrinterMakeAndModel.class, equalsMethod.getDeclaringClass());
        } catch (final NoSuchMethodException | SecurityException unexpected) {
            fail(unexpected.getMessage());
        }
        // provoke NoSuchMethodException by missing corresponding #hashCode() method
        PrinterMakeAndModel.class.getDeclaredMethod("hashCode");
    }

}
