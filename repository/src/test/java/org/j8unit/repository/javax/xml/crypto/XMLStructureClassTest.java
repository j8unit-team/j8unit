package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLStructureClassTest
implements org.j8unit.repository.javax.xml.crypto.XMLStructureClassTests<javax.xml.crypto.XMLStructure> {

    @Override
    public Class<javax.xml.crypto.XMLStructure> createNewSUT() {
        return javax.xml.crypto.XMLStructure.class;
    }

}
