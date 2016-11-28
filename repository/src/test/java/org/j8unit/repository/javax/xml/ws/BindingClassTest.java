package org.j8unit.repository.javax.xml.ws;

import javax.xml.ws.Binding;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Binding} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.ws.BindingClassTests}).
 */
@RunWith(J8Unit4.class)
public class BindingClassTest
implements BindingClassTests<Binding> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.ws.Binding]

    @Override
    public Class<Binding> createNewSUT() {
        return Binding.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.ws.Binding]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.ws.Binding]

}
