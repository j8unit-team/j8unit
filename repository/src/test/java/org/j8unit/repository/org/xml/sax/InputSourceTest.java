package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputSourceTest
implements org.j8unit.repository.org.xml.sax.InputSourceTests<org.xml.sax.InputSource> {

    @Override
    public org.xml.sax.InputSource createNewSUT() {
        return new org.xml.sax.InputSource();
    }

}
