package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.management.ObjectName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ObjectNameTest
implements org.j8unit.repository.javax.management.ObjectNameTests<ObjectName> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ObjectName]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ObjectName.WILDCARD);
    }

    @Parameter(0)
    public ObjectName sut;

    @Override
    public ObjectName createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.ObjectName]

}
