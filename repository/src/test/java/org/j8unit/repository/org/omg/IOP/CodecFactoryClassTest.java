package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecFactory;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CodecFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.CodecFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class CodecFactoryClassTest
implements CodecFactoryClassTests<CodecFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.CodecFactory]

    @Override
    public Class<CodecFactory> createNewSUT() {
        return CodecFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.CodecFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.CodecFactory]

}
