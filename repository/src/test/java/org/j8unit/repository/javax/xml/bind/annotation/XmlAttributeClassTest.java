package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAttributeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAttributeClassTests<javax.xml.bind.annotation.XmlAttribute> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAttribute> createNewSUT() {
        return javax.xml.bind.annotation.XmlAttribute.class;
    }

}
