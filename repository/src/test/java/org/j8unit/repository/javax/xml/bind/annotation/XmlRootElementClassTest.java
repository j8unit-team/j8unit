package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlRootElementClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlRootElementClassTests<javax.xml.bind.annotation.XmlRootElement> {

    @Override
    public Class<javax.xml.bind.annotation.XmlRootElement> createNewSUT() {
        return javax.xml.bind.annotation.XmlRootElement.class;
    }

}
