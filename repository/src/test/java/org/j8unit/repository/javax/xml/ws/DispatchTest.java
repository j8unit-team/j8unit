package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Dispatch;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DispatchTest<T>
implements org.j8unit.repository.javax.xml.ws.DispatchTests<Dispatch<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Dispatch]

    @Override
    public Dispatch<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Dispatch], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Dispatch]

}
