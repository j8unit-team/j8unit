package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationSupportMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationSupportMBeanClassTest
implements org.j8unit.repository.javax.management.relation.RelationSupportMBeanClassTests<RelationSupportMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationSupportMBean]

    @Override
    public Class<RelationSupportMBean> createNewSUT() {
        return RelationSupportMBean.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationSupportMBean]

}
