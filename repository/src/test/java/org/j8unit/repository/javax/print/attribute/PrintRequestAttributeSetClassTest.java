package org.j8unit.repository.javax.print.attribute;

import javax.print.attribute.PrintRequestAttributeSet;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrintRequestAttributeSet} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.PrintRequestAttributeSetClassTests}).
 */
@RunWith(J8Unit4.class)
public class PrintRequestAttributeSetClassTest
implements PrintRequestAttributeSetClassTests<PrintRequestAttributeSet> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.PrintRequestAttributeSet]

    @Override
    public Class<PrintRequestAttributeSet> createNewSUT() {
        return PrintRequestAttributeSet.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.PrintRequestAttributeSet]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.PrintRequestAttributeSet]

}
