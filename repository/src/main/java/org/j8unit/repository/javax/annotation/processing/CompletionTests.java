package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.annotation.processing.Completion interface
 * javax.annotation.processing.Completion}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link CompletionClassTests}.
 * </p>
 *
 * @see javax.annotation.processing.Completion interface javax.annotation.processing.Completion (the hereby targeted
 *      class-under-test class)
 * @see CompletionClassTests CompletionClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompletionTests<SUT extends javax.annotation.processing.Completion>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.Completion#getValue() public abstract java.lang.String
     * javax.annotation.processing.Completion.getValue()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.Completion#getValue() public abstract java.lang.String
     * javax.annotation.processing.Completion.getValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Completion#getValue() public abstract java.lang.String
     *      javax.annotation.processing.Completion.getValue() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.annotation.processing.Completion#getMessage() public abstract java.lang.String
     * javax.annotation.processing.Completion.getMessage()}.
     *
     * <p>
     * Test method for {@link javax.annotation.processing.Completion#getMessage() public abstract java.lang.String
     * javax.annotation.processing.Completion.getMessage()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.annotation.processing.Completion#getMessage() public abstract java.lang.String
     *      javax.annotation.processing.Completion.getMessage() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMessage()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
