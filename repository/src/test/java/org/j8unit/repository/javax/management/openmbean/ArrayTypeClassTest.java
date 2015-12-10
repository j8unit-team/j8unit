package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ArrayTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.ArrayTypeClassTests<javax.management.openmbean.ArrayType> {

    @Override
    public Class<javax.management.openmbean.ArrayType> createNewSUT() {
        return javax.management.openmbean.ArrayType.class;
    }

}
