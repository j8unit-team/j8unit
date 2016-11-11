package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
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
public class DefaultHighlighterTest
implements FactoryBasedJ8UnitTest<DefaultHighlighter>, DefaultHighlighterTests<DefaultHighlighter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultHighlighter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DefaultHighlighter::new);
    }

    @Parameter(0)
    public Callable<DefaultHighlighter> sutFactory;

    @Override
    public Callable<DefaultHighlighter> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultHighlighter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultHighlighter]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DefaultHighlightPainter} (by
     * simply reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.text.DefaultHighlighterTests.DefaultHighlightPainterTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DefaultHighlightPainterTest
    implements DefaultHighlightPainterTests<DefaultHighlightPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

        @Override
        public DefaultHighlightPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.DefaultHighlighter.DefaultHighlightPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.DefaultHighlighter$DefaultHighlightPainter]

    }

}
