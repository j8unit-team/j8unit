package org.j8unit.repository.java.awt.im;

import java.awt.im.InputSubset;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link InputSubset} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.awt.im.InputSubsetClassTests}).
 */

@RunWith(J8Unit4.class)
public class InputSubsetClassTest
implements InputSubsetClassTests<InputSubset> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.im.InputSubset]

    @Override
    public Class<InputSubset> createNewSUT() {
        return InputSubset.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.im.InputSubset]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.im.InputSubset]

}
