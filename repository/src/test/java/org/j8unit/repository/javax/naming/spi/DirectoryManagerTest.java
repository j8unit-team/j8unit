package org.j8unit.repository.javax.naming.spi;

import javax.naming.spi.DirectoryManager;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DirectoryManagerTest
implements org.j8unit.repository.javax.naming.spi.DirectoryManagerTests<DirectoryManager> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.spi.DirectoryManager]

    @Override
    public DirectoryManager createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.spi.DirectoryManager], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.spi.DirectoryManager]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.spi.DirectoryManager]

}
