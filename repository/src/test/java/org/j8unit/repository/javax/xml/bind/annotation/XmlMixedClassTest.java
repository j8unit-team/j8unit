package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlMixedClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlMixedClassTests<javax.xml.bind.annotation.XmlMixed> {

    @Override
    public Class<javax.xml.bind.annotation.XmlMixed> createNewSUT() {
        return javax.xml.bind.annotation.XmlMixed.class;
    }

}
