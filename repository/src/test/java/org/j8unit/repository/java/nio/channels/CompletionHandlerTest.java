package org.j8unit.repository.java.nio.channels;

import java.nio.channels.CompletionHandler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionHandlerTest<V, A>
implements org.j8unit.repository.java.nio.channels.CompletionHandlerTests<CompletionHandler<V, A>, V, A> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.channels.CompletionHandler]

    @Override
    public CompletionHandler<V, A> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.nio.channels.CompletionHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.channels.CompletionHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.channels.CompletionHandler]

}
