package org.j8unit.repository.javax.tools;

import javax.tools.OptionChecker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionCheckerTest
implements org.j8unit.repository.javax.tools.OptionCheckerTests<OptionChecker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.OptionChecker]

    @Override
    public OptionChecker createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.OptionChecker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.OptionChecker]

}
