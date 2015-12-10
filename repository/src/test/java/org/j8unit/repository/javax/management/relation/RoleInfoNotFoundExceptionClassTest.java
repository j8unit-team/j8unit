package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleInfoNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.relation.RoleInfoNotFoundExceptionClassTests<javax.management.relation.RoleInfoNotFoundException> {

    @Override
    public Class<javax.management.relation.RoleInfoNotFoundException> createNewSUT() {
        return javax.management.relation.RoleInfoNotFoundException.class;
    }

}
