package org.j8unit.repository.javax.management;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.management.AttributeValueExp;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.JavaBug;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class AttributeValueExpTest
implements FactoryBasedJ8UnitTest<AttributeValueExp>, AttributeValueExpTests<AttributeValueExp> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.AttributeValueExp]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(AttributeValueExp::new);
    }

    @Parameter(0)
    public Callable<AttributeValueExp> sutFactory;

    @Override
    public Callable<AttributeValueExp> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.AttributeValueExp]

    /**
     * @see AttributeValueExpBugs#toStringReturnsNull() {@code new AttributeValueExp().toString()} returns {@code null}
     *      illegally!
     * @see AttributeValueExpBugs#toStringReturnsNull2() {@code new AttributeValueExp(null).toString()} returns
     *      {@code null} illegally!
     *
     * @since 0.9.4
     */
    @Category(JavaBug.class)
    @Override
    public void toStringMustReturnNotNull() {
        AttributeValueExpTests.super.toStringMustReturnNotNull();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.AttributeValueExp]

}
