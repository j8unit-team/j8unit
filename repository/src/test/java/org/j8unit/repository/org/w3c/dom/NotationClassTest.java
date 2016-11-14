package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.Notation;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Notation} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.w3c.dom.NotationClassTests}).
 */

@RunWith(J8Unit4.class)
public class NotationClassTest
implements NotationClassTests<Notation> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.Notation]

    @Override
    public Class<Notation> createNewSUT() {
        return Notation.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.Notation]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.Notation]

}
