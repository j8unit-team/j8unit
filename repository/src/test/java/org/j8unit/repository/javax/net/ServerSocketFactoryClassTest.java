package org.j8unit.repository.javax.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServerSocketFactoryClassTest
implements org.j8unit.repository.javax.net.ServerSocketFactoryClassTests<javax.net.ServerSocketFactory> {

    @Override
    public Class<javax.net.ServerSocketFactory> createNewSUT() {
        return javax.net.ServerSocketFactory.class;
    }

}
