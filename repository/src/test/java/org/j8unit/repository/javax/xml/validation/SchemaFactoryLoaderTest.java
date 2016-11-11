package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.SchemaFactoryLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link SchemaFactoryLoader} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.xml.validation.SchemaFactoryLoaderTests}).
 */

@RunWith(J8Unit4.class)
public class SchemaFactoryLoaderTest
implements SchemaFactoryLoaderTests<SchemaFactoryLoader> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.validation.SchemaFactoryLoader]

    @Override
    public SchemaFactoryLoader createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.validation.SchemaFactoryLoader], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.validation.SchemaFactoryLoader]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.validation.SchemaFactoryLoader]

}
