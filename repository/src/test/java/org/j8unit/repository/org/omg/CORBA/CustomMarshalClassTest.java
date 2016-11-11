package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.CustomMarshal;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CustomMarshal} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.CustomMarshalClassTests}).
 */

@RunWith(J8Unit4.class)
public class CustomMarshalClassTest
implements CustomMarshalClassTests<CustomMarshal> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CustomMarshal]

    @Override
    public Class<CustomMarshal> createNewSUT() {
        return CustomMarshal.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CustomMarshal]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CustomMarshal]

}
