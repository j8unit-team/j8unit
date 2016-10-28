package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlRootElement;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlRootElementTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlRootElementTests<XmlRootElement> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlRootElement]

    @Override
    public XmlRootElement createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.bind.annotation.XmlRootElement], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.bind.annotation.XmlRootElement]

}
