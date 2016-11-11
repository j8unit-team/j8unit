package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSchema;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlSchema} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlSchemaClassTest
implements XmlSchemaClassTests<XmlSchema> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

    @Override
    public Class<XmlSchema> createNewSUT() {
        return XmlSchema.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlSchema]

}
