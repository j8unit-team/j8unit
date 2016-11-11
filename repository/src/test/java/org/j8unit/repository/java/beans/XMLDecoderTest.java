package org.j8unit.repository.java.beans;

import java.beans.XMLDecoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLDecoder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.beans.XMLDecoderTests}).
 */

@RunWith(J8Unit4.class)
public class XMLDecoderTest
implements XMLDecoderTests<XMLDecoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.XMLDecoder]

    @Override
    public XMLDecoder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.XMLDecoder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.XMLDecoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.XMLDecoder]

}
