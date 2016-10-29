package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.time.format.DateTimeFormatter;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DateTimeFormatterTest
implements org.j8unit.repository.java.time.format.DateTimeFormatterTests<DateTimeFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DateTimeFormatter]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(DateTimeFormatter.ISO_ORDINAL_DATE, //
                                DateTimeFormatter.ISO_OFFSET_DATE, //
                                DateTimeFormatter.ISO_LOCAL_TIME, //
                                DateTimeFormatter.ISO_WEEK_DATE, //
                                DateTimeFormatter.BASIC_ISO_DATE, //
                                DateTimeFormatter.ISO_LOCAL_DATE, //
                                DateTimeFormatter.RFC_1123_DATE_TIME, //
                                DateTimeFormatter.ISO_LOCAL_DATE_TIME, //
                                DateTimeFormatter.ISO_OFFSET_TIME, //
                                DateTimeFormatter.ISO_DATE, //
                                DateTimeFormatter.ISO_TIME, //
                                DateTimeFormatter.ISO_OFFSET_DATE_TIME, //
                                DateTimeFormatter.ISO_DATE_TIME, //
                                DateTimeFormatter.ISO_ZONED_DATE_TIME, //
                                DateTimeFormatter.ISO_INSTANT);
    }

    @Parameter(0)
    public DateTimeFormatter sut;

    @Override
    public DateTimeFormatter createNewSUT() {
        return this.sut;
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.time.format.DateTimeFormatter]

}
