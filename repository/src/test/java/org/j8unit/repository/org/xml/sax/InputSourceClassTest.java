package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputSourceClassTest
implements org.j8unit.repository.org.xml.sax.InputSourceClassTests<org.xml.sax.InputSource> {

    @Override
    public Class<org.xml.sax.InputSource> createNewSUT() {
        return org.xml.sax.InputSource.class;
    }

}
