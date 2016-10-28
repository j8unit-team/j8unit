package org.j8unit.repository.javax.xml;

import javax.xml.XMLConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLConstantsClassTest
implements org.j8unit.repository.javax.xml.XMLConstantsClassTests<XMLConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.XMLConstants]

    @Override
    public Class<XMLConstants> createNewSUT() {
        return XMLConstants.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.XMLConstants]

}
