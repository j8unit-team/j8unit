package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLReporter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReporterClassTest
implements org.j8unit.repository.javax.xml.stream.XMLReporterClassTests<XMLReporter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.XMLReporter]

    @Override
    public Class<XMLReporter> createNewSUT() {
        return XMLReporter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.XMLReporter]

}
