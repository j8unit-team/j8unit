package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAnyElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAnyElementClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAnyElementClassTests<XmlAnyElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAnyElement]

    @Override
    public Class<XmlAnyElement> createNewSUT() {
        return XmlAnyElement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAnyElement]

}
