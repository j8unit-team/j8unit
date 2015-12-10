package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlValueClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlValueClassTests<javax.xml.bind.annotation.XmlValue> {

    @Override
    public Class<javax.xml.bind.annotation.XmlValue> createNewSUT() {
        return javax.xml.bind.annotation.XmlValue.class;
    }

}
