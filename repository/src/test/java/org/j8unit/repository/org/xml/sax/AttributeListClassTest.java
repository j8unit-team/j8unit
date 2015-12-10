package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeListClassTest
implements org.j8unit.repository.org.xml.sax.AttributeListClassTests<org.xml.sax.AttributeList> {

    @Override
    public Class<org.xml.sax.AttributeList> createNewSUT() {
        return org.xml.sax.AttributeList.class;
    }

}
