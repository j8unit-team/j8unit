package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EntityDeclaration;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EntityDeclaration} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.EntityDeclarationTests}).
 */
@RunWith(J8Unit4.class)
public class EntityDeclarationTest
implements EntityDeclarationTests<EntityDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.events.EntityDeclaration]

    @Override
    public EntityDeclaration createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.events.EntityDeclaration], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.events.EntityDeclaration]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.events.EntityDeclaration]

}
