package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharSequence} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.lang.CharSequenceClassTests}).
 */

@RunWith(J8Unit4.class)
public class CharSequenceClassTest
implements CharSequenceClassTests<CharSequence> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.CharSequence]

    @Override
    public Class<CharSequence> createNewSUT() {
        return CharSequence.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.CharSequence]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.CharSequence]

}
