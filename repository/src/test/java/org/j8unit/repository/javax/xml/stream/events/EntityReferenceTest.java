package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EntityReference;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EntityReference} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.EntityReferenceTests}).
 */
@RunWith(J8Unit4.class)
public class EntityReferenceTest
implements EntityReferenceTests<EntityReference> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.EntityReference]

    @Override
    public EntityReference createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.EntityReference], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.EntityReference]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.EntityReference]

}
