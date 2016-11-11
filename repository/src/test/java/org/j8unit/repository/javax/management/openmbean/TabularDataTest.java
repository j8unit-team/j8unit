package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TabularData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.TabularDataTests}).
 */

@RunWith(J8Unit4.class)
public class TabularDataTest
implements TabularDataTests<TabularData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.TabularData]

    @Override
    public TabularData createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.openmbean.TabularData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.TabularData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.TabularData]

}
