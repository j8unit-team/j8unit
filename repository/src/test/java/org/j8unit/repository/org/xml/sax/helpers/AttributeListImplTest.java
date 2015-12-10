package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AttributeListImplTest
implements org.j8unit.repository.org.xml.sax.helpers.AttributeListImplTests<org.xml.sax.helpers.AttributeListImpl> {

    @Override
    public org.xml.sax.helpers.AttributeListImpl createNewSUT() {
        return new org.xml.sax.helpers.AttributeListImpl();
    }

}
