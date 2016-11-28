package org.j8unit.repository.java.security.acl;

import java.security.acl.Owner;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Owner} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.security.acl.OwnerClassTests}).
 */
@RunWith(J8Unit4.class)
public class OwnerClassTest
implements OwnerClassTests<Owner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Owner]

    @Override
    public Class<Owner> createNewSUT() {
        return Owner.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.acl.Owner]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Owner]

}
