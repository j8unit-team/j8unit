package org.j8unit.repository.javax.xml.crypto.dom;

import javax.xml.crypto.dom.DOMCryptoContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DOMCryptoContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dom.DOMCryptoContextTests}).
 */

@RunWith(J8Unit4.class)
public class DOMCryptoContextTest
implements DOMCryptoContextTests<DOMCryptoContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dom.DOMCryptoContext]

    @Override
    public DOMCryptoContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.dom.DOMCryptoContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dom.DOMCryptoContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dom.DOMCryptoContext]

}
