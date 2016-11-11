package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLSignContext;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLSignContext} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextTests}).
 */

@RunWith(J8Unit4.class)
public class XMLSignContextTest
implements XMLSignContextTests<XMLSignContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignContext]

    @Override
    public XMLSignContext createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.crypto.dsig.XMLSignContext], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.XMLSignContext]

}
