package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceNotRegisteredExceptionClassTest
implements
org.j8unit.repository.javax.management.relation.RelationServiceNotRegisteredExceptionClassTests<javax.management.relation.RelationServiceNotRegisteredException> {

    @Override
    public Class<javax.management.relation.RelationServiceNotRegisteredException> createNewSUT() {
        return javax.management.relation.RelationServiceNotRegisteredException.class;
    }

}
