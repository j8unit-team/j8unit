package org.j8unit.repository.javax.tools;

import javax.tools.Diagnostic;
import javax.tools.Diagnostic.Kind;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DiagnosticClassTest
implements org.j8unit.repository.javax.tools.DiagnosticClassTests<Diagnostic> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.Diagnostic]

    @Override
    public Class<Diagnostic> createNewSUT() {
        return Diagnostic.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.Diagnostic]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.Diagnostic]

    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements org.j8unit.repository.javax.tools.DiagnosticClassTests.KindClassTests<Kind> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.Diagnostic$Kind]

        @Override
        public Class<Kind> createNewSUT() {
            return Kind.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.tools.Diagnostic.Kind#valueOf(String)
         * public static javax.tools.Diagnostic$Kind javax.tools.Diagnostic$Kind.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.tools.Diagnostic.Kind#valueOf(String)}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.tools.Diagnostic.Kind#values() public
         * static javax.tools.Diagnostic$Kind[] javax.tools.Diagnostic$Kind.values()}.
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
            // write some test for {@link javax.tools.Diagnostic.Kind#values()}
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.Diagnostic$Kind]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.Diagnostic$Kind]

    }

}
