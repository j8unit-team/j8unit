package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.ls.LSSerializer;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link LSSerializer} (by simply reusing the
 * J8Unit test interface {@link LSSerializerClassTests}).
 */

@RunWith(J8Unit4.class)
public class LSSerializerClassTest
implements LSSerializerClassTests<LSSerializer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.ls.LSSerializer]

    @Override
    public Class<LSSerializer> createNewSUT() {
        return LSSerializer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.ls.LSSerializer]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.ls.LSSerializer]

}
