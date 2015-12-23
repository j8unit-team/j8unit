package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MultipleDocumentHandlingTest
implements org.j8unit.repository.javax.print.attribute.standard.MultipleDocumentHandlingTests<javax.print.attribute.standard.MultipleDocumentHandling> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.MultipleDocumentHandling.SINGLE_DOCUMENT, //
                                javax.print.attribute.standard.MultipleDocumentHandling.SINGLE_DOCUMENT_NEW_SHEET, //
                                javax.print.attribute.standard.MultipleDocumentHandling.SEPARATE_DOCUMENTS_UNCOLLATED_COPIES, //
                                javax.print.attribute.standard.MultipleDocumentHandling.SEPARATE_DOCUMENTS_COLLATED_COPIES);
    }

    @Parameter(0)
    public javax.print.attribute.standard.MultipleDocumentHandling sut;

    @Override
    public javax.print.attribute.standard.MultipleDocumentHandling createNewSUT() {
        return this.sut;
    }

}
