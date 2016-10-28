package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.w3c.dom.Entity;

@RunWith(J8Unit4.class)
public class EntityTest
implements org.j8unit.repository.org.w3c.dom.EntityTests<Entity> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.Entity]

    @Override
    public Entity createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.w3c.dom.Entity], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.w3c.dom.Entity]

}
