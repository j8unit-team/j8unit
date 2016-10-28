package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Attributes;

@RunWith(J8Unit4.class)
public class AttributesClassTest
implements org.j8unit.repository.org.xml.sax.AttributesClassTests<Attributes> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Attributes]

    @Override
    public Class<Attributes> createNewSUT() {
        return Attributes.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Attributes]

}
