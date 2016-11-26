package org.j8unit.repository.java.security.acl;

import java.security.acl.Owner;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Owner} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.security.acl.OwnerTests}).
 */
@RunWith(J8Unit4.class)
public class OwnerTest
implements OwnerTests<Owner> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.Owner]

    @Override
    public Owner createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.security.acl.Owner], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.Owner]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.Owner]

}
