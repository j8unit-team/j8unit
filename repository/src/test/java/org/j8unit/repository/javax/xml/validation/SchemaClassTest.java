package org.j8unit.repository.javax.xml.validation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SchemaClassTest
implements org.j8unit.repository.javax.xml.validation.SchemaClassTests<javax.xml.validation.Schema> {

    @Override
    public Class<javax.xml.validation.Schema> createNewSUT() {
        return javax.xml.validation.Schema.class;
    }

}
