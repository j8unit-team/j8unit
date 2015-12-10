package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SimpleTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.SimpleTypeClassTests<javax.management.openmbean.SimpleType> {

    @Override
    public Class<javax.management.openmbean.SimpleType> createNewSUT() {
        return javax.management.openmbean.SimpleType.class;
    }

}
