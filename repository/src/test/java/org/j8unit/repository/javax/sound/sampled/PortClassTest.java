package org.j8unit.repository.javax.sound.sampled;

import javax.sound.sampled.Port;
import javax.sound.sampled.Port.Info;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortClassTest
implements org.j8unit.repository.javax.sound.sampled.PortClassTests<Port> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Port]

    @Override
    public Class<Port> createNewSUT() {
        return Port.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Port]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Port]

    @RunWith(J8Unit4.class)
    public static class InfoClassTest
    implements org.j8unit.repository.javax.sound.sampled.PortClassTests.InfoClassTests<Info> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sound.sampled.Port$Info]

        @Override
        public Class<Info> createNewSUT() {
            return Info.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted constructor-under-test
         * {@link javax.sound.sampled.Port.Info#Info(Class, String, boolean) public
         * javax.sound.sampled.Port$Info(java.lang.Class<?>,java.lang.String,boolean)}.
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
        public void create_Info_Class_String_boolean()
        throws Exception {
            // create new instance
            @SuppressWarnings("unused")
            final Info sut = null; // = new Info(Class, String, boolean);
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sound.sampled.Port$Info]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.sound.sampled.Port$Info]

    }

}
