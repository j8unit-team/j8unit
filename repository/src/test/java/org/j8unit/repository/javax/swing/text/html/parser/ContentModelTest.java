package org.j8unit.repository.javax.swing.text.html.parser;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.html.parser.ContentModel;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.repository.JavaBug;
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
public class ContentModelTest
implements FactoryBasedJ8UnitTest<ContentModel>, ContentModelTests<ContentModel> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.parser.ContentModel]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ContentModel::new);
    }

    @Parameter(0)
    public Callable<ContentModel> sutFactory;

    @Override
    public Callable<ContentModel> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.parser.ContentModel]

    /**
     * @see ContentModelBugs#toStringThrowsAnException() {@code new ContentModel().toString()} throws
     *      {@code NullPointerException} illegally!
     * @see ContentModelBugs#toStringThrowsAnException2() {@code new ContentModel(null).toString()} throws
     *      {@code NullPointerException} illegally!
     *
     * @since 0.9.4
     */
    @Test
    @Category(JavaBug.class)
    @Override
    public void toStringMustReturnNotNull() {
        ContentModelTests.super.toStringMustReturnNotNull();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.parser.ContentModel]

}
