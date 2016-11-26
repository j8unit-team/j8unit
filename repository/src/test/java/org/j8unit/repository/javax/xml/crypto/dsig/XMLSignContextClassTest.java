package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLSignContext} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class XMLSignContextClassTest
implements XMLSignContextClassTests<XMLSignContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLSignContext]

    @Override
    public Class<XMLSignContext> createNewSUT() {
        return XMLSignContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLSignContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLSignContext]

}
