package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.CompositeTypeClassTests<javax.management.openmbean.CompositeType> {

    @Override
    public Class<javax.management.openmbean.CompositeType> createNewSUT() {
        return javax.management.openmbean.CompositeType.class;
    }

}
