package org.j8unit.repository.javax.swing.plaf;

import javax.swing.plaf.DimensionUIResource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DimensionUIResource} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.DimensionUIResourceTests}).
 */
@RunWith(J8Unit4.class)
public class DimensionUIResourceTest
implements DimensionUIResourceTests<DimensionUIResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.DimensionUIResource]

    @Override
    public DimensionUIResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.DimensionUIResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.DimensionUIResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.DimensionUIResource]

}
