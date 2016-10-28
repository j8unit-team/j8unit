package org.j8unit.repository.javax.tools;

import javax.tools.DocumentationTool;
import javax.tools.DocumentationTool.DocumentationTask;
import javax.tools.DocumentationTool.Location;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentationToolClassTest
implements org.j8unit.repository.javax.tools.DocumentationToolClassTests<DocumentationTool> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DocumentationTool]

    @Override
    public Class<DocumentationTool> createNewSUT() {
        return DocumentationTool.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DocumentationTool]

    @RunWith(J8Unit4.class)
    public static class LocationClassTest
    implements org.j8unit.repository.javax.tools.DocumentationToolClassTests.LocationClassTests<Location> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DocumentationTool$Location]

        @Override
        public Class<Location> createNewSUT() {
            return Location.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.tools.DocumentationTool.Location#values()
         * public static javax.tools.DocumentationTool$Location[] javax.tools.DocumentationTool$Location.values()}.
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
            // write some test for {@link javax.tools.DocumentationTool.Location#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test
         * {@link javax.tools.DocumentationTool.Location#valueOf(String) public static
         * javax.tools.DocumentationTool$Location javax.tools.DocumentationTool$Location.valueOf(java.lang.String)}.
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
            // write some test for {@link javax.tools.DocumentationTool.Location#valueOf(String)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DocumentationTool$Location]

    }

    @RunWith(J8Unit4.class)
    public static class DocumentationTaskClassTest
    implements org.j8unit.repository.javax.tools.DocumentationToolClassTests.DocumentationTaskClassTests<DocumentationTask> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.DocumentationTool$DocumentationTask]

        @Override
        public Class<DocumentationTask> createNewSUT() {
            return DocumentationTask.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.DocumentationTool$DocumentationTask]

    }

}
