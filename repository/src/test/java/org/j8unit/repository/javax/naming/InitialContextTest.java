package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InitialContextTest
implements org.j8unit.repository.javax.naming.InitialContextTests<javax.naming.InitialContext> {

    @Override
    public javax.naming.InitialContext createNewSUT() {
        try {
            return new javax.naming.InitialContext();
        } catch (final Exception cause) {
            throw new AssertionError("Failed to create new subject-under-test instance!", cause);
        }

    }

}
