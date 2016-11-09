package org.j8unit.repository.javax.tools;

import javax.tools.OptionChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OptionChecker} (by simply reusing the
 * J8Unit test interface {@link OptionCheckerClassTests}).
 */

@RunWith(J8Unit4.class)
public class OptionCheckerClassTest
implements OptionCheckerClassTests<OptionChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.OptionChecker]

    @Override
    public Class<OptionChecker> createNewSUT() {
        return OptionChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.OptionChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.OptionChecker]

}
