package org.j8unit.repository.javax.jws;

import javax.jws.WebParam;
import javax.jws.WebParam.Mode;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link WebParam} (by simply reusing the J8Unit
 * test interface {@link WebParamClassTests}).
 */

@RunWith(J8Unit4.class)
public class WebParamClassTest
implements WebParamClassTests<WebParam> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebParam]

    @Override
    public Class<WebParam> createNewSUT() {
        return WebParam.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebParam]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebParam]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Mode} (by simply reusing the J8Unit
     * test interface {@link org.j8unit.repository.javax.jws.WebParamClassTests.ModeClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class ModeClassTest
    implements org.j8unit.repository.javax.jws.WebParamClassTests.ModeClassTests<Mode> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.jws.WebParam$Mode]

        @Override
        public Class<Mode> createNewSUT() {
            return Mode.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.jws.WebParam.Mode#values() public static
         * javax.jws.WebParam$Mode[] javax.jws.WebParam$Mode.values()}.
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
        public void test_values()
        throws Exception {
            // write some test for {@link javax.jws.WebParam.Mode#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.jws.WebParam.Mode#valueOf(String) public
         * static javax.jws.WebParam$Mode javax.jws.WebParam$Mode.valueOf(java.lang.String)}.
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
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link javax.jws.WebParam.Mode#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.jws.WebParam$Mode]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.jws.WebParam$Mode]

    }

}
