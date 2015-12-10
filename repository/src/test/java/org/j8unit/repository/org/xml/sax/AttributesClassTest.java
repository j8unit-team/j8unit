package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements org.j8unit.repository.org.xml.sax.AttributesClassTests<org.xml.sax.Attributes> {

    @Override
    public Class<org.xml.sax.Attributes> createNewSUT() {
        return org.xml.sax.Attributes.class;
    }

}
