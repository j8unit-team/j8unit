package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaFactoryClassTest
implements org.j8unit.repository.javax.xml.validation.SchemaFactoryClassTests<javax.xml.validation.SchemaFactory> {

    @Override
    public Class<javax.xml.validation.SchemaFactory> createNewSUT() {
        return javax.xml.validation.SchemaFactory.class;
    }

}
