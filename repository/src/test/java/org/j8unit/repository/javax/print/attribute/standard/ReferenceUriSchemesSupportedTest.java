package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(J8Unit4.class)
public class ReferenceUriSchemesSupportedTest
implements org.j8unit.repository.javax.print.attribute.standard.ReferenceUriSchemesSupportedTests<ReferenceUriSchemesSupported> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.ReferenceUriSchemesSupported]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(ReferenceUriSchemesSupported.NEWS, //
                                ReferenceUriSchemesSupported.HTTPS, //
                                ReferenceUriSchemesSupported.FTP, //
                                ReferenceUriSchemesSupported.WAIS, //
                                ReferenceUriSchemesSupported.FILE, //
                                ReferenceUriSchemesSupported.HTTP, //
                                ReferenceUriSchemesSupported.GOPHER, //
                                ReferenceUriSchemesSupported.NNTP);
    }

    @Parameter(0)
    public ReferenceUriSchemesSupported sut;

    @Override
    public ReferenceUriSchemesSupported createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.ReferenceUriSchemesSupported]

}
