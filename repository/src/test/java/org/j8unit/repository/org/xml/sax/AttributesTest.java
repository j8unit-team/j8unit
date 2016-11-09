package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Attributes} (by simply reusing the
 * J8Unit test interface {@link AttributesTests}).
 */

@RunWith(J8Unit4.class)
public class AttributesTest
implements AttributesTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Attributes]

    @Override
    public Attributes createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.Attributes], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.Attributes]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.Attributes]

}
