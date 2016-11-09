package org.j8unit.repository.javax.jws;

import javax.jws.HandlerChain;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HandlerChain} (by simply reusing the
 * J8Unit test interface {@link HandlerChainClassTests}).
 */

@RunWith(J8Unit4.class)
public class HandlerChainClassTest
implements HandlerChainClassTests<HandlerChain> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.HandlerChain]

    @Override
    public Class<HandlerChain> createNewSUT() {
        return HandlerChain.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.HandlerChain]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.HandlerChain]

}
