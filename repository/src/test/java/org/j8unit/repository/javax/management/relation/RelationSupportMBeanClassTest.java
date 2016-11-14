package org.j8unit.repository.javax.management.relation;

import javax.management.relation.RelationSupportMBean;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RelationSupportMBean} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.relation.RelationSupportMBeanClassTests}).
 */

@RunWith(J8Unit4.class)
public class RelationSupportMBeanClassTest
implements RelationSupportMBeanClassTests<RelationSupportMBean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.relation.RelationSupportMBean]

    @Override
    public Class<RelationSupportMBean> createNewSUT() {
        return RelationSupportMBean.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.relation.RelationSupportMBean]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.relation.RelationSupportMBean]

}
