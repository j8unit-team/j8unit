package org.j8unit.repository.java.security.cert;

import java.security.cert.CRLSelector;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CRLSelector} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.security.cert.CRLSelectorClassTests}).
 */

@RunWith(J8Unit4.class)
public class CRLSelectorClassTest
implements CRLSelectorClassTests<CRLSelector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.CRLSelector]

    @Override
    public Class<CRLSelector> createNewSUT() {
        return CRLSelector.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.CRLSelector]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.CRLSelector]

}
