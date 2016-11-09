package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Refreshable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Refreshable} (by simply reusing the
 * J8Unit test interface {@link RefreshableClassTests}).
 */

@RunWith(J8Unit4.class)
public class RefreshableClassTest
implements RefreshableClassTests<Refreshable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.Refreshable]

    @Override
    public Class<Refreshable> createNewSUT() {
        return Refreshable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.security.auth.Refreshable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.Refreshable]

}
