package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocatorImplTest
implements org.j8unit.repository.org.xml.sax.helpers.LocatorImplTests<org.xml.sax.helpers.LocatorImpl> {

    @Override
    public org.xml.sax.helpers.LocatorImpl createNewSUT() {
        return new org.xml.sax.helpers.LocatorImpl();
    }

}
