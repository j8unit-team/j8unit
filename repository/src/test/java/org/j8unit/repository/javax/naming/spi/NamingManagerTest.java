package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingManagerTest
implements org.j8unit.repository.javax.naming.spi.NamingManagerTests<javax.naming.spi.NamingManager> {

    @Override
    public javax.naming.spi.NamingManager createNewSUT() {
        throw new AssertionError("There is no default constructor for [javax.naming.spi.NamingManager] available.");
    }

}
