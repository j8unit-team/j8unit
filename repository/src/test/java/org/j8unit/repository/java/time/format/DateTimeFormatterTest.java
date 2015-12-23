package org.j8unit.repository.java.time.format;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class DateTimeFormatterTest
implements org.j8unit.repository.java.time.format.DateTimeFormatterTests<java.time.format.DateTimeFormatter> {

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(java.time.format.DateTimeFormatter.ISO_ORDINAL_DATE, //
                                java.time.format.DateTimeFormatter.ISO_OFFSET_DATE, //
                                java.time.format.DateTimeFormatter.ISO_LOCAL_TIME, //
                                java.time.format.DateTimeFormatter.ISO_WEEK_DATE, //
                                java.time.format.DateTimeFormatter.BASIC_ISO_DATE, //
                                java.time.format.DateTimeFormatter.ISO_LOCAL_DATE, //
                                java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME, //
                                java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME, //
                                java.time.format.DateTimeFormatter.ISO_OFFSET_TIME, //
                                java.time.format.DateTimeFormatter.ISO_DATE, //
                                java.time.format.DateTimeFormatter.ISO_TIME, //
                                java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME, //
                                java.time.format.DateTimeFormatter.ISO_DATE_TIME, //
                                java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME, //
                                java.time.format.DateTimeFormatter.ISO_INSTANT);
    }

    @Parameter(0)
    public java.time.format.DateTimeFormatter sut;

    @Override
    public java.time.format.DateTimeFormatter createNewSUT() {
        return this.sut;
    }

}
