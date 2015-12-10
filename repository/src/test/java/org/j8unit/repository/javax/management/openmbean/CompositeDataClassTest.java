package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeDataClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeDataClassTests<javax.management.openmbean.CompositeData> {

    @Override
    public Class<javax.management.openmbean.CompositeData> createNewSUT() {
        return javax.management.openmbean.CompositeData.class;
    }

}
