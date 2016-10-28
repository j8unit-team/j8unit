package org.j8unit.repository.javax.tools;

import javax.tools.ToolProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ToolProviderTest
implements org.j8unit.repository.javax.tools.ToolProviderTests<ToolProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ToolProvider]

    @Override
    public ToolProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ToolProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ToolProvider]

}
