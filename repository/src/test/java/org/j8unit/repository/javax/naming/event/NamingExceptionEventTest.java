package org.j8unit.repository.javax.naming.event;

import javax.naming.event.NamingExceptionEvent;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingExceptionEventTest
implements org.j8unit.repository.javax.naming.event.NamingExceptionEventTests<NamingExceptionEvent> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.event.NamingExceptionEvent]

    @Override
    public NamingExceptionEvent createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.event.NamingExceptionEvent], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.event.NamingExceptionEvent]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.event.NamingExceptionEvent]

}
