package org.j8unit.repository.javax.xml;

import javax.xml.XMLConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLConstants} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.XMLConstantsTests}).
 */
@RunWith(J8Unit4.class)
public class XMLConstantsTest
implements XMLConstantsTests<XMLConstants> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.XMLConstants]

    @Override
    public XMLConstants createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.XMLConstants], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.XMLConstants]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.XMLConstants]

}
