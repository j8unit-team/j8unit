package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.XMLCryptoContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLCryptoContext} (by simply reusing the
 * J8Unit test interface {@link XMLCryptoContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLCryptoContextClassTest
implements XMLCryptoContextClassTests<XMLCryptoContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.XMLCryptoContext]

    @Override
    public Class<XMLCryptoContext> createNewSUT() {
        return XMLCryptoContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.XMLCryptoContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.XMLCryptoContext]

}
