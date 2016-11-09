package org.j8unit.repository.java.text;

import java.text.CharacterIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CharacterIterator} (by simply reusing
 * the J8Unit test interface {@link CharacterIteratorTests}).
 */

@RunWith(J8Unit4.class)
public class CharacterIteratorTest
implements CharacterIteratorTests<CharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.CharacterIterator]

    @Override
    public CharacterIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.CharacterIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.text.CharacterIterator]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.text.CharacterIterator]

}
