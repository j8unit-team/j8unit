package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefreshableClassTest
implements org.j8unit.repository.javax.security.auth.RefreshableClassTests<javax.security.auth.Refreshable> {

    @Override
    public Class<javax.security.auth.Refreshable> createNewSUT() {
        return javax.security.auth.Refreshable.class;
    }

}
