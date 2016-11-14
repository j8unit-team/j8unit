package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.DTDConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DTDConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.parser.DTDConstantsTests}).
 */

@RunWith(J8Unit4.class)
public class DTDConstantsTest
implements DTDConstantsTests<DTDConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.parser.DTDConstants]

    @Override
    public DTDConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.html.parser.DTDConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.parser.DTDConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.parser.DTDConstants]

}
