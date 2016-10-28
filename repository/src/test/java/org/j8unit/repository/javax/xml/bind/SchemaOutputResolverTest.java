package org.j8unit.repository.javax.xml.bind;

import javax.xml.bind.SchemaOutputResolver;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaOutputResolverTest
implements org.j8unit.repository.javax.xml.bind.SchemaOutputResolverTests<SchemaOutputResolver> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.SchemaOutputResolver]

    @Override
    public SchemaOutputResolver createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.SchemaOutputResolver], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.SchemaOutputResolver]

}
