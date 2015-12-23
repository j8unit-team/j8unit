package org.j8unit.repository.javax.tools;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.tools.Tool interface javax.tools.Tool}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test
 * interface containing the class relevant test methods is {@link org.j8unit.repository.javax.tools.ToolTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.tools.ToolClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.tools.Tool
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToolTests<SUT extends javax.tools.Tool>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.Tool#getSourceVersions() public abstract java.util.Set
     * javax.tools.Tool.getSourceVersions()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.Tool#getSourceVersions()
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

    /**
     * <p>
     * Test method for
     * {@link javax.tools.Tool#run(java.io.InputStream, java.io.OutputStream, java.io.OutputStream, java.lang.String...)
     * public abstract int
     * javax.tools.Tool.run(java.io.InputStream,java.io.OutputStream,java.io.OutputStream,java.lang.String...)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.Tool#run(java.io.InputStream, java.io.OutputStream, java.io.OutputStream,
     *             java.lang.String...)
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

}
