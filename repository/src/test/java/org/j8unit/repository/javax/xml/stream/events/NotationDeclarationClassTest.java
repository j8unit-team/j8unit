package org.j8unit.repository.javax.xml.stream.events;

import javax.xml.stream.events.NotationDeclaration;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NotationDeclaration} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.events.NotationDeclarationClassTests}).
 */
@RunWith(J8Unit4.class)
public class NotationDeclarationClassTest
implements NotationDeclarationClassTests<NotationDeclaration> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.events.NotationDeclaration]

    @Override
    public Class<NotationDeclaration> createNewSUT() {
        return NotationDeclaration.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.events.NotationDeclaration]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.events.NotationDeclaration]

}
