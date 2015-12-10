package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LocatorClassTest
implements org.j8unit.repository.org.xml.sax.LocatorClassTests<org.xml.sax.Locator> {

    @Override
    public Class<org.xml.sax.Locator> createNewSUT() {
        return org.xml.sax.Locator.class;
    }

}
