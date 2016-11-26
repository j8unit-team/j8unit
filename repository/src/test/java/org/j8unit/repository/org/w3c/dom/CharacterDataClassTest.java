package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.CharacterData;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CharacterData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.w3c.dom.CharacterDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class CharacterDataClassTest
implements CharacterDataClassTests<CharacterData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.CharacterData]

    @Override
    public Class<CharacterData> createNewSUT() {
        return CharacterData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.CharacterData]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.CharacterData]

}
