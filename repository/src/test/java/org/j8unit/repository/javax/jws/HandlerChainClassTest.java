package org.j8unit.repository.javax.jws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HandlerChainClassTest
implements org.j8unit.repository.javax.jws.HandlerChainClassTests<javax.jws.HandlerChain> {

    @Override
    public Class<javax.jws.HandlerChain> createNewSUT() {
        return javax.jws.HandlerChain.class;
    }

}
