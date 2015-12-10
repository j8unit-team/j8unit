package org.j8unit.repository.org.xml.sax.helpers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReaderAdapterTest
implements org.j8unit.repository.org.xml.sax.helpers.XMLReaderAdapterTests<org.xml.sax.helpers.XMLReaderAdapter> {

    @Override
    public org.xml.sax.helpers.XMLReaderAdapter createNewSUT() {
        try {
            return new org.xml.sax.helpers.XMLReaderAdapter();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
