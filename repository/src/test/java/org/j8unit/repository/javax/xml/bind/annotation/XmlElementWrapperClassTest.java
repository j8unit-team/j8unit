package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlElementWrapperClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlElementWrapperClassTests<javax.xml.bind.annotation.XmlElementWrapper> {

    @Override
    public Class<javax.xml.bind.annotation.XmlElementWrapper> createNewSUT() {
        return javax.xml.bind.annotation.XmlElementWrapper.class;
    }

}
