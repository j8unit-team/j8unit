package org.j8unit.repository.java.security.acl;

import java.security.acl.Owner;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OwnerClassTest
implements org.j8unit.repository.java.security.acl.OwnerClassTests<Owner> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Owner]

    @Override
    public Class<Owner> createNewSUT() {
        return Owner.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Owner]

}
