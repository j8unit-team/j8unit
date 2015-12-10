package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaFactoryLoaderClassTest
implements org.j8unit.repository.javax.xml.validation.SchemaFactoryLoaderClassTests<javax.xml.validation.SchemaFactoryLoader> {

    @Override
    public Class<javax.xml.validation.SchemaFactoryLoader> createNewSUT() {
        return javax.xml.validation.SchemaFactoryLoader.class;
    }

}
