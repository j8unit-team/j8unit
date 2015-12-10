package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationListClassTest
implements org.j8unit.repository.org.w3c.dom.DOMImplementationListClassTests<org.w3c.dom.DOMImplementationList> {

    @Override
    public Class<org.w3c.dom.DOMImplementationList> createNewSUT() {
        return org.w3c.dom.DOMImplementationList.class;
    }

}
