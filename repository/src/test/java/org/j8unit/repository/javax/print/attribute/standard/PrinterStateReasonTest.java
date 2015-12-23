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
public class PrinterStateReasonTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterStateReasonTests<javax.print.attribute.standard.PrinterStateReason> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(javax.print.attribute.standard.PrinterStateReason.CONNECTING_TO_DEVICE, //
                                javax.print.attribute.standard.PrinterStateReason.MOVING_TO_PAUSED, //
                                javax.print.attribute.standard.PrinterStateReason.DEVELOPER_LOW, //
                                javax.print.attribute.standard.PrinterStateReason.COVER_OPEN, //
                                javax.print.attribute.standard.PrinterStateReason.MEDIA_NEEDED, //
                                javax.print.attribute.standard.PrinterStateReason.INTERLOCK_OPEN, //
                                javax.print.attribute.standard.PrinterStateReason.INTERPRETER_RESOURCE_UNAVAILABLE, //
                                javax.print.attribute.standard.PrinterStateReason.MARKER_WASTE_FULL, //
                                javax.print.attribute.standard.PrinterStateReason.OUTPUT_AREA_FULL, //
                                javax.print.attribute.standard.PrinterStateReason.OTHER, //
                                javax.print.attribute.standard.PrinterStateReason.INPUT_TRAY_MISSING, //
                                javax.print.attribute.standard.PrinterStateReason.MEDIA_LOW, //
                                javax.print.attribute.standard.PrinterStateReason.DOOR_OPEN, //
                                javax.print.attribute.standard.PrinterStateReason.MEDIA_JAM, //
                                javax.print.attribute.standard.PrinterStateReason.DEVELOPER_EMPTY, //
                                javax.print.attribute.standard.PrinterStateReason.STOPPED_PARTLY, //
                                javax.print.attribute.standard.PrinterStateReason.TONER_EMPTY, //
                                javax.print.attribute.standard.PrinterStateReason.OPC_NEAR_EOL, //
                                javax.print.attribute.standard.PrinterStateReason.OUTPUT_AREA_ALMOST_FULL, //
                                javax.print.attribute.standard.PrinterStateReason.MARKER_SUPPLY_EMPTY, //
                                javax.print.attribute.standard.PrinterStateReason.MEDIA_EMPTY, //
                                javax.print.attribute.standard.PrinterStateReason.MARKER_WASTE_ALMOST_FULL, //
                                javax.print.attribute.standard.PrinterStateReason.FUSER_UNDER_TEMP, //
                                javax.print.attribute.standard.PrinterStateReason.PAUSED, //
                                javax.print.attribute.standard.PrinterStateReason.TONER_LOW, //
                                javax.print.attribute.standard.PrinterStateReason.OUTPUT_TRAY_MISSING, //
                                javax.print.attribute.standard.PrinterStateReason.FUSER_OVER_TEMP, //
                                javax.print.attribute.standard.PrinterStateReason.TIMED_OUT, //
                                javax.print.attribute.standard.PrinterStateReason.SHUTDOWN, //
                                javax.print.attribute.standard.PrinterStateReason.OPC_LIFE_OVER, //
                                javax.print.attribute.standard.PrinterStateReason.STOPPING, //
                                javax.print.attribute.standard.PrinterStateReason.MARKER_SUPPLY_LOW, //
                                javax.print.attribute.standard.PrinterStateReason.SPOOL_AREA_FULL);
    }

    @Parameter(0)
    public javax.print.attribute.standard.PrinterStateReason sut;

    @Override
    public javax.print.attribute.standard.PrinterStateReason createNewSUT() {
        return this.sut;
    }

}
