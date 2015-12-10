package org.j8unit.repository.javax.security.auth;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyableClassTest
implements org.j8unit.repository.javax.security.auth.DestroyableClassTests<javax.security.auth.Destroyable> {

    @Override
    public Class<javax.security.auth.Destroyable> createNewSUT() {
        return javax.security.auth.Destroyable.class;
    }

}
