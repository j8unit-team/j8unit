package org.j8unit.repository.org.w3c.dom.html;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HTMLDOMImplementationClassTest
implements org.j8unit.repository.org.w3c.dom.html.HTMLDOMImplementationClassTests<org.w3c.dom.html.HTMLDOMImplementation> {

    @Override
    public Class<org.w3c.dom.html.HTMLDOMImplementation> createNewSUT() {
        return org.w3c.dom.html.HTMLDOMImplementation.class;
    }

}
