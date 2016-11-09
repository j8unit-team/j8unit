package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintRequestAttribute} (by simply reusing
 * the J8Unit test interface {@link PrintRequestAttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintRequestAttributeClassTest
implements PrintRequestAttributeClassTests<PrintRequestAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintRequestAttribute]

    @Override
    public Class<PrintRequestAttribute> createNewSUT() {
        return PrintRequestAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintRequestAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintRequestAttribute]

}
