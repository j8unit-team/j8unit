package org.j8unit.repository.javax.swing;

import javax.swing.BoundedRangeModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BoundedRangeModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.BoundedRangeModelClassTests}).
 */
@RunWith(J8Unit4.class)
public class BoundedRangeModelClassTest
implements BoundedRangeModelClassTests<BoundedRangeModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.BoundedRangeModel]

    @Override
    public Class<BoundedRangeModel> createNewSUT() {
        return BoundedRangeModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.BoundedRangeModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.BoundedRangeModel]

}
