package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocatorImplClassTest
implements org.j8unit.repository.org.xml.sax.helpers.LocatorImplClassTests<org.xml.sax.helpers.LocatorImpl> {

    @Override
    public Class<org.xml.sax.helpers.LocatorImpl> createNewSUT() {
        return org.xml.sax.helpers.LocatorImpl.class;
    }

}
