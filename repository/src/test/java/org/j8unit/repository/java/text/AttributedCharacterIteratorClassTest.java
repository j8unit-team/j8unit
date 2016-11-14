package org.j8unit.repository.java.text;

import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AttributedCharacterIterator} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests}).
 */

@RunWith(J8Unit4.class)
public class AttributedCharacterIteratorClassTest
implements AttributedCharacterIteratorClassTests<AttributedCharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.AttributedCharacterIterator]

    @Override
    public Class<AttributedCharacterIterator> createNewSUT() {
        return AttributedCharacterIterator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.AttributedCharacterIterator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.AttributedCharacterIterator]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Attribute} (by simply reusing the
     * J8Unit test interface
     * {@link org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests.AttributeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements AttributeClassTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.AttributedCharacterIterator$Attribute]

        @Override
        public Class<Attribute> createNewSUT() {
            return Attribute.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.AttributedCharacterIterator$Attribute]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.text.AttributedCharacterIterator$Attribute]

    }

}
