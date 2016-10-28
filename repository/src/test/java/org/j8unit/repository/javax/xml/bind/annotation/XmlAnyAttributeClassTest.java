package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAnyAttribute;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAnyAttributeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAnyAttributeClassTests<XmlAnyAttribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAnyAttribute]

    @Override
    public Class<XmlAnyAttribute> createNewSUT() {
        return XmlAnyAttribute.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAnyAttribute]

}
