package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAnyAttributeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAnyAttributeClassTests<javax.xml.bind.annotation.XmlAnyAttribute> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAnyAttribute> createNewSUT() {
        return javax.xml.bind.annotation.XmlAnyAttribute.class;
    }

}
