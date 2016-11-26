package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.SchemaOutputResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SchemaOutputResolver} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.SchemaOutputResolverTests}).
 */
@RunWith(J8Unit4.class)
public class SchemaOutputResolverTest
implements SchemaOutputResolverTests<SchemaOutputResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.SchemaOutputResolver]

    @Override
    public SchemaOutputResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.SchemaOutputResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.bind.SchemaOutputResolver]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.bind.SchemaOutputResolver]

}
