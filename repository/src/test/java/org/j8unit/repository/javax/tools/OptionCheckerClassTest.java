package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionCheckerClassTest
implements org.j8unit.repository.javax.tools.OptionCheckerClassTests<javax.tools.OptionChecker> {

    @Override
    public Class<javax.tools.OptionChecker> createNewSUT() {
        return javax.tools.OptionChecker.class;
    }

}
