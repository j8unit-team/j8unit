package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlRegistry;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlRegistryTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlRegistryTests<XmlRegistry> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlRegistry]

    @Override
    public XmlRegistry createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlRegistry], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlRegistry]

}
