package org.j8unit.repository.javax.net.ssl;

import javax.net.ssl.StandardConstants;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardConstants} (by simply reusing the
 * J8Unit test interface {@link StandardConstantsClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardConstantsClassTest
implements StandardConstantsClassTests<StandardConstants> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.net.ssl.StandardConstants]

    @Override
    public Class<StandardConstants> createNewSUT() {
        return StandardConstants.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.net.ssl.StandardConstants]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.net.ssl.StandardConstants]

}
