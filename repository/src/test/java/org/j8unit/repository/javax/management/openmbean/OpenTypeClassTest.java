package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class OpenTypeClassTest
implements org.j8unit.repository.javax.management.openmbean.OpenTypeClassTests<javax.management.openmbean.OpenType> {

    @Override
    public Class<javax.management.openmbean.OpenType> createNewSUT() {
        return javax.management.openmbean.OpenType.class;
    }

}
