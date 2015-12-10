package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlIDClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlIDClassTests<javax.xml.bind.annotation.XmlID> {

    @Override
    public Class<javax.xml.bind.annotation.XmlID> createNewSUT() {
        return javax.xml.bind.annotation.XmlID.class;
    }

}
