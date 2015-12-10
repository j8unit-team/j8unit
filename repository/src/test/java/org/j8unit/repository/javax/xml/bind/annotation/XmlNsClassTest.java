package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlNsClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlNsClassTests<javax.xml.bind.annotation.XmlNs> {

    @Override
    public Class<javax.xml.bind.annotation.XmlNs> createNewSUT() {
        return javax.xml.bind.annotation.XmlNs.class;
    }

}
