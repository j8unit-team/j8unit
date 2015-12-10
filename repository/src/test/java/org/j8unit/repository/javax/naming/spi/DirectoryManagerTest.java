package org.j8unit.repository.javax.naming.spi;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryManagerTest
implements org.j8unit.repository.javax.naming.spi.DirectoryManagerTests<javax.naming.spi.DirectoryManager> {

    @Override
    public javax.naming.spi.DirectoryManager createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.naming.spi.DirectoryManager] available.");
    }

}
