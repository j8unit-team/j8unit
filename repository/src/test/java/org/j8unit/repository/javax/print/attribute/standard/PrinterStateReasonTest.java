package org.j8unit.repository.javax.print.attribute.standard;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.attribute.standard.PrinterStateReason;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class PrinterStateReasonTest
implements org.j8unit.repository.javax.print.attribute.standard.PrinterStateReasonTests<PrinterStateReason> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.PrinterStateReason]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(PrinterStateReason.CONNECTING_TO_DEVICE, //
                                PrinterStateReason.MOVING_TO_PAUSED, //
                                PrinterStateReason.DEVELOPER_LOW, //
                                PrinterStateReason.COVER_OPEN, //
                                PrinterStateReason.MEDIA_NEEDED, //
                                PrinterStateReason.INTERLOCK_OPEN, //
                                PrinterStateReason.INTERPRETER_RESOURCE_UNAVAILABLE, //
                                PrinterStateReason.MARKER_WASTE_FULL, //
                                PrinterStateReason.OUTPUT_AREA_FULL, //
                                PrinterStateReason.OTHER, //
                                PrinterStateReason.INPUT_TRAY_MISSING, //
                                PrinterStateReason.MEDIA_LOW, //
                                PrinterStateReason.DOOR_OPEN, //
                                PrinterStateReason.MEDIA_JAM, //
                                PrinterStateReason.DEVELOPER_EMPTY, //
                                PrinterStateReason.STOPPED_PARTLY, //
                                PrinterStateReason.TONER_EMPTY, //
                                PrinterStateReason.OPC_NEAR_EOL, //
                                PrinterStateReason.OUTPUT_AREA_ALMOST_FULL, //
                                PrinterStateReason.MARKER_SUPPLY_EMPTY, //
                                PrinterStateReason.MEDIA_EMPTY, //
                                PrinterStateReason.MARKER_WASTE_ALMOST_FULL, //
                                PrinterStateReason.FUSER_UNDER_TEMP, //
                                PrinterStateReason.PAUSED, //
                                PrinterStateReason.TONER_LOW, //
                                PrinterStateReason.OUTPUT_TRAY_MISSING, //
                                PrinterStateReason.FUSER_OVER_TEMP, //
                                PrinterStateReason.TIMED_OUT, //
                                PrinterStateReason.SHUTDOWN, //
                                PrinterStateReason.OPC_LIFE_OVER, //
                                PrinterStateReason.STOPPING, //
                                PrinterStateReason.MARKER_SUPPLY_LOW, //
                                PrinterStateReason.SPOOL_AREA_FULL);
    }

    @Parameter(0)
    public PrinterStateReason sut;

    @Override
    public PrinterStateReason createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.PrinterStateReason]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.PrinterStateReason]

}
