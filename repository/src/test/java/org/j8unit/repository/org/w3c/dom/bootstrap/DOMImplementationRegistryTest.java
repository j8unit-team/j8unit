package org.j8unit.repository.org.w3c.dom.bootstrap;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMImplementationRegistryTest
implements org.j8unit.repository.org.w3c.dom.bootstrap.DOMImplementationRegistryTests<org.w3c.dom.bootstrap.DOMImplementationRegistry> {

    @Override
    public org.w3c.dom.bootstrap.DOMImplementationRegistry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [org.w3c.dom.bootstrap.DOMImplementationRegistry] available.");
    }

}
