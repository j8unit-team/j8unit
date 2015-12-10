package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesImplClassTest
implements org.j8unit.repository.org.xml.sax.helpers.AttributesImplClassTests<org.xml.sax.helpers.AttributesImpl> {

    @Override
    public Class<org.xml.sax.helpers.AttributesImpl> createNewSUT() {
        return org.xml.sax.helpers.AttributesImpl.class;
    }

}
