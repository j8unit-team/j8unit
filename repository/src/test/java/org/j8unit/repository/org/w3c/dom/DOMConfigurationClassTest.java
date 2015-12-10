package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMConfigurationClassTest
implements org.j8unit.repository.org.w3c.dom.DOMConfigurationClassTests<org.w3c.dom.DOMConfiguration> {

    @Override
    public Class<org.w3c.dom.DOMConfiguration> createNewSUT() {
        return org.w3c.dom.DOMConfiguration.class;
    }

}
