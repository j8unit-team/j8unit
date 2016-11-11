package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintJobAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintJobAttributeSet} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.print.attribute.PrintJobAttributeSetClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrintJobAttributeSetClassTest
implements PrintJobAttributeSetClassTests<PrintJobAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintJobAttributeSet]

    @Override
    public Class<PrintJobAttributeSet> createNewSUT() {
        return PrintJobAttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintJobAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintJobAttributeSet]

}
