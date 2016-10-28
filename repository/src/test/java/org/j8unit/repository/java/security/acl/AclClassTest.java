package org.j8unit.repository.java.security.acl;

import java.security.acl.Acl;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AclClassTest
implements org.j8unit.repository.java.security.acl.AclClassTests<Acl> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.acl.Acl]

    @Override
    public Class<Acl> createNewSUT() {
        return Acl.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.acl.Acl]

}
