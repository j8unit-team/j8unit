package org.j8unit.repository.javax.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import javax.print.DocFlavor;
import javax.print.DocFlavor.BYTE_ARRAY;
import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.DocFlavor.READER;
import javax.print.DocFlavor.SERVICE_FORMATTED;
import javax.print.DocFlavor.STRING;
import javax.print.DocFlavor.URL;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class DocFlavorTest
implements org.j8unit.repository.javax.print.DocFlavorTests<DocFlavor> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor]

    @Override
    public DocFlavor createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.print.DocFlavor], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class INPUT_STREAMTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.INPUT_STREAMTests<INPUT_STREAM> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(INPUT_STREAM.PDF, //
                                    INPUT_STREAM.TEXT_PLAIN_UTF_16LE, //
                                    INPUT_STREAM.TEXT_HTML_UTF_16LE, //
                                    INPUT_STREAM.PCL, //
                                    INPUT_STREAM.POSTSCRIPT, //
                                    INPUT_STREAM.TEXT_HTML_UTF_16, //
                                    INPUT_STREAM.TEXT_PLAIN_UTF_8, //
                                    INPUT_STREAM.TEXT_PLAIN_US_ASCII, //
                                    INPUT_STREAM.TEXT_HTML_UTF_8, //
                                    INPUT_STREAM.GIF, //
                                    INPUT_STREAM.TEXT_PLAIN_HOST, //
                                    INPUT_STREAM.TEXT_HTML_HOST, //
                                    INPUT_STREAM.PNG, //
                                    INPUT_STREAM.TEXT_HTML_US_ASCII, //
                                    INPUT_STREAM.JPEG, //
                                    INPUT_STREAM.TEXT_PLAIN_UTF_16, //
                                    INPUT_STREAM.TEXT_PLAIN_UTF_16BE, //
                                    INPUT_STREAM.TEXT_HTML_UTF_16BE, //
                                    INPUT_STREAM.AUTOSENSE);
        }

        @Parameter(0)
        public INPUT_STREAM sut;

        @Override
        public INPUT_STREAM createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$INPUT_STREAM]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class URLTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.URLTests<URL> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$URL]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(URL.POSTSCRIPT, //
                                                       URL.PCL, //
                                                       URL.TEXT_PLAIN_UTF_16LE, //
                                                       URL.TEXT_HTML_UTF_16LE, //
                                                       URL.PDF, //
                                                       URL.TEXT_PLAIN_UTF_16, //
                                                       URL.TEXT_PLAIN_UTF_16BE, //
                                                       URL.TEXT_HTML_UTF_16BE, //
                                                       URL.AUTOSENSE, //
                                                       URL.TEXT_PLAIN_HOST, //
                                                       URL.TEXT_HTML_HOST, //
                                                       URL.PNG, //
                                                       URL.TEXT_HTML_US_ASCII, //
                                                       URL.JPEG, //
                                                       URL.TEXT_HTML_UTF_8, //
                                                       URL.GIF, //
                                                       URL.TEXT_HTML_UTF_16, //
                                                       URL.TEXT_PLAIN_UTF_8, //
                                                       URL.TEXT_PLAIN_US_ASCII);
        }

        @Parameter(0)
        public URL sut;

        @Override
        public URL createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$URL]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$URL]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class READERTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.READERTests<READER> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$READER]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(READER.TEXT_PLAIN, //
                                                       READER.TEXT_HTML);
        }

        @Parameter(0)
        public READER sut;

        @Override
        public READER createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$READER]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$READER]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class STRINGTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.STRINGTests<STRING> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$STRING]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(STRING.TEXT_PLAIN, //
                                                       STRING.TEXT_HTML);
        }

        @Parameter(0)
        public STRING sut;

        @Override
        public STRING createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$STRING]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$STRING]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CHAR_ARRAYTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.CHAR_ARRAYTests<CHAR_ARRAY> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(CHAR_ARRAY.TEXT_HTML, //
                                                       CHAR_ARRAY.TEXT_PLAIN);
        }

        @Parameter(0)
        public CHAR_ARRAY sut;

        @Override
        public CHAR_ARRAY createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$CHAR_ARRAY]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BYTE_ARRAYTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.BYTE_ARRAYTests<BYTE_ARRAY> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(BYTE_ARRAY.GIF, //
                                                       BYTE_ARRAY.TEXT_HTML_UTF_8, //
                                                       BYTE_ARRAY.TEXT_PLAIN_US_ASCII, //
                                                       BYTE_ARRAY.TEXT_PLAIN_UTF_8, //
                                                       BYTE_ARRAY.TEXT_HTML_UTF_16, //
                                                       BYTE_ARRAY.TEXT_PLAIN_UTF_16BE, //
                                                       BYTE_ARRAY.TEXT_HTML_UTF_16BE, //
                                                       BYTE_ARRAY.AUTOSENSE, //
                                                       BYTE_ARRAY.TEXT_PLAIN_UTF_16, //
                                                       BYTE_ARRAY.TEXT_HTML_US_ASCII, //
                                                       BYTE_ARRAY.JPEG, //
                                                       BYTE_ARRAY.TEXT_PLAIN_HOST, //
                                                       BYTE_ARRAY.TEXT_HTML_HOST, //
                                                       BYTE_ARRAY.PNG, //
                                                       BYTE_ARRAY.TEXT_PLAIN_UTF_16LE, //
                                                       BYTE_ARRAY.TEXT_HTML_UTF_16LE, //
                                                       BYTE_ARRAY.PDF, //
                                                       BYTE_ARRAY.POSTSCRIPT, //
                                                       BYTE_ARRAY.PCL);
        }

        @Parameter(0)
        public BYTE_ARRAY sut;

        @Override
        public BYTE_ARRAY createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$BYTE_ARRAY]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SERVICE_FORMATTEDTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.SERVICE_FORMATTEDTests<SERVICE_FORMATTED> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(SERVICE_FORMATTED.PAGEABLE, //
                                                       SERVICE_FORMATTED.RENDERABLE_IMAGE, //
                                                       SERVICE_FORMATTED.PRINTABLE);
        }

        @Parameter(0)
        public SERVICE_FORMATTED sut;

        @Override
        public SERVICE_FORMATTED createNewSUT() {
            return this.sut;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.DocFlavor$SERVICE_FORMATTED]

    }

}
