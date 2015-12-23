package org.j8unit.repository.javax.print;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Unit4.class)
public class DocFlavorTest
implements org.j8unit.repository.javax.print.DocFlavorTests<javax.print.DocFlavor> {

    @Override
    public javax.print.DocFlavor createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.print.DocFlavor] available.");
    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class BYTE_ARRAYTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.BYTE_ARRAYTests<javax.print.DocFlavor.BYTE_ARRAY> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.BYTE_ARRAY.GIF, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_UTF_8, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_US_ASCII, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_8, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_UTF_16, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_16BE, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_UTF_16BE, //
                                    javax.print.DocFlavor.BYTE_ARRAY.AUTOSENSE, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_16, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_US_ASCII, //
                                    javax.print.DocFlavor.BYTE_ARRAY.JPEG, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_HOST, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_HOST, //
                                    javax.print.DocFlavor.BYTE_ARRAY.PNG, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_PLAIN_UTF_16LE, //
                                    javax.print.DocFlavor.BYTE_ARRAY.TEXT_HTML_UTF_16LE, //
                                    javax.print.DocFlavor.BYTE_ARRAY.PDF, //
                                    javax.print.DocFlavor.BYTE_ARRAY.POSTSCRIPT, //
                                    javax.print.DocFlavor.BYTE_ARRAY.PCL);
        }

        @Parameter(0)
        public javax.print.DocFlavor.BYTE_ARRAY sut;

        @Override
        public javax.print.DocFlavor.BYTE_ARRAY createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class STRINGTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.STRINGTests<javax.print.DocFlavor.STRING> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.STRING.TEXT_PLAIN, //
                                    javax.print.DocFlavor.STRING.TEXT_HTML);
        }

        @Parameter(0)
        public javax.print.DocFlavor.STRING sut;

        @Override
        public javax.print.DocFlavor.STRING createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class READERTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.READERTests<javax.print.DocFlavor.READER> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.READER.TEXT_PLAIN, //
                                    javax.print.DocFlavor.READER.TEXT_HTML);
        }

        @Parameter(0)
        public javax.print.DocFlavor.READER sut;

        @Override
        public javax.print.DocFlavor.READER createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class CHAR_ARRAYTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.CHAR_ARRAYTests<javax.print.DocFlavor.CHAR_ARRAY> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.CHAR_ARRAY.TEXT_HTML, //
                                    javax.print.DocFlavor.CHAR_ARRAY.TEXT_PLAIN);
        }

        @Parameter(0)
        public javax.print.DocFlavor.CHAR_ARRAY sut;

        @Override
        public javax.print.DocFlavor.CHAR_ARRAY createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class URLTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.URLTests<javax.print.DocFlavor.URL> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.URL.POSTSCRIPT, //
                                    javax.print.DocFlavor.URL.PCL, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_UTF_16LE, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_UTF_16LE, //
                                    javax.print.DocFlavor.URL.PDF, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_UTF_16, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_UTF_16BE, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_UTF_16BE, //
                                    javax.print.DocFlavor.URL.AUTOSENSE, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_HOST, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_HOST, //
                                    javax.print.DocFlavor.URL.PNG, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_US_ASCII, //
                                    javax.print.DocFlavor.URL.JPEG, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_UTF_8, //
                                    javax.print.DocFlavor.URL.GIF, //
                                    javax.print.DocFlavor.URL.TEXT_HTML_UTF_16, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_UTF_8, //
                                    javax.print.DocFlavor.URL.TEXT_PLAIN_US_ASCII);
        }

        @Parameter(0)
        public javax.print.DocFlavor.URL sut;

        @Override
        public javax.print.DocFlavor.URL createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class INPUT_STREAMTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.INPUT_STREAMTests<javax.print.DocFlavor.INPUT_STREAM> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.INPUT_STREAM.PDF, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_16LE, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_UTF_16LE, //
                                    javax.print.DocFlavor.INPUT_STREAM.PCL, //
                                    javax.print.DocFlavor.INPUT_STREAM.POSTSCRIPT, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_UTF_16, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_8, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_US_ASCII, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_UTF_8, //
                                    javax.print.DocFlavor.INPUT_STREAM.GIF, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_HOST, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_HOST, //
                                    javax.print.DocFlavor.INPUT_STREAM.PNG, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_US_ASCII, //
                                    javax.print.DocFlavor.INPUT_STREAM.JPEG, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_16, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_PLAIN_UTF_16BE, //
                                    javax.print.DocFlavor.INPUT_STREAM.TEXT_HTML_UTF_16BE, //
                                    javax.print.DocFlavor.INPUT_STREAM.AUTOSENSE);
        }

        @Parameter(0)
        public javax.print.DocFlavor.INPUT_STREAM sut;

        @Override
        public javax.print.DocFlavor.INPUT_STREAM createNewSUT() {
            return this.sut;
        }

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class SERVICE_FORMATTEDTest
    implements org.j8unit.repository.javax.print.DocFlavorTests.SERVICE_FORMATTEDTests<javax.print.DocFlavor.SERVICE_FORMATTED> {

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return testParametersOf(javax.print.DocFlavor.SERVICE_FORMATTED.PAGEABLE, //
                                    javax.print.DocFlavor.SERVICE_FORMATTED.RENDERABLE_IMAGE, //
                                    javax.print.DocFlavor.SERVICE_FORMATTED.PRINTABLE);
        }

        @Parameter(0)
        public javax.print.DocFlavor.SERVICE_FORMATTED sut;

        @Override
        public javax.print.DocFlavor.SERVICE_FORMATTED createNewSUT() {
            return this.sut;
        }

    }

}
