package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReporterClassTest
implements org.j8unit.repository.javax.xml.stream.XMLReporterClassTests<javax.xml.stream.XMLReporter> {

    @Override
    public Class<javax.xml.stream.XMLReporter> createNewSUT() {
        return javax.xml.stream.XMLReporter.class;
    }

}
