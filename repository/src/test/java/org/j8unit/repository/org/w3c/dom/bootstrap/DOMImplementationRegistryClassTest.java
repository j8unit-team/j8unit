package org.j8unit.repository.org.w3c.dom.bootstrap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationRegistryClassTest
implements org.j8unit.repository.org.w3c.dom.bootstrap.DOMImplementationRegistryClassTests<org.w3c.dom.bootstrap.DOMImplementationRegistry> {

    @Override
    public Class<org.w3c.dom.bootstrap.DOMImplementationRegistry> createNewSUT() {
        return org.w3c.dom.bootstrap.DOMImplementationRegistry.class;
    }

}
