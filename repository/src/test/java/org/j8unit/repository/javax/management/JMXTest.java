package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMXTest
implements org.j8unit.repository.javax.management.JMXTests<javax.management.JMX> {

    @Override
    public javax.management.JMX createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.management.JMX] available.");
    }

}
