package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.TabularType;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularTypeTest
implements org.j8unit.repository.javax.management.openmbean.TabularTypeTests<TabularType> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.TabularType]

    @Override
    public TabularType createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.management.openmbean.TabularType], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.openmbean.TabularType]

}
