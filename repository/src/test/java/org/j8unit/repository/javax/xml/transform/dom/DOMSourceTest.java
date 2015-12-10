package org.j8unit.repository.javax.xml.transform.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMSourceTest
implements org.j8unit.repository.javax.xml.transform.dom.DOMSourceTests<javax.xml.transform.dom.DOMSource> {

    @Override
    public javax.xml.transform.dom.DOMSource createNewSUT() {
        return new javax.xml.transform.dom.DOMSource();
    }

}
