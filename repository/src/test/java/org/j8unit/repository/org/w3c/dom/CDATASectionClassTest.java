package org.j8unit.repository.org.w3c.dom;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CDATASectionClassTest
implements org.j8unit.repository.org.w3c.dom.CDATASectionClassTests<org.w3c.dom.CDATASection> {

    @Override
    public Class<org.w3c.dom.CDATASection> createNewSUT() {
        return org.w3c.dom.CDATASection.class;
    }

}