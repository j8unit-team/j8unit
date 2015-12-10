package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlAccessorTypeClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlAccessorTypeClassTests<javax.xml.bind.annotation.XmlAccessorType> {

    @Override
    public Class<javax.xml.bind.annotation.XmlAccessorType> createNewSUT() {
        return javax.xml.bind.annotation.XmlAccessorType.class;
    }

}
