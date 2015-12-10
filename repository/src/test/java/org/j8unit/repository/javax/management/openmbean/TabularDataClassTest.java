package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularDataClassTest
implements org.j8unit.repository.javax.management.openmbean.TabularDataClassTests<javax.management.openmbean.TabularData> {

    @Override
    public Class<javax.management.openmbean.TabularData> createNewSUT() {
        return javax.management.openmbean.TabularData.class;
    }

}
