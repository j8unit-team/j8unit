package org.j8unit.repository.java.lang;

import java.lang.ProcessBuilder.Redirect;
import java.lang.ProcessBuilder.Redirect.Type;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProcessBuilder} (by simply reusing the
 * J8Unit test interface {@link ProcessBuilderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProcessBuilderClassTest
implements ProcessBuilderClassTests<ProcessBuilder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ProcessBuilder]

    @Override
    public Class<ProcessBuilder> createNewSUT() {
        return ProcessBuilder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ProcessBuilder#ProcessBuilder(java.util.List)
     * public java.lang.ProcessBuilder(java.util.List<java.lang.String>)}.
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
    public void create_ProcessBuilder_List()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProcessBuilder sut = null; // = new ProcessBuilder(java.util.List);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link ProcessBuilder#ProcessBuilder(String...) public
     * java.lang.ProcessBuilder(java.lang.String...)}.
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
    public void create_ProcessBuilder_StringArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProcessBuilder sut = null; // = new ProcessBuilder(String...);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ProcessBuilder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ProcessBuilder]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Redirect} (by simply reusing the
     * J8Unit test interface {@link RedirectClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class RedirectClassTest
    implements RedirectClassTests<Redirect> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ProcessBuilder$Redirect]

        @Override
        public Class<Redirect> createNewSUT() {
            return Redirect.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link ProcessBuilder.Redirect#appendTo(java.io.File)
         * public static java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.appendTo(java.io.File)}.
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
        public void test_appendTo_File()
        throws Exception {
            // write some test for {@link ProcessBuilder.Redirect#appendTo(java.io.File)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link ProcessBuilder.Redirect#from(java.io.File)
         * public static java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.from(java.io.File)}.
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
        public void test_from_File()
        throws Exception {
            // write some test for {@link ProcessBuilder.Redirect#from(java.io.File)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link ProcessBuilder.Redirect#to(java.io.File) public
         * static java.lang.ProcessBuilder$Redirect java.lang.ProcessBuilder$Redirect.to(java.io.File)}.
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
        public void test_to_File()
        throws Exception {
            // write some test for {@link ProcessBuilder.Redirect#to(java.io.File)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ProcessBuilder$Redirect]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ProcessBuilder$Redirect]

        /**
         * Specific JUnit test class to proof the type relevant aspects of type {@link Type} (by simply reusing the
         * J8Unit test interface
         * {@link org.j8unit.repository.java.lang.ProcessBuilderClassTests.RedirectClassTests.TypeClassTests}).
         */

        @RunWith(J8Unit4.class)
        public static class TypeClassTest
        implements org.j8unit.repository.java.lang.ProcessBuilderClassTests.RedirectClassTests.TypeClassTests<Type> {

            // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.ProcessBuilder$Redirect$Type]

            @Override
            public Class<Type> createNewSUT() {
                return Type.class;
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test {@link ProcessBuilder.Redirect.Type#valueOf(String)
             * public static java.lang.ProcessBuilder$Redirect$Type
             * java.lang.ProcessBuilder$Redirect$Type.valueOf(java.lang.String)}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public void test_valueOf_String()
            throws Exception {
                // write some test for {@link ProcessBuilder.Redirect.Type#valueOf(String)}
            }

            /**
             * <p>
             * Test method for the hereby targeted method-under-test {@link ProcessBuilder.Redirect.Type#values() public
             * static java.lang.ProcessBuilder$Redirect$Type[] java.lang.ProcessBuilder$Redirect$Type.values()}.
             *
             * Up to now, there is no real implementation of this test method. But with your help at
             * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by
             * meaningful test methods soon.
             * </p>
             *
             * @since 0.9.0
             */
            @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
            @Test
            @Category(Draft.class)
            public void test_values()
            throws Exception {
                // write some test for {@link ProcessBuilder.Redirect.Type#values()}
            }

            // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.ProcessBuilder$Redirect$Type]

            // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.ProcessBuilder$Redirect$Type]

        }

    }

}
