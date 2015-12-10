package org.j8unit.repository.javax.print.event;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintEventTest
implements org.j8unit.repository.javax.print.event.PrintEventTests<javax.print.event.PrintEvent> {

    @Override
    public javax.print.event.PrintEvent createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.print.event.PrintEvent] available.");
    }

}
