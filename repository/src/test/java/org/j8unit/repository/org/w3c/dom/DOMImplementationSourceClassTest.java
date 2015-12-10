package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationSourceClassTest
implements org.j8unit.repository.org.w3c.dom.DOMImplementationSourceClassTests<org.w3c.dom.DOMImplementationSource> {

    @Override
    public Class<org.w3c.dom.DOMImplementationSource> createNewSUT() {
        return org.w3c.dom.DOMImplementationSource.class;
    }

}
