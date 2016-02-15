package org.j8unit.repository.javax.tools;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.Tool interface javax.tools.Tool}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link ToolClassTests}.
 * </p>
 *
 * @see javax.tools.Tool interface javax.tools.Tool (the hereby targeted class-under-test class)
 * @see ToolClassTests ToolClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToolTests<SUT extends javax.tools.Tool>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.tools.Tool#run(java.io.InputStream, java.io.OutputStream, java.io.OutputStream, String...) public
     * abstract int
     * javax.tools.Tool.run(java.io.InputStream,java.io.OutputStream,java.io.OutputStream,java.lang.String...)}.
     *
     * <p>
     * Test method for
     * {@link javax.tools.Tool#run(java.io.InputStream, java.io.OutputStream, java.io.OutputStream, String...) public
     * abstract int
     * javax.tools.Tool.run(java.io.InputStream,java.io.OutputStream,java.io.OutputStream,java.lang.String...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.Tool#run(java.io.InputStream, java.io.OutputStream, java.io.OutputStream, String...) public
     *      abstract int
     *      javax.tools.Tool.run(java.io.InputStream,java.io.OutputStream,java.io.OutputStream,java.lang.String[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_run_InputStream_OutputStream_OutputStream_StringArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.Tool#getSourceVersions() public abstract java.util.Set
     * <javax.lang.model.SourceVersion> javax.tools.Tool.getSourceVersions()}.
     *
     * <p>
     * Test method for {@link javax.tools.Tool#getSourceVersions() public abstract java.util.Set
     * javax.tools.Tool.getSourceVersions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.Tool#getSourceVersions() public abstract java.util.Set javax.tools.Tool.getSourceVersions() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSourceVersions()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
