package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLValidateContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLValidateContext} (by simply reusing
 * the J8Unit test interface {@link XMLValidateContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLValidateContextClassTest
implements XMLValidateContextClassTests<XMLValidateContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLValidateContext]

    @Override
    public Class<XMLValidateContext> createNewSUT() {
        return XMLValidateContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLValidateContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLValidateContext]

}
