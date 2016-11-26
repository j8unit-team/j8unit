package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.portable.Streamable;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Streamable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.CORBA.portable.StreamableClassTests}).
 */
@RunWith(J8Unit4.class)
public class StreamableClassTest
implements StreamableClassTests<Streamable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.portable.Streamable]

    @Override
    public Class<Streamable> createNewSUT() {
        return Streamable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.portable.Streamable]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.portable.Streamable]

}
