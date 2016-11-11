package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationServiceMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationServiceMBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationServiceMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationServiceMBeanClassTest
implements RelationServiceMBeanClassTests<RelationServiceMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationServiceMBean]

    @Override
    public Class<RelationServiceMBean> createNewSUT() {
        return RelationServiceMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationServiceMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationServiceMBean]

}
