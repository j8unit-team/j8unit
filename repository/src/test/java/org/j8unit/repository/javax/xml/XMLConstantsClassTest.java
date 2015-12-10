package org.j8unit.repository.javax.xml;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLConstantsClassTest
implements org.j8unit.repository.javax.xml.XMLConstantsClassTests<javax.xml.XMLConstants> {

    @Override
    public Class<javax.xml.XMLConstants> createNewSUT() {
        return javax.xml.XMLConstants.class;
    }

}
