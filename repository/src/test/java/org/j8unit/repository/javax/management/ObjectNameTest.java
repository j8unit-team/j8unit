package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.ObjectName;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ObjectName} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.ObjectNameTests}).
 */

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class ObjectNameTest
implements ObjectNameTests<ObjectName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ObjectName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(ObjectName.WILDCARD);
    }

    @Parameter(0)
    public ObjectName sut;

    @Override
    public ObjectName createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.ObjectName]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.ObjectName]

}
