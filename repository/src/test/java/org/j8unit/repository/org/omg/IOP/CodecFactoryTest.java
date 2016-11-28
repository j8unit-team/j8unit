package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link CodecFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.CodecFactoryTests}).
 */
@RunWith(J8Unit4.class)
public class CodecFactoryTest
implements CodecFactoryTests<CodecFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecFactory]

    @Override
    public CodecFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecFactory]

}
