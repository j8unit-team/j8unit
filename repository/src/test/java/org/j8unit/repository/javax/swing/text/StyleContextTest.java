package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.StyleContext;
import javax.swing.text.StyleContext.NamedStyle;
import javax.swing.text.StyleContext.SmallAttributeSet;
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
public class StyleContextTest
implements FactoryBasedJ8UnitTest<StyleContext>, StyleContextTests<StyleContext> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleContext]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(StyleContext::new);
    }

    @Parameter(0)
    public Callable<StyleContext> sutFactory;

    @Override
    public Callable<StyleContext> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleContext]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleContext]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link NamedStyle} (by simply reusing
     * the J8Unit test interface {@link NamedStyleTests}).
     */

    @RunWith(J8Unit4.class)
    public static class NamedStyleTest
    implements NamedStyleTests<NamedStyle> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleContext$NamedStyle]

        @Override
        public NamedStyle createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyleContext.NamedStyle], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleContext$NamedStyle]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleContext$NamedStyle]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link SmallAttributeSet} (by simply
     * reusing the J8Unit test interface {@link SmallAttributeSetTests}).
     */

    @RunWith(J8Unit4.class)
    public static class SmallAttributeSetTest
    implements SmallAttributeSetTests<SmallAttributeSet> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.StyleContext$SmallAttributeSet]

        @Override
        public SmallAttributeSet createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.StyleContext.SmallAttributeSet], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.StyleContext$SmallAttributeSet]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.StyleContext$SmallAttributeSet]

    }

}
