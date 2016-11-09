package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Binding;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Binding} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.ws.BindingTests}).
 */

@RunWith(J8Unit4.class)
public class BindingTest
implements org.j8unit.repository.javax.xml.ws.BindingTests<Binding> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.ws.Binding]

    @Override
    public Binding createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.ws.Binding], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.ws.Binding]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.ws.Binding]

}
