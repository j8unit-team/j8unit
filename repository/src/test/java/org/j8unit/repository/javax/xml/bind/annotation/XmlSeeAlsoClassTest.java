package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSeeAlso;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlSeeAlsoClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlSeeAlsoClassTests<XmlSeeAlso> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlSeeAlso]

    @Override
    public Class<XmlSeeAlso> createNewSUT() {
        return XmlSeeAlso.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlSeeAlso]

}
