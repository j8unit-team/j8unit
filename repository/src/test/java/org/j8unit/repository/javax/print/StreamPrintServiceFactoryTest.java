package org.j8unit.repository.javax.print;

import javax.print.StreamPrintServiceFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamPrintServiceFactoryTest
implements org.j8unit.repository.javax.print.StreamPrintServiceFactoryTests<StreamPrintServiceFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.StreamPrintServiceFactory]

    @Override
    public StreamPrintServiceFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.print.StreamPrintServiceFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.StreamPrintServiceFactory]

}
