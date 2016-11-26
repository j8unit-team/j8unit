package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintJobAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobAttribute} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.PrintJobAttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintJobAttributeClassTest
implements PrintJobAttributeClassTests<PrintJobAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintJobAttribute]

    @Override
    public Class<PrintJobAttribute> createNewSUT() {
        return PrintJobAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintJobAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintJobAttribute]

}
