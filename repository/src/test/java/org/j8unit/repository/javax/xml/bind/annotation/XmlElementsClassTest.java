package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementsClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementsClassTests<javax.xml.bind.annotation.XmlElements> {

    @Override
    public Class<javax.xml.bind.annotation.XmlElements> createNewSUT() {
        return javax.xml.bind.annotation.XmlElements.class;
    }

}
