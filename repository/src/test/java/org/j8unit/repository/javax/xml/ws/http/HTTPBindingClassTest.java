package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link HTTPBinding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.http.HTTPBindingClassTests}).
 */
@RunWith(J8Unit4.class)
public class HTTPBindingClassTest
implements HTTPBindingClassTests<HTTPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.http.HTTPBinding]

    @Override
    public Class<HTTPBinding> createNewSUT() {
        return HTTPBinding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.http.HTTPBinding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.http.HTTPBinding]

}
