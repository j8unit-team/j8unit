package org.j8unit.repository.javax.naming;

import javax.naming.Context;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Context} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.naming.ContextClassTests}).
 */

@RunWith(J8Unit4.class)
public class ContextClassTest
implements ContextClassTests<Context> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.Context]

    @Override
    public Class<Context> createNewSUT() {
        return Context.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.Context]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.Context]

}
