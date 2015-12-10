package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolProviderTest
implements org.j8unit.repository.javax.tools.ToolProviderTests<javax.tools.ToolProvider> {

    @Override
    public javax.tools.ToolProvider createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.tools.ToolProvider] available.");
    }

}
