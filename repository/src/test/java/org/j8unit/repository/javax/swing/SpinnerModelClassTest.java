package org.j8unit.repository.javax.swing;

import javax.swing.SpinnerModel;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SpinnerModel} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.SpinnerModelClassTests}).
 */

@RunWith(J8Unit4.class)
public class SpinnerModelClassTest
implements SpinnerModelClassTests<SpinnerModel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.SpinnerModel]

    @Override
    public Class<SpinnerModel> createNewSUT() {
        return SpinnerModel.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.SpinnerModel]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.SpinnerModel]

}
