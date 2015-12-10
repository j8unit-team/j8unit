package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerBaseTest
implements org.j8unit.repository.org.xml.sax.HandlerBaseTests<org.xml.sax.HandlerBase> {

    @Override
    public org.xml.sax.HandlerBase createNewSUT() {
        return new org.xml.sax.HandlerBase();
    }

}
