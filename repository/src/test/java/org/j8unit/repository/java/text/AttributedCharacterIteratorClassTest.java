package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributedCharacterIteratorClassTest
implements org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests<java.text.AttributedCharacterIterator> {

    @Override
    public Class<java.text.AttributedCharacterIterator> createNewSUT() {
        return java.text.AttributedCharacterIterator.class;
    }

    @RunWith(J8Unit4.class)
    public static class AttributeClassTest
    implements org.j8unit.repository.java.text.AttributedCharacterIteratorClassTests.AttributeClassTests<java.text.AttributedCharacterIterator.Attribute> {

        @Override
        public Class<java.text.AttributedCharacterIterator.Attribute> createNewSUT() {
            return java.text.AttributedCharacterIterator.Attribute.class;
        }

    }

}
