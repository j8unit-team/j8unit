package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleInfoClassTest
implements org.j8unit.repository.javax.management.relation.RoleInfoClassTests<javax.management.relation.RoleInfo> {

    @Override
    public Class<javax.management.relation.RoleInfo> createNewSUT() {
        return javax.management.relation.RoleInfo.class;
    }

}
