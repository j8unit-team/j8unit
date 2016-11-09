package org.j8unit.repository.javax.tools;

import javax.tools.JavaFileObject;
import javax.tools.JavaFileObject.Kind;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JavaFileObject} (by simply reusing the
 * J8Unit test interface {@link JavaFileObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class JavaFileObjectClassTest
implements JavaFileObjectClassTests<JavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileObject]

    @Override
    public Class<JavaFileObject> createNewSUT() {
        return JavaFileObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaFileObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileObject]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Kind} (by simply reusing the J8Unit
     * test interface {@link KindClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements KindClassTests<Kind> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaFileObject$Kind]

        @Override
        public Class<Kind> createNewSUT() {
            return Kind.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.tools.JavaFileObject.Kind#values() public
         * static javax.tools.JavaFileObject$Kind[] javax.tools.JavaFileObject$Kind.values()}.
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
            // write some test for {@link javax.tools.JavaFileObject.Kind#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.tools.JavaFileObject.Kind#valueOf(String)
         * public static javax.tools.JavaFileObject$Kind javax.tools.JavaFileObject$Kind.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.tools.JavaFileObject.Kind#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaFileObject$Kind]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaFileObject$Kind]

    }

}
