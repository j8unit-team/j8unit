package org.j8unit.repository.javax.accessibility;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.accessibility.AccessibleStateSet;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.categories.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AccessibleStateSetTest
implements FactoryBasedJ8UnitTest<AccessibleStateSet>, AccessibleStateSetTests<AccessibleStateSet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleStateSet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(AccessibleStateSet::new);
    }

    @Parameter(0)
    public Callable<AccessibleStateSet> sutFactory;

    @Override
    public Callable<AccessibleStateSet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleStateSet]

    /**
     * @see AccessibleStateSetBugs#toStringReturnsNull() {@code new AccessibleStateSet().toString()} returns
     *      {@code null} illegally!
     *
     * @since 0.9.4
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void toStringMustReturnNotNull() {
        AccessibleStateSetTests.super.toStringMustReturnNotNull();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleStateSet]

}
