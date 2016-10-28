package org.j8unit.repository.javax.xml.validation;

import javax.xml.validation.SchemaFactoryLoader;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaFactoryLoaderClassTest
implements org.j8unit.repository.javax.xml.validation.SchemaFactoryLoaderClassTests<SchemaFactoryLoader> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.validation.SchemaFactoryLoader]

    @Override
    public Class<SchemaFactoryLoader> createNewSUT() {
        return SchemaFactoryLoader.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.validation.SchemaFactoryLoader]

}
