package org.j8unit.repository.javax.naming.event;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionEventTest
implements org.j8unit.repository.javax.naming.event.NamingExceptionEventTests<javax.naming.event.NamingExceptionEvent> {

    @Override
    public javax.naming.event.NamingExceptionEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.event.NamingExceptionEvent] available.");
    }

}
