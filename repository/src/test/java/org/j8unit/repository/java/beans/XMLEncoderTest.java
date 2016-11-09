package org.j8unit.repository.java.beans;

import java.beans.XMLEncoder;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XMLEncoder} (by simply reusing the
 * J8Unit test interface {@link XMLEncoderTests}).
 */

@RunWith(J8Unit4.class)
public class XMLEncoderTest
implements XMLEncoderTests<XMLEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.XMLEncoder]

    @Override
    public XMLEncoder createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.XMLEncoder], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.XMLEncoder]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.XMLEncoder]

}
