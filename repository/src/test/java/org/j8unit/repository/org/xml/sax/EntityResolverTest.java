package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.EntityResolver;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EntityResolver} (by simply reusing
 * the J8Unit test interface {@link EntityResolverTests}).
 */

@RunWith(J8Unit4.class)
public class EntityResolverTest
implements EntityResolverTests<EntityResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.EntityResolver]

    @Override
    public EntityResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.EntityResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.EntityResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.EntityResolver]

}
