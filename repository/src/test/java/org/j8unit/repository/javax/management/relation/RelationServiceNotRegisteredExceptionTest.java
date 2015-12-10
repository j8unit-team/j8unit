package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceNotRegisteredExceptionTest
implements
org.j8unit.repository.javax.management.relation.RelationServiceNotRegisteredExceptionTests<javax.management.relation.RelationServiceNotRegisteredException> {

    @Override
    public javax.management.relation.RelationServiceNotRegisteredException createNewSUT() {
        return new javax.management.relation.RelationServiceNotRegisteredException();
    }

}
