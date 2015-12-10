package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryManagerClassTest
implements org.j8unit.repository.javax.naming.spi.DirectoryManagerClassTests<javax.naming.spi.DirectoryManager> {

    @Override
    public Class<javax.naming.spi.DirectoryManager> createNewSUT() {
        return javax.naming.spi.DirectoryManager.class;
    }

}
