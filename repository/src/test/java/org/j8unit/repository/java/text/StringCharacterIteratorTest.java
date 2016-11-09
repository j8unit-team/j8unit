package org.j8unit.repository.java.text;

import java.text.StringCharacterIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StringCharacterIterator} (by simply
 * reusing the J8Unit test interface {@link StringCharacterIteratorTests}).
 */

@RunWith(J8Unit4.class)
public class StringCharacterIteratorTest
implements StringCharacterIteratorTests<StringCharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.StringCharacterIterator]

    @Override
    public StringCharacterIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.text.StringCharacterIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.StringCharacterIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.StringCharacterIterator]

}
