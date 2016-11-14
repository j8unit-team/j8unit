package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReferenceUriSchemesSupported} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.print.attribute.standard.ReferenceUriSchemesSupportedClassTests}).
 */

@RunWith(J8Unit4.class)
public class ReferenceUriSchemesSupportedClassTest
implements ReferenceUriSchemesSupportedClassTests<ReferenceUriSchemesSupported> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.ReferenceUriSchemesSupported]

    @Override
    public Class<ReferenceUriSchemesSupported> createNewSUT() {
        return ReferenceUriSchemesSupported.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.ReferenceUriSchemesSupported]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.ReferenceUriSchemesSupported]

}
