package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationSupportMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationSupportMBeanTest
implements org.j8unit.repository.javax.management.relation.RelationSupportMBeanTests<RelationSupportMBean> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.relation.RelationSupportMBean]

    @Override
    public RelationSupportMBean createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.relation.RelationSupportMBean], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.relation.RelationSupportMBean]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.relation.RelationSupportMBean]

}
