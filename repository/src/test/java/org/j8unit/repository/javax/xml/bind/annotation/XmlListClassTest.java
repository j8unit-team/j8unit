package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlList;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlListClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlListClassTests<XmlList> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlList]

    @Override
    public Class<XmlList> createNewSUT() {
        return XmlList.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlList]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlList]

}
