package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationService;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceTest
implements org.j8unit.repository.javax.management.relation.RelationServiceTests<RelationService> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationService]

    @Override
    public RelationService createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.RelationService], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RelationService]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RelationService]

}
