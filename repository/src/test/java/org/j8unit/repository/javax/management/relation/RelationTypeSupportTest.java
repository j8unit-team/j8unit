package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationTypeSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationTypeSupportTest
implements org.j8unit.repository.javax.management.relation.RelationTypeSupportTests<RelationTypeSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

    @Override
    public RelationTypeSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.relation.RelationTypeSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RelationTypeSupport]

}
