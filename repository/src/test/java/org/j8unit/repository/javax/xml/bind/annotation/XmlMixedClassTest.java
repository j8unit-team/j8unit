package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlMixed;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlMixedClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlMixedClassTests<XmlMixed> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlMixed]

    @Override
    public Class<XmlMixed> createNewSUT() {
        return XmlMixed.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlMixed]

}
