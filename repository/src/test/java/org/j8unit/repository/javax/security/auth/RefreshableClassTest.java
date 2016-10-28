package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Refreshable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefreshableClassTest
implements org.j8unit.repository.javax.security.auth.RefreshableClassTests<Refreshable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.Refreshable]

    @Override
    public Class<Refreshable> createNewSUT() {
        return Refreshable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.Refreshable]

}
