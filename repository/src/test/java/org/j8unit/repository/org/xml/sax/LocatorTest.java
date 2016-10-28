package org.j8unit.repository.org.xml.sax;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.xml.sax.Locator;

@RunWith(J8Unit4.class)
public class LocatorTest
implements org.j8unit.repository.org.xml.sax.LocatorTests<Locator> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Locator]

    @Override
    public Locator createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.xml.sax.Locator], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.xml.sax.Locator]

}
