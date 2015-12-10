package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XmlListClassTest
implements org.j8unit.repository.javax.xml.bind.annotation.XmlListClassTests<javax.xml.bind.annotation.XmlList> {

    @Override
    public Class<javax.xml.bind.annotation.XmlList> createNewSUT() {
        return javax.xml.bind.annotation.XmlList.class;
    }

}
