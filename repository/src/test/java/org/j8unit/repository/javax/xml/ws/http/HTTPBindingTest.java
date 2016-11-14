package org.j8unit.repository.javax.xml.ws.http;

import javax.xml.ws.http.HTTPBinding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link HTTPBinding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.http.HTTPBindingTests}).
 */

@RunWith(J8Unit4.class)
public class HTTPBindingTest
implements HTTPBindingTests<HTTPBinding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]

    @Override
    public HTTPBinding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.http.HTTPBinding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.http.HTTPBinding]

}
