package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DOMStringListClassTest
implements org.j8unit.repository.org.w3c.dom.DOMStringListClassTests<org.w3c.dom.DOMStringList> {

    @Override
    public Class<org.w3c.dom.DOMStringList> createNewSUT() {
        return org.w3c.dom.DOMStringList.class;
    }

}
