package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.ext.EntityResolver2;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EntityResolver2} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.xml.sax.ext.EntityResolver2ClassTests}).
 */
@RunWith(J8Unit4.class)
public class EntityResolver2ClassTest
implements EntityResolver2ClassTests<EntityResolver2> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.ext.EntityResolver2]

    @Override
    public Class<EntityResolver2> createNewSUT() {
        return EntityResolver2.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.ext.EntityResolver2]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.ext.EntityResolver2]

}
