package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.EntityResolver;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link EntityResolver} (by simply reusing the
 * J8Unit test interface {@link EntityResolverClassTests}).
 */

@RunWith(J8Unit4.class)
public class EntityResolverClassTest
implements EntityResolverClassTests<EntityResolver> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.EntityResolver]

    @Override
    public Class<EntityResolver> createNewSUT() {
        return EntityResolver.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.EntityResolver]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.EntityResolver]

}
