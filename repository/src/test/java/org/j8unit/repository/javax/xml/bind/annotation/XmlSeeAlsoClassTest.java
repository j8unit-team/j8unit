package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlSeeAlso;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlSeeAlso} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlSeeAlsoClassTests}).
 */
@RunWith(J8Unit4.class)
public class XmlSeeAlsoClassTest
implements XmlSeeAlsoClassTests<XmlSeeAlso> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlSeeAlso]

    @Override
    public Class<XmlSeeAlso> createNewSUT() {
        return XmlSeeAlso.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlSeeAlso]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlSeeAlso]

}
