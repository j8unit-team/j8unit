package org.j8unit.repository.java.text;

import java.text.CharacterIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharacterIterator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.text.CharacterIteratorClassTests}).
 */
@RunWith(J8Unit4.class)
public class CharacterIteratorClassTest
implements CharacterIteratorClassTests<CharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.CharacterIterator]

    @Override
    public Class<CharacterIterator> createNewSUT() {
        return CharacterIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.CharacterIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.CharacterIterator]

}
