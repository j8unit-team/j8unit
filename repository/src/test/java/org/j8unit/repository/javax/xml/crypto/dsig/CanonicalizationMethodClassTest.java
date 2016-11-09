package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.CanonicalizationMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CanonicalizationMethod} (by simply
 * reusing the J8Unit test interface {@link CanonicalizationMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class CanonicalizationMethodClassTest
implements CanonicalizationMethodClassTests<CanonicalizationMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.CanonicalizationMethod]

    @Override
    public Class<CanonicalizationMethod> createNewSUT() {
        return CanonicalizationMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.CanonicalizationMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.CanonicalizationMethod]

}
