package org.j8unit.repository.javax.swing.text.html.parser;

import javax.swing.text.html.parser.DTDConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DTDConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.parser.DTDConstantsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DTDConstantsClassTest
implements DTDConstantsClassTests<DTDConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.html.parser.DTDConstants]

    @Override
    public Class<DTDConstants> createNewSUT() {
        return DTDConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.html.parser.DTDConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.html.parser.DTDConstants]

}
