package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TabularTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.TabularTypeClassTests<javax.management.openmbean.TabularType> {

    @Override
    public Class<javax.management.openmbean.TabularType> createNewSUT() {
        return javax.management.openmbean.TabularType.class;
    }

}
