package org.j8unit.repository.java.text;

import java.text.AttributedCharacterIterator;
import java.text.AttributedCharacterIterator.Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributedCharacterIteratorClassTest
implements org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests<AttributedCharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.AttributedCharacterIterator]

    @Override
    public Class<AttributedCharacterIterator> createNewSUT() {
        return AttributedCharacterIterator.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.AttributedCharacterIterator]

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests.AttributeClassTests<Attribute> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.AttributedCharacterIterator$Attribute]

        @Override
        public Class<Attribute> createNewSUT() {
            return Attribute.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[java.text.AttributedCharacterIterator$Attribute]

    }

}
