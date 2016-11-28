package org.j8unit.repository.javax.jws;

import javax.jws.HandlerChain;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HandlerChain} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.jws.HandlerChainTests}).
 */
@RunWith(J8Unit4.class)
public class HandlerChainTest
implements HandlerChainTests<HandlerChain> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.jws.HandlerChain]

    @Override
    public HandlerChain createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.jws.HandlerChain], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.jws.HandlerChain]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.jws.HandlerChain]

}
