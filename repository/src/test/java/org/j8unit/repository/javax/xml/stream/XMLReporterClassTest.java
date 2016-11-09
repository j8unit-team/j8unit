package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLReporter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLReporter} (by simply reusing the
 * J8Unit test interface {@link XMLReporterClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLReporterClassTest
implements XMLReporterClassTests<XMLReporter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLReporter]

    @Override
    public Class<XMLReporter> createNewSUT() {
        return XMLReporter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.XMLReporter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLReporter]

}
