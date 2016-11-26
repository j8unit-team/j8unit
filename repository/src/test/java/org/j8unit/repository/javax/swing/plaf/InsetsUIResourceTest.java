package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.InsetsUIResource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InsetsUIResource} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.InsetsUIResourceTests}).
 */
@RunWith(J8Unit4.class)
public class InsetsUIResourceTest
implements InsetsUIResourceTests<InsetsUIResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.InsetsUIResource]

    @Override
    public InsetsUIResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.InsetsUIResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.InsetsUIResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.InsetsUIResource]

}
