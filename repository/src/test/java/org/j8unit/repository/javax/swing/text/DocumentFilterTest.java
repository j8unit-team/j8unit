package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.DocumentFilter;
import javax.swing.text.DocumentFilter.FilterBypass;
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
public class DocumentFilterTest
implements FactoryBasedJ8UnitTest<DocumentFilter>, DocumentFilterTests<DocumentFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DocumentFilter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(DocumentFilter::new);
    }

    @Parameter(0)
    public Callable<DocumentFilter> sutFactory;

    @Override
    public Callable<DocumentFilter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DocumentFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DocumentFilter]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link FilterBypass} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.DocumentFilterTests.FilterBypassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FilterBypassTest
    implements org.j8unit.repository.javax.swing.text.DocumentFilterTests.FilterBypassTests<FilterBypass> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DocumentFilter$FilterBypass]

        @Override
        public FilterBypass createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.text.DocumentFilter.FilterBypass], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DocumentFilter$FilterBypass]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DocumentFilter$FilterBypass]

    }

}
