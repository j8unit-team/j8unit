package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlEnumValueClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlEnumValueClassTests<javax.xml.bind.annotation.XmlEnumValue> {

    @Override
    public Class<javax.xml.bind.annotation.XmlEnumValue> createNewSUT() {
        return javax.xml.bind.annotation.XmlEnumValue.class;
    }

}
