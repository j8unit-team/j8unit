package org.j8unit.repository.java.text;

import java.text.CharacterIterator;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharacterIteratorTest
implements org.j8unit.repository.java.text.CharacterIteratorTests<CharacterIterator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.CharacterIterator]

    @Override
    public CharacterIterator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.text.CharacterIterator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.text.CharacterIterator]

}
