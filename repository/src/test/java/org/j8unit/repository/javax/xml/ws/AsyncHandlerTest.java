package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.AsyncHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AsyncHandlerTest<T>
implements org.j8unit.repository.javax.xml.ws.AsyncHandlerTests<AsyncHandler<T>, T> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.AsyncHandler]

    @Override
    public AsyncHandler<T> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.AsyncHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.AsyncHandler]

}
