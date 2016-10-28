package org.j8unit.repository.javax.security.auth;

import javax.security.auth.Destroyable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyableClassTest
implements org.j8unit.repository.javax.security.auth.DestroyableClassTests<Destroyable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.Destroyable]

    @Override
    public Class<Destroyable> createNewSUT() {
        return Destroyable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.Destroyable]

}
