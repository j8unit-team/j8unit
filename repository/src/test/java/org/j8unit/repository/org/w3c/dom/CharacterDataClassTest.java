package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharacterDataClassTest
implements org.j8unit.repository.org.w3c.dom.CharacterDataClassTests<org.w3c.dom.CharacterData> {

    @Override
    public Class<org.w3c.dom.CharacterData> createNewSUT() {
        return org.w3c.dom.CharacterData.class;
    }

}
