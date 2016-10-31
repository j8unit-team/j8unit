package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;

@RunWith(J8Unit4.class)
public class LocatorClassTest
implements org.j8unit.repository.org.xml.sax.LocatorClassTests<Locator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.xml.sax.Locator]

    @Override
    public Class<Locator> createNewSUT() {
        return Locator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.xml.sax.Locator]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.xml.sax.Locator]

}
