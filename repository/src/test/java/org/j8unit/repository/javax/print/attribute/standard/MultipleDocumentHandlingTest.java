package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.MultipleDocumentHandling;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
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

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MultipleDocumentHandling]

}
