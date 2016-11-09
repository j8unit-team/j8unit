package org.j8unit.repository.javax.swing;

import javax.swing.BoundedRangeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BoundedRangeModel} (by simply reusing
 * the J8Unit test interface {@link BoundedRangeModelTests}).
 */

@RunWith(J8Unit4.class)
public class BoundedRangeModelTest
implements BoundedRangeModelTests<BoundedRangeModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.BoundedRangeModel]

    @Override
    public BoundedRangeModel createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.BoundedRangeModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.BoundedRangeModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.BoundedRangeModel]

}
