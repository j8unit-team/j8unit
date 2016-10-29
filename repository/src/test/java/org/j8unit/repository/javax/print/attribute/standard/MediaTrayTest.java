package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.MediaTray;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MediaTrayTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaTrayTests<MediaTray> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaTray]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MediaTray.SIDE, //
                                MediaTray.LARGE_CAPACITY, //
                                MediaTray.TOP, //
                                MediaTray.ENVELOPE, //
                                MediaTray.BOTTOM, //
                                MediaTray.MANUAL, //
                                MediaTray.MAIN, //
                                MediaTray.MIDDLE);
    }

    @Parameter(0)
    public MediaTray sut;

    @Override
    public MediaTray createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.MediaTray]

}
