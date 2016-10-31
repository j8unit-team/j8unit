package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.MultipleDocumentHandling;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MultipleDocumentHandlingTest
implements org.j8unit.repository.javax.print.attribute.standard.MultipleDocumentHandlingTests<MultipleDocumentHandling> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MultipleDocumentHandling]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MultipleDocumentHandling.SINGLE_DOCUMENT, //
                                MultipleDocumentHandling.SINGLE_DOCUMENT_NEW_SHEET, //
                                MultipleDocumentHandling.SEPARATE_DOCUMENTS_UNCOLLATED_COPIES, //
                                MultipleDocumentHandling.SEPARATE_DOCUMENTS_COLLATED_COPIES);
    }

    @Parameter(0)
    public MultipleDocumentHandling sut;

    @Override
    public MultipleDocumentHandling createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.MultipleDocumentHandling]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.MultipleDocumentHandling]

}
