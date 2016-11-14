package org.j8unit.repository.java.security.cert;

import java.security.cert.PKIXRevocationChecker;
import java.security.cert.PKIXRevocationChecker.Option;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKIXRevocationChecker} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKIXRevocationCheckerClassTest
implements PKIXRevocationCheckerClassTests<PKIXRevocationChecker> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXRevocationChecker]

    @Override
    public Class<PKIXRevocationChecker> createNewSUT() {
        return PKIXRevocationChecker.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PKIXRevocationChecker]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXRevocationChecker]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link Option} (by simply reusing the J8Unit
     * test interface
     * {@link org.j8unit.repository.java.security.cert.PKIXRevocationCheckerClassTests.OptionClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class OptionClassTest
    implements OptionClassTests<Option> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.cert.PKIXRevocationChecker$Option]

        @Override
        public Class<Option> createNewSUT() {
            return Option.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.security.cert.PKIXRevocationChecker.Option#values() public static
         * java.security.cert.PKIXRevocationChecker$Option[] java.security.cert.PKIXRevocationChecker$Option.values()}.
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
            // write some test for {@link java.security.cert.PKIXRevocationChecker.Option#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link java.security.cert.PKIXRevocationChecker.Option#valueOf(String) public static
         * java.security.cert.PKIXRevocationChecker$Option
         * java.security.cert.PKIXRevocationChecker$Option.valueOf(java.lang.String)}.
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
            // write some test for {@link java.security.cert.PKIXRevocationChecker.Option#valueOf(String)}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.cert.PKIXRevocationChecker$Option]

        // J8UNIT-MARKER-[END]-[CLASS]-[java.security.cert.PKIXRevocationChecker$Option]

    }

}
