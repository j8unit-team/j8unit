package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.DataLine;
import javax.sound.sampled.DataLine.Info;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DataLine} (by simply reusing the J8Unit
 * test interface {@link DataLineClassTests}).
 */

@RunWith(J8Unit4.class)
public class DataLineClassTest
implements DataLineClassTests<DataLine> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.DataLine]

    @Override
    public Class<DataLine> createNewSUT() {
        return DataLine.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.DataLine]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.DataLine]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Info} (by simply reusing the J8Unit
     * test interface {@link InfoClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.DataLine$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.sound.sampled.DataLine.Info#Info(Class, javax.sound.sampled.AudioFormat[], int, int) public
         * javax.sound.sampled.DataLine$Info(java.lang.Class<?>,javax.sound.sampled.AudioFormat[],int,int)}.
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
        public void create_Info_Class_AudioFormatArray_int_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Info sut = null; // = new Info(Class, javax.sound.sampled.AudioFormat[], int, int);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.sound.sampled.DataLine.Info#Info(Class, javax.sound.sampled.AudioFormat) public
         * javax.sound.sampled.DataLine$Info(java.lang.Class<?>,javax.sound.sampled.AudioFormat)}.
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
        public void create_Info_Class_AudioFormat()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Info sut = null; // = new Info(Class, javax.sound.sampled.AudioFormat);
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.sound.sampled.DataLine.Info#Info(Class, javax.sound.sampled.AudioFormat, int) public
         * javax.sound.sampled.DataLine$Info(java.lang.Class<?>,javax.sound.sampled.AudioFormat,int)}.
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
        public void create_Info_Class_AudioFormat_int()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Info sut = null; // = new Info(Class, javax.sound.sampled.AudioFormat, int);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.DataLine$Info]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.DataLine$Info]

    }

}
