package org.j8unit.repository.java.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharacterIteratorClassTest
implements org.j8unit.repository.java.text.CharacterIteratorClassTests<java.text.CharacterIterator> {

    @Override
    public Class<java.text.CharacterIterator> createNewSUT() {
        return java.text.CharacterIterator.class;
    }

}
