package org.j8unit.repository.java.nio.charset;

import java.nio.charset.CodingErrorAction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CodingErrorAction} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.nio.charset.CodingErrorActionClassTests}).
 */

@RunWith(J8Unit4.class)
public class CodingErrorActionClassTest
implements CodingErrorActionClassTests<CodingErrorAction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.charset.CodingErrorAction]

    @Override
    public Class<CodingErrorAction> createNewSUT() {
        return CodingErrorAction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.charset.CodingErrorAction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.charset.CodingErrorAction]

}
