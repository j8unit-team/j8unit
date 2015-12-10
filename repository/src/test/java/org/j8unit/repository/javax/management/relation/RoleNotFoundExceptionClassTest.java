package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RoleNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.relation.RoleNotFoundExceptionClassTests<javax.management.relation.RoleNotFoundException> {

    @Override
    public Class<javax.management.relation.RoleNotFoundException> createNewSUT() {
        return javax.management.relation.RoleNotFoundException.class;
    }

}
