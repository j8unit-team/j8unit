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
 * non-{@code static} methods) of {@linkplain javax.tools.OptionChecker interface javax.tools.OptionChecker}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link OptionCheckerClassTests}.
 * </p>
 *
 * @see javax.tools.OptionChecker interface javax.tools.OptionChecker (the hereby targeted class-under-test class)
 * @see OptionCheckerClassTests OptionCheckerClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OptionCheckerTests<SUT extends javax.tools.OptionChecker>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.OptionChecker#isSupportedOption(String) public abstract int
     * javax.tools.OptionChecker.isSupportedOption(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.tools.OptionChecker#isSupportedOption(String) public abstract int
     * javax.tools.OptionChecker.isSupportedOption(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.OptionChecker#isSupportedOption(String) public abstract int
     *      javax.tools.OptionChecker.isSupportedOption(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSupportedOption_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
