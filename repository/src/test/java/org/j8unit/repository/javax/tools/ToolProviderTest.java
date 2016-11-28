package org.j8unit.repository.javax.tools;

import javax.tools.ToolProvider;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ToolProvider} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.tools.ToolProviderTests}).
 */
@RunWith(J8Unit4.class)
public class ToolProviderTest
implements ToolProviderTests<ToolProvider> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.ToolProvider]

    @Override
    public ToolProvider createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.tools.ToolProvider], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.ToolProvider]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.ToolProvider]

}
