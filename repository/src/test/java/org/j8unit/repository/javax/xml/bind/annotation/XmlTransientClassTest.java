package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlTransientClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlTransientClassTests<javax.xml.bind.annotation.XmlTransient> {

    @Override
    public Class<javax.xml.bind.annotation.XmlTransient> createNewSUT() {
        return javax.xml.bind.annotation.XmlTransient.class;
    }

}
