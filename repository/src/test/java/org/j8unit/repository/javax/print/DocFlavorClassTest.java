package org.j8unit.repository.javax.print;

import javax.print.DocFlavor;
import javax.print.DocFlavor.BYTE_ARRAY;
import javax.print.DocFlavor.CHAR_ARRAY;
import javax.print.DocFlavor.INPUT_STREAM;
import javax.print.DocFlavor.READER;
import javax.print.DocFlavor.SERVICE_FORMATTED;
import javax.print.DocFlavor.STRING;
import javax.print.DocFlavor.URL;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DocFlavor} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests}).
 */
@RunWith(J8Unit4.class)
public class DocFlavorClassTest
implements DocFlavorClassTests<DocFlavor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor]

    @Override
    public Class<DocFlavor> createNewSUT() {
        return DocFlavor.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.print.DocFlavor#DocFlavor(String, String)
     * public javax.print.DocFlavor(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_DocFlavor_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DocFlavor sut = null; // = new DocFlavor(String, String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link SERVICE_FORMATTED} (by simply reusing
     * the J8Unit test interface
     * {@link org.j8unit.repository.javax.print.DocFlavorClassTests.SERVICE_FORMATTEDClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class SERVICE_FORMATTEDClassTest
    implements SERVICE_FORMATTEDClassTests<SERVICE_FORMATTED> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        @Override
        public Class<SERVICE_FORMATTED> createNewSUT() {
            return SERVICE_FORMATTED.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.print.DocFlavor.SERVICE_FORMATTED#SERVICE_FORMATTED(String) public
         * javax.print.DocFlavor$SERVICE_FORMATTED(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_SERVICE_FORMATTED_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final SERVICE_FORMATTED sut = null; // = new SERVICE_FORMATTED(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$SERVICE_FORMATTED]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$SERVICE_FORMATTED]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link URL} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.URLClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class URLClassTest
    implements URLClassTests<URL> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$URL]

        @Override
        public Class<URL> createNewSUT() {
            return URL.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link javax.print.DocFlavor.URL#URL(String)
         * public javax.print.DocFlavor$URL(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_URL_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final URL sut = null; // = new URL(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$URL]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$URL]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CHAR_ARRAY} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.CHAR_ARRAYClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CHAR_ARRAYClassTest
    implements CHAR_ARRAYClassTests<CHAR_ARRAY> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$CHAR_ARRAY]

        @Override
        public Class<CHAR_ARRAY> createNewSUT() {
            return CHAR_ARRAY.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.print.DocFlavor.CHAR_ARRAY#CHAR_ARRAY(String) public
         * javax.print.DocFlavor$CHAR_ARRAY(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_CHAR_ARRAY_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final CHAR_ARRAY sut = null; // = new CHAR_ARRAY(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$CHAR_ARRAY]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$CHAR_ARRAY]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link INPUT_STREAM} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.INPUT_STREAMClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class INPUT_STREAMClassTest
    implements INPUT_STREAMClassTests<INPUT_STREAM> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$INPUT_STREAM]

        @Override
        public Class<INPUT_STREAM> createNewSUT() {
            return INPUT_STREAM.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.print.DocFlavor.INPUT_STREAM#INPUT_STREAM(String) public
         * javax.print.DocFlavor$INPUT_STREAM(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_INPUT_STREAM_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final INPUT_STREAM sut = null; // = new INPUT_STREAM(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$INPUT_STREAM]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$INPUT_STREAM]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link STRING} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.STRINGClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class STRINGClassTest
    implements STRINGClassTests<STRING> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$STRING]

        @Override
        public Class<STRING> createNewSUT() {
            return STRING.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link javax.print.DocFlavor.STRING#STRING(String)
         * public javax.print.DocFlavor$STRING(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_STRING_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final STRING sut = null; // = new STRING(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$STRING]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$STRING]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link READER} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.READERClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class READERClassTest
    implements READERClassTests<READER> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$READER]

        @Override
        public Class<READER> createNewSUT() {
            return READER.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test {@link javax.print.DocFlavor.READER#READER(String)
         * public javax.print.DocFlavor$READER(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_READER_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final READER sut = null; // = new READER(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$READER]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$READER]

    }

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link BYTE_ARRAY} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.print.DocFlavorClassTests.BYTE_ARRAYClassTests}).
     */
    @RunWith(J8Unit4.class)
    public static class BYTE_ARRAYClassTest
    implements BYTE_ARRAYClassTests<BYTE_ARRAY> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.DocFlavor$BYTE_ARRAY]

        @Override
        public Class<BYTE_ARRAY> createNewSUT() {
            return BYTE_ARRAY.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.print.DocFlavor.BYTE_ARRAY#BYTE_ARRAY(String) public
         * javax.print.DocFlavor$BYTE_ARRAY(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void create_BYTE_ARRAY_String()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final BYTE_ARRAY sut = null; // = new BYTE_ARRAY(String);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.DocFlavor$BYTE_ARRAY]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.DocFlavor$BYTE_ARRAY]

    }

}
