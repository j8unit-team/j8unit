package org.j8unit.repository.java.security.acl;

import java.security.acl.Acl;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Acl} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.security.acl.AclClassTests}).
 */

@RunWith(J8Unit4.class)
public class AclClassTest
implements AclClassTests<Acl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Acl]

    @Override
    public Class<Acl> createNewSUT() {
        return Acl.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.Acl]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Acl]

}
