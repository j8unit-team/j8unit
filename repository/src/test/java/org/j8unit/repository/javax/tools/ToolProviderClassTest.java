package org.j8unit.repository.javax.tools;

import javax.tools.ToolProvider;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ToolProvider} (by simply reusing the
 * J8Unit test interface {@link ToolProviderClassTests}).
 */

@RunWith(J8Unit4.class)
public class ToolProviderClassTest
implements ToolProviderClassTests<ToolProvider> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.ToolProvider]

    @Override
    public Class<ToolProvider> createNewSUT() {
        return ToolProvider.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.tools.ToolProvider#getSystemToolClassLoader()
     * public static java.lang.ClassLoader javax.tools.ToolProvider.getSystemToolClassLoader()}.
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
    public void test_getSystemToolClassLoader()
    throws Exception {
        // write some test for {@link javax.tools.ToolProvider#getSystemToolClassLoader()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.tools.ToolProvider#getSystemDocumentationTool() public static javax.tools.DocumentationTool
     * javax.tools.ToolProvider.getSystemDocumentationTool()}.
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
    public void test_getSystemDocumentationTool()
    throws Exception {
        // write some test for {@link javax.tools.ToolProvider#getSystemDocumentationTool()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.tools.ToolProvider#getSystemJavaCompiler()
     * public static javax.tools.JavaCompiler javax.tools.ToolProvider.getSystemJavaCompiler()}.
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
    public void test_getSystemJavaCompiler()
    throws Exception {
        // write some test for {@link javax.tools.ToolProvider#getSystemJavaCompiler()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.ToolProvider]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.ToolProvider]

}
