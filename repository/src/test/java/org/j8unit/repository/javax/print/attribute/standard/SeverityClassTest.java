package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Severity;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SeverityClassTest
implements org.j8unit.repository.javax.print.attribute.standard.SeverityClassTests<Severity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Severity]

    @Override
    public Class<Severity> createNewSUT() {
        return Severity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Severity]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Severity]

}
