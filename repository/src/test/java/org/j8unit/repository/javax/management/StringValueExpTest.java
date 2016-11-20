package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.StringValueExp;
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
public class StringValueExpTest
implements FactoryBasedJ8UnitTest<StringValueExp>, StringValueExpTests<StringValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.StringValueExp]

    @Parameters(name = "{index}: {0}")
    public static Iterable<? extends Object> sutData() {
        return testParametersOf(StringValueExp::new);
    }

    @Parameter(0)
    public Callable<StringValueExp> sutFactory;

    @Override
    public Callable<StringValueExp> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.StringValueExp]

    /**
     * @see StringValueExpBugs#toStringThrowsAnException() {@code new StringValueExp().toString()} throws
     *      {@code NullPointerException} illegally!
     * @see StringValueExpBugs#toStringThrowsAnException2() {@code new StringValueExp(null).toString()} throws
     *      {@code NullPointerException} illegally!
     *
     * @since 0.9.4
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void toStringMustReturnNotNull() {
        StringValueExpTests.super.toStringMustReturnNotNull();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.StringValueExp]

}
