package org.j8unit.repository.javax.naming.directory;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialDirContextTest
implements org.j8unit.repository.javax.naming.directory.InitialDirContextTests<javax.naming.directory.InitialDirContext> {

    @Override
    public javax.naming.directory.InitialDirContext createNewSUT() {
        try {
            return new javax.naming.directory.InitialDirContext();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
