package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TabularData} (by simply reusing the
 * J8Unit test interface {@link TabularDataClassTests}).
 */

@RunWith(J8Unit4.class)
public class TabularDataClassTest
implements TabularDataClassTests<TabularData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.TabularData]

    @Override
    public Class<TabularData> createNewSUT() {
        return TabularData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.TabularData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.TabularData]

}
