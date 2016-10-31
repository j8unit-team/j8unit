package org.j8unit.repository.java.text;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NormalizerClassTest
implements org.j8unit.repository.java.text.NormalizerClassTests<Normalizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Normalizer]

    @Override
    public Class<Normalizer> createNewSUT() {
        return Normalizer.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.Normalizer#isNormalized(CharSequence, java.text.Normalizer.Form) public static boolean
     * java.text.Normalizer.isNormalized(java.lang.CharSequence,java.text.Normalizer$Form)}.
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
    public void test_isNormalized_CharSequence_Form()
    throws Exception {
        // write some test for {@link java.text.Normalizer#isNormalized(CharSequence, java.text.Normalizer.Form)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link java.text.Normalizer#normalize(CharSequence, java.text.Normalizer.Form) public static java.lang.String
     * java.text.Normalizer.normalize(java.lang.CharSequence,java.text.Normalizer$Form)}.
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
    public void test_normalize_CharSequence_Form()
    throws Exception {
        // write some test for {@link java.text.Normalizer#normalize(CharSequence, java.text.Normalizer.Form)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Normalizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Normalizer]

    @RunWith(J8Unit4.class)
    public static class FormClassTest
    implements org.j8unit.repository.java.text.NormalizerClassTests.FormClassTests<Form> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Normalizer$Form]

        @Override
        public Class<Form> createNewSUT() {
            return Form.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.text.Normalizer.Form#values() public static
         * java.text.Normalizer$Form[] java.text.Normalizer$Form.values()}.
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
            // write some test for {@link java.text.Normalizer.Form#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link java.text.Normalizer.Form#valueOf(String) public
         * static java.text.Normalizer$Form java.text.Normalizer$Form.valueOf(java.lang.String)}.
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
            // write some test for {@link java.text.Normalizer.Form#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Normalizer$Form]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Normalizer$Form]

    }

}
