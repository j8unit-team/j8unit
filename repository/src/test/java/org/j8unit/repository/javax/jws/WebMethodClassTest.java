package org.j8unit.repository.javax.jws;

import javax.jws.WebMethod;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebMethod} (by simply reusing the J8Unit
 * test interface {@link WebMethodClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebMethodClassTest
implements WebMethodClassTests<WebMethod> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebMethod]

    @Override
    public Class<WebMethod> createNewSUT() {
        return WebMethod.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebMethod]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebMethod]

}
