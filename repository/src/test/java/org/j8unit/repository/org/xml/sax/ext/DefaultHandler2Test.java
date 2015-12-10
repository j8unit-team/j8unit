package org.j8unit.repository.org.xml.sax.ext;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultHandler2Test
implements org.j8unit.repository.org.xml.sax.ext.DefaultHandler2Tests<org.xml.sax.ext.DefaultHandler2> {

    @Override
    public org.xml.sax.ext.DefaultHandler2 createNewSUT() {
        return new org.xml.sax.ext.DefaultHandler2();
    }

}
