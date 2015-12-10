package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleResultClassTest
implements org.j8unit.repository.javax.management.relation.RoleResultClassTests<javax.management.relation.RoleResult> {

    @Override
    public Class<javax.management.relation.RoleResult> createNewSUT() {
        return javax.management.relation.RoleResult.class;
    }

}
