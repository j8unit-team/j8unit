package org.j8unit.repository.org.ietf.jgss;

import org.ietf.jgss.GSSContext;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link GSSContext} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.ietf.jgss.GSSContextClassTests}).
 */
@RunWith(J8Unit4.class)
public class GSSContextClassTest
implements GSSContextClassTests<GSSContext> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.ietf.jgss.GSSContext]

    @Override
    public Class<GSSContext> createNewSUT() {
        return GSSContext.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.ietf.jgss.GSSContext]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.ietf.jgss.GSSContext]

}
