package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NamingManagerClassTest
implements org.j8unit.repository.javax.naming.spi.NamingManagerClassTests<javax.naming.spi.NamingManager> {

    @Override
    public Class<javax.naming.spi.NamingManager> createNewSUT() {
        return javax.naming.spi.NamingManager.class;
    }

}
