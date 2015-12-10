package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlEnumClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlEnumClassTests<javax.xml.bind.annotation.XmlEnum> {

    @Override
    public Class<javax.xml.bind.annotation.XmlEnum> createNewSUT() {
        return javax.xml.bind.annotation.XmlEnum.class;
    }

}
