package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAnyElementClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAnyElementClassTests<javax.xml.bind.annotation.XmlAnyElement> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAnyElement> createNewSUT() {
        return javax.xml.bind.annotation.XmlAnyElement.class;
    }

}
