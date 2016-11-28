package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.SchemaFactoryLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SchemaFactoryLoader} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.validation.SchemaFactoryLoaderClassTests}).
 */
@RunWith(J8Unit4.class)
public class SchemaFactoryLoaderClassTest
implements SchemaFactoryLoaderClassTests<SchemaFactoryLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.SchemaFactoryLoader]

    @Override
    public Class<SchemaFactoryLoader> createNewSUT() {
        return SchemaFactoryLoader.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.validation.SchemaFactoryLoader]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.SchemaFactoryLoader]

}
