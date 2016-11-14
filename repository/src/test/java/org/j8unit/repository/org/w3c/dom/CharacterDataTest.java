package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.CharacterData;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CharacterData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.CharacterDataTests}).
 */

@RunWith(J8Unit4.class)
public class CharacterDataTest
implements CharacterDataTests<CharacterData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.CharacterData]

    @Override
    public CharacterData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.CharacterData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.w3c.dom.CharacterData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.w3c.dom.CharacterData]

}
