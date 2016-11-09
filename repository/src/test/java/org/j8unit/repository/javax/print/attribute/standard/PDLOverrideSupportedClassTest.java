package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.PDLOverrideSupported;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PDLOverrideSupported} (by simply reusing
 * the J8Unit test interface {@link PDLOverrideSupportedClassTests}).
 */

@RunWith(J8Unit4.class)
public class PDLOverrideSupportedClassTest
implements PDLOverrideSupportedClassTests<PDLOverrideSupported> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.PDLOverrideSupported]

    @Override
    public Class<PDLOverrideSupported> createNewSUT() {
        return PDLOverrideSupported.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.PDLOverrideSupported]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.PDLOverrideSupported]

}
