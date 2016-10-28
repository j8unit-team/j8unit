package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularDataClassTest
implements org.j8unit.repository.javax.management.openmbean.TabularDataClassTests<TabularData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.TabularData]

    @Override
    public Class<TabularData> createNewSUT() {
        return TabularData.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.TabularData]

}
