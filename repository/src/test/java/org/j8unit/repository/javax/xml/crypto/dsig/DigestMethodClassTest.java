package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.DigestMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DigestMethod} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.DigestMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class DigestMethodClassTest
implements DigestMethodClassTests<DigestMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.DigestMethod]

    @Override
    public Class<DigestMethod> createNewSUT() {
        return DigestMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.DigestMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.DigestMethod]

}
