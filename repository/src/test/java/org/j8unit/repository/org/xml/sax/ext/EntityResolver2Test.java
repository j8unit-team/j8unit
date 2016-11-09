package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.ext.EntityResolver2;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link EntityResolver2} (by simply reusing
 * the J8Unit test interface {@link EntityResolver2Tests}).
 */

@RunWith(J8Unit4.class)
public class EntityResolver2Test
implements EntityResolver2Tests<EntityResolver2> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.ext.EntityResolver2]

    @Override
    public EntityResolver2 createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.ext.EntityResolver2], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.xml.sax.ext.EntityResolver2]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.xml.sax.ext.EntityResolver2]

}
