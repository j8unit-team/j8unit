package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.JobMediaSheets;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.print.attribute.IntegerSyntaxTests;
import org.j8unit.repository.javax.print.attribute.PrintJobAttributeTests;
import org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link JobMediaSheets
 * public class javax.print.attribute.standard.JobMediaSheets}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.print.attribute.standard.JobMediaSheetsClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JobMediaSheetsTests<SUT extends JobMediaSheets>
extends PrintRequestAttributeTests<SUT>, PrintJobAttributeTests<SUT>, IntegerSyntaxTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.print.attribute.standard.JobMediaSheets]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.print.attribute.standard.JobMediaSheets#getCategory() public final java.lang.Class<? extends
     * javax.print.attribute.Attribute> javax.print.attribute.standard.JobMediaSheets.getCategory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.print.attribute.standard.JobMediaSheets#equals(Object) public boolean
     * javax.print.attribute.standard.JobMediaSheets.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.print.attribute.standard.JobMediaSheets#getName() public final java.lang.String
     * javax.print.attribute.standard.JobMediaSheets.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.print.attribute.standard.JobMediaSheets]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.print.attribute.standard.JobMediaSheets]

}
