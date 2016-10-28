package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.NavigationFilter;
import javax.swing.text.NavigationFilter.FilterBypass;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class NavigationFilterTest
implements FactoryBasedJ8UnitTest<NavigationFilter>, org.j8unit.repository.javax.swing.text.NavigationFilterTests<NavigationFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.NavigationFilter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(NavigationFilter::new);
    }

    @Parameter(0)
    public Callable<NavigationFilter> sutFactory;

    @Override
    public Callable<NavigationFilter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.NavigationFilter]

    @RunWith(J8Unit4.class)
    public static class FilterBypassTest
    implements org.j8unit.repository.javax.swing.text.NavigationFilterTests.FilterBypassTests<FilterBypass> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.NavigationFilter$FilterBypass]

        @Override
        public FilterBypass createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.NavigationFilter.FilterBypass], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.NavigationFilter$FilterBypass]

    }

}
