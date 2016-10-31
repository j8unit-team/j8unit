package org.j8unit.repository.javax.accessibility;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.accessibility.AccessibleRelationSet;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccessibleRelationSetTest
implements FactoryBasedJ8UnitTest<AccessibleRelationSet>, org.j8unit.repository.javax.accessibility.AccessibleRelationSetTests<AccessibleRelationSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleRelationSet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AccessibleRelationSet::new);
    }

    @Parameter(0)
    public Callable<AccessibleRelationSet> sutFactory;

    @Override
    public Callable<AccessibleRelationSet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleRelationSet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleRelationSet]

}
