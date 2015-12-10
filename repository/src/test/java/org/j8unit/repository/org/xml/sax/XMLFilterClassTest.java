package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLFilterClassTest
implements org.j8unit.repository.org.xml.sax.XMLFilterClassTests<org.xml.sax.XMLFilter> {

    @Override
    public Class<org.xml.sax.XMLFilter> createNewSUT() {
        return org.xml.sax.XMLFilter.class;
    }

}
