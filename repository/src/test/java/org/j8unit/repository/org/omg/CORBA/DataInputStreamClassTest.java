package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DataInputStream;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataInputStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DataInputStreamClassTests}).
 */
@RunWith(J8Unit4.class)
public class DataInputStreamClassTest
implements DataInputStreamClassTests<DataInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DataInputStream]

    @Override
    public Class<DataInputStream> createNewSUT() {
        return DataInputStream.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DataInputStream]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DataInputStream]

}
