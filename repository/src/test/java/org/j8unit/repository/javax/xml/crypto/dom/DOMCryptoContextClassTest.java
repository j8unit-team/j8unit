package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMCryptoContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DOMCryptoContext} (by simply reusing the
 * J8Unit test interface {@link DOMCryptoContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class DOMCryptoContextClassTest
implements DOMCryptoContextClassTests<DOMCryptoContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dom.DOMCryptoContext]

    @Override
    public Class<DOMCryptoContext> createNewSUT() {
        return DOMCryptoContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dom.DOMCryptoContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dom.DOMCryptoContext]

}
