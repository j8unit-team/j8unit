package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSchema;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSchemaTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSchemaTests<XmlSchema> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlSchema]

    @Override
    public XmlSchema createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlSchema], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlSchema]

}
