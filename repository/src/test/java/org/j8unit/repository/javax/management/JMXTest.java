package org.j8unit.repository.javax.management;

import javax.management.JMX;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXTest
implements org.j8unit.repository.javax.management.JMXTests<JMX> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.JMX]

    @Override
    public JMX createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.JMX], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.JMX]

}
