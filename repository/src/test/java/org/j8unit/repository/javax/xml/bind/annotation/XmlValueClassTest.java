package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlValueClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlValueClassTests<XmlValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlValue]

    @Override
    public Class<XmlValue> createNewSUT() {
        return XmlValue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlValue]

}
