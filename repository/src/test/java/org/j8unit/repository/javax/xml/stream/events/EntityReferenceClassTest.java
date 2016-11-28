package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EntityReference;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EntityReference} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.EntityReferenceClassTests}).
 */
@RunWith(J8Unit4.class)
public class EntityReferenceClassTest
implements EntityReferenceClassTests<EntityReference> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.EntityReference]

    @Override
    public Class<EntityReference> createNewSUT() {
        return EntityReference.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.EntityReference]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.EntityReference]

}
