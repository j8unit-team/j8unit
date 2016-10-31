package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSchema;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSchemaClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaClassTests<XmlSchema> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

    @Override
    public Class<XmlSchema> createNewSUT() {
        return XmlSchema.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

}
