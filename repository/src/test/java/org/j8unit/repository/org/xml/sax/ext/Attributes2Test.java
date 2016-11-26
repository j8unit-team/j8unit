package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ext.Attributes2;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Attributes2} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.Attributes2Tests}).
 */
@RunWith(J8Unit4.class)
public class Attributes2Test
implements Attributes2Tests<Attributes2> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.Attributes2]

    @Override
    public Attributes2 createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ext.Attributes2], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.Attributes2]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.Attributes2]

}
