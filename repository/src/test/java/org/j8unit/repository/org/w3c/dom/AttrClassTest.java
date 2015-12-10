package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttrClassTest
implements org.j8unit.repository.org.w3c.dom.AttrClassTests<org.w3c.dom.Attr> {

    @Override
    public Class<org.w3c.dom.Attr> createNewSUT() {
        return org.w3c.dom.Attr.class;
    }

}
