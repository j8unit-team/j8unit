package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributesImplTest
implements org.j8unit.repository.org.xml.sax.helpers.AttributesImplTests<org.xml.sax.helpers.AttributesImpl> {

    @Override
    public org.xml.sax.helpers.AttributesImpl createNewSUT() {
        return new org.xml.sax.helpers.AttributesImpl();
    }

}
