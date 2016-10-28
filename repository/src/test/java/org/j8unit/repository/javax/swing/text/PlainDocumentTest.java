package org.j8unit.repository.javax.swing.text;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.text.PlainDocument;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PlainDocumentTest
implements FactoryBasedJ8UnitTest<PlainDocument>, org.j8unit.repository.javax.swing.text.PlainDocumentTests<PlainDocument> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.PlainDocument]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PlainDocument::new);
    }

    @Parameter(0)
    public Callable<PlainDocument> sutFactory;

    @Override
    public Callable<PlainDocument> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.PlainDocument]

}
