package org.j8unit.repository.javax.management.relation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RelationSupportMBeanClassTest
implements org.j8unit.repository.javax.management.relation.RelationSupportMBeanClassTests<javax.management.relation.RelationSupportMBean> {

    @Override
    public Class<javax.management.relation.RelationSupportMBean> createNewSUT() {
        return javax.management.relation.RelationSupportMBean.class;
    }

}
