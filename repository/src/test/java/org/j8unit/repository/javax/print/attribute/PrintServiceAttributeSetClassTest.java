package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintServiceAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintServiceAttributeSet} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.PrintServiceAttributeSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintServiceAttributeSetClassTest
implements PrintServiceAttributeSetClassTests<PrintServiceAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintServiceAttributeSet]

    @Override
    public Class<PrintServiceAttributeSet> createNewSUT() {
        return PrintServiceAttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintServiceAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintServiceAttributeSet]

}
