package org.j8unit.repository.java.text;

import java.text.AttributedString;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AttributedString} (by simply reusing
 * the J8Unit test interface {@link AttributedStringTests}).
 */

@RunWith(J8Unit4.class)
public class AttributedStringTest
implements AttributedStringTests<AttributedString> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.AttributedString]

    @Override
    public AttributedString createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.AttributedString], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.AttributedString]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.AttributedString]

}
