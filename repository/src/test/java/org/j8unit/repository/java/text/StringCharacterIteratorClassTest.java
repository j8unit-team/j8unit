package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringCharacterIteratorClassTest
implements org.j8unit.repository.java.text.StringCharacterIteratorClassTests<java.text.StringCharacterIterator> {

    @Override
    public Class<java.text.StringCharacterIterator> createNewSUT() {
        return java.text.StringCharacterIterator.class;
    }

}
