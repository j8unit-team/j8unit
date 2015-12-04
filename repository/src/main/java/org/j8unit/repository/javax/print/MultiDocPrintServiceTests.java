package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.MultiDocPrintService interface javax.print.MultiDocPrintService}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.MultiDocPrintServiceClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MultiDocPrintServiceTests<SUT extends javax.print.MultiDocPrintService>
extends org.j8unit.repository.javax.print.PrintServiceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.MultiDocPrintService#createMultiDocPrintJob() public abstract
     * javax.print.MultiDocPrintJob javax.print.MultiDocPrintService.createMultiDocPrintJob()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMultiDocPrintJob()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
