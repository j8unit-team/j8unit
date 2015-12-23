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
public class ReferenceUriSchemesSupportedTest
implements org.j8unit.repository.javax.print.attribute.standard.ReferenceUriSchemesSupportedTests<javax.print.attribute.standard.ReferenceUriSchemesSupported> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.ReferenceUriSchemesSupported.NEWS, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.HTTPS, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.FTP, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.WAIS, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.FILE, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.HTTP, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.GOPHER, //
                                javax.print.attribute.standard.ReferenceUriSchemesSupported.NNTP);
    }

    @Parameter(0)
    public javax.print.attribute.standard.ReferenceUriSchemesSupported sut;

    @Override
    public javax.print.attribute.standard.ReferenceUriSchemesSupported createNewSUT() {
        return this.sut;
    }

}
