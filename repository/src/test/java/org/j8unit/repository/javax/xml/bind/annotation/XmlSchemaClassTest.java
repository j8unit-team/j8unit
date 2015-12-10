package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSchemaClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaClassTests<javax.xml.bind.annotation.XmlSchema> {

    @Override
    public Class<javax.xml.bind.annotation.XmlSchema> createNewSUT() {
        return javax.xml.bind.annotation.XmlSchema.class;
    }

}
