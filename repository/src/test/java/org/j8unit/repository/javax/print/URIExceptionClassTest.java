package org.j8unit.repository.javax.print;

import javax.print.URIException;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URIException} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.print.URIExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class URIExceptionClassTest
implements URIExceptionClassTests<URIException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.URIException]

    @Override
    public Class<URIException> createNewSUT() {
        return URIException.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.URIException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.URIException]

}
