package org.j8unit.repository.javax.jws;

import javax.jws.HandlerChain;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerChainClassTest
implements org.j8unit.repository.javax.jws.HandlerChainClassTests<HandlerChain> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.HandlerChain]

    @Override
    public Class<HandlerChain> createNewSUT() {
        return HandlerChain.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.HandlerChain]

}
