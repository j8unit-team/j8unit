package org.j8unit.repository.javax.swing.text.html;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.StyleSheet;
import javax.swing.text.html.StyleSheet.BoxPainter;
import javax.swing.text.html.StyleSheet.ListPainter;
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
public class StyleSheetTest
implements FactoryBasedJ8UnitTest<StyleSheet>, StyleSheetTests<StyleSheet> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.StyleSheet]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(StyleSheet::new);
    }

    @Parameter(0)
    public Callable<StyleSheet> sutFactory;

    @Override
    public Callable<StyleSheet> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.StyleSheet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.StyleSheet]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link BoxPainter} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.StyleSheetTests.BoxPainterTests}).
     */

    @RunWith(J8Unit4.class)
    public static class BoxPainterTest
    implements BoxPainterTests<BoxPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.StyleSheet$BoxPainter]

        @Override
        public BoxPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.StyleSheet.BoxPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.StyleSheet$BoxPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.StyleSheet$BoxPainter]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link ListPainter} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.StyleSheetTests.ListPainterTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ListPainterTest
    implements ListPainterTests<ListPainter> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.StyleSheet$ListPainter]

        @Override
        public ListPainter createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.StyleSheet.ListPainter], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.StyleSheet$ListPainter]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.StyleSheet$ListPainter]

    }

}
