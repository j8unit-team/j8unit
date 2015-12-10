package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLFilterImplTest
implements org.j8unit.repository.org.xml.sax.helpers.XMLFilterImplTests<org.xml.sax.helpers.XMLFilterImpl> {

    @Override
    public org.xml.sax.helpers.XMLFilterImpl createNewSUT() {
        return new org.xml.sax.helpers.XMLFilterImpl();
    }

}
