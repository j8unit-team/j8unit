package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerBaseClassTest
implements org.j8unit.repository.org.xml.sax.HandlerBaseClassTests<org.xml.sax.HandlerBase> {

    @Override
    public Class<org.xml.sax.HandlerBase> createNewSUT() {
        return org.xml.sax.HandlerBase.class;
    }

}
