package org.j8unit.repository.org.xml.sax.helpers;

import static org.junit.Assume.assumeTrue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserAdapterTest
implements org.j8unit.repository.org.xml.sax.helpers.ParserAdapterTests<org.xml.sax.helpers.ParserAdapter> {

    @Override
    public org.xml.sax.helpers.ParserAdapter createNewSUT() {
        assumeTrue("Somebody needs to specify/setup the 'org.xml.sax.parser' property at first.", false);
        try {
            return new org.xml.sax.helpers.ParserAdapter();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
