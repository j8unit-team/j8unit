package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Entity;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Entity} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.EntityClassTests}).
 */

@RunWith(J8Unit4.class)
public class EntityClassTest
implements EntityClassTests<Entity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Entity]

    @Override
    public Class<Entity> createNewSUT() {
        return Entity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Entity]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Entity]

}
