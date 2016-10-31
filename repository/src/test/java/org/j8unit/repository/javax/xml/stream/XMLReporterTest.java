package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.XMLReporter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLReporterTest
implements org.j8unit.repository.javax.xml.stream.XMLReporterTests<XMLReporter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.XMLReporter]

    @Override
    public XMLReporter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.XMLReporter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.XMLReporter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.XMLReporter]

}
