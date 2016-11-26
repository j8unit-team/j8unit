package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintServiceAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintServiceAttribute} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.PrintServiceAttributeClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintServiceAttributeClassTest
implements PrintServiceAttributeClassTests<PrintServiceAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintServiceAttribute]

    @Override
    public Class<PrintServiceAttribute> createNewSUT() {
        return PrintServiceAttribute.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintServiceAttribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintServiceAttribute]

}
