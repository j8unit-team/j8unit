package org.j8unit.repository.javax.tools;

import javax.tools.OptionChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionCheckerClassTest
implements org.j8unit.repository.javax.tools.OptionCheckerClassTests<OptionChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.OptionChecker]

    @Override
    public Class<OptionChecker> createNewSUT() {
        return OptionChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.OptionChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.OptionChecker]

}
