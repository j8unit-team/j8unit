package org.j8unit.repository.javax.management.remote;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SubjectDelegationPermissionClassTest
implements org.j8unit.repository.javax.management.remote.SubjectDelegationPermissionClassTests<javax.management.remote.SubjectDelegationPermission> {

    @Override
    public Class<javax.management.remote.SubjectDelegationPermission> createNewSUT() {
        return javax.management.remote.SubjectDelegationPermission.class;
    }

}
