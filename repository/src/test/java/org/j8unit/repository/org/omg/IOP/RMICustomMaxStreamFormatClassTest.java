package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.RMICustomMaxStreamFormat;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link RMICustomMaxStreamFormat} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.RMICustomMaxStreamFormatClassTests}).
 */

@RunWith(J8Unit4.class)
public class RMICustomMaxStreamFormatClassTest
implements RMICustomMaxStreamFormatClassTests<RMICustomMaxStreamFormat> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.RMICustomMaxStreamFormat]

    @Override
    public Class<RMICustomMaxStreamFormat> createNewSUT() {
        return RMICustomMaxStreamFormat.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.RMICustomMaxStreamFormat]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.RMICustomMaxStreamFormat]

}
