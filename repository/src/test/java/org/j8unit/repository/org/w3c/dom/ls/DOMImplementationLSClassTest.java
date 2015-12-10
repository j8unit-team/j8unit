package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationLSClassTest
implements org.j8unit.repository.org.w3c.dom.ls.DOMImplementationLSClassTests<org.w3c.dom.ls.DOMImplementationLS> {

    @Override
    public Class<org.w3c.dom.ls.DOMImplementationLS> createNewSUT() {
        return org.w3c.dom.ls.DOMImplementationLS.class;
    }

}
