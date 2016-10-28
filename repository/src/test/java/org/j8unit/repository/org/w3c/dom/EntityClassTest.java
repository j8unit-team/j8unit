package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Entity;

@RunWith(J8Unit4.class)
public class EntityClassTest
implements org.j8unit.repository.org.w3c.dom.EntityClassTests<Entity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Entity]

    @Override
    public Class<Entity> createNewSUT() {
        return Entity.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Entity]

}
