package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Severity;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Severity} (by simply reusing the J8Unit
 * test interface {@link SeverityClassTests}).
 */

@RunWith(J8Unit4.class)
public class SeverityClassTest
implements SeverityClassTests<Severity> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Severity]

    @Override
    public Class<Severity> createNewSUT() {
        return Severity.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Severity]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Severity]

}
