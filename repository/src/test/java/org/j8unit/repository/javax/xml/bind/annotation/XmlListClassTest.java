package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlList;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlList} (by simply reusing the J8Unit
 * test interface {@link XmlListClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlListClassTest
implements XmlListClassTests<XmlList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlList]

    @Override
    public Class<XmlList> createNewSUT() {
        return XmlList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlList]

}
