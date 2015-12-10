package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSeeAlsoClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSeeAlsoClassTests<javax.xml.bind.annotation.XmlSeeAlso> {

    @Override
    public Class<javax.xml.bind.annotation.XmlSeeAlso> createNewSUT() {
        return javax.xml.bind.annotation.XmlSeeAlso.class;
    }

}
