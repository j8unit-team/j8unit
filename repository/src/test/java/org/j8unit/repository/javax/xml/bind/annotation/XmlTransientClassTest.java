package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlTransient;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlTransientClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlTransientClassTests<XmlTransient> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlTransient]

    @Override
    public Class<XmlTransient> createNewSUT() {
        return XmlTransient.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlTransient]

}
