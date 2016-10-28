package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.CharacterData;

@RunWith(J8Unit4.class)
public class CharacterDataTest
implements org.j8unit.repository.org.w3c.dom.CharacterDataTests<CharacterData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.CharacterData]

    @Override
    public CharacterData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.CharacterData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.CharacterData]

}
