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
public class MediaTrayTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaTrayTests<javax.print.attribute.standard.MediaTray> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.MediaTray.SIDE, //
                                javax.print.attribute.standard.MediaTray.LARGE_CAPACITY, //
                                javax.print.attribute.standard.MediaTray.TOP, //
                                javax.print.attribute.standard.MediaTray.ENVELOPE, //
                                javax.print.attribute.standard.MediaTray.BOTTOM, //
                                javax.print.attribute.standard.MediaTray.MANUAL, //
                                javax.print.attribute.standard.MediaTray.MAIN, //
                                javax.print.attribute.standard.MediaTray.MIDDLE);
    }

    @Parameter(0)
    public javax.print.attribute.standard.MediaTray sut;

    @Override
    public javax.print.attribute.standard.MediaTray createNewSUT() {
        return this.sut;
    }

}
