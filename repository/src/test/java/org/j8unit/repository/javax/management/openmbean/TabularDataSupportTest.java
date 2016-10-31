package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularDataSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularDataSupportTest
implements org.j8unit.repository.javax.management.openmbean.TabularDataSupportTests<TabularDataSupport> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.TabularDataSupport]

    @Override
    public TabularDataSupport createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.TabularDataSupport], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.openmbean.TabularDataSupport]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.openmbean.TabularDataSupport]

}
