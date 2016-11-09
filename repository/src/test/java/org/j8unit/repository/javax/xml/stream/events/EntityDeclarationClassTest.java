package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.EntityDeclaration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EntityDeclaration} (by simply reusing the
 * J8Unit test interface {@link EntityDeclarationClassTests}).
 */

@RunWith(J8Unit4.class)
public class EntityDeclarationClassTest
implements EntityDeclarationClassTests<EntityDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.EntityDeclaration]

    @Override
    public Class<EntityDeclaration> createNewSUT() {
        return EntityDeclaration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.EntityDeclaration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.EntityDeclaration]

}
