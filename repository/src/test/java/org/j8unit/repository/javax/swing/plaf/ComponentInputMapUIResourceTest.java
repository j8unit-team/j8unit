package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.ComponentInputMapUIResource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ComponentInputMapUIResource} (by
 * simply reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.swing.plaf.ComponentInputMapUIResourceTests}).
 */
@RunWith(J8Unit4.class)
public class ComponentInputMapUIResourceTest
implements ComponentInputMapUIResourceTests<ComponentInputMapUIResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.ComponentInputMapUIResource]

    @Override
    public ComponentInputMapUIResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.ComponentInputMapUIResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.ComponentInputMapUIResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.ComponentInputMapUIResource]

}
