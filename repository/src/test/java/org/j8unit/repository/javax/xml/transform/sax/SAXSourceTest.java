package org.j8unit.repository.javax.xml.transform.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SAXSourceTest
implements org.j8unit.repository.javax.xml.transform.sax.SAXSourceTests<javax.xml.transform.sax.SAXSource> {

    @Override
    public javax.xml.transform.sax.SAXSource createNewSUT() {
        return new javax.xml.transform.sax.SAXSource();
    }

}
