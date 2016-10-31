package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationServiceMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationServiceMBeanClassTest
implements org.j8unit.repository.javax.management.relation.RelationServiceMBeanClassTests<RelationServiceMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationServiceMBean]

    @Override
    public Class<RelationServiceMBean> createNewSUT() {
        return RelationServiceMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationServiceMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationServiceMBean]

}
