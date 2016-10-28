package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlID;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlIDClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlIDClassTests<XmlID> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlID]

    @Override
    public Class<XmlID> createNewSUT() {
        return XmlID.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlID]

}
