package org.j8unit.repository.javax.print;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.print.MultiDocPrintService interface javax.print.MultiDocPrintService},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.MultiDocPrintServiceClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MultiDocPrintServiceTests<SUT extends javax.print.MultiDocPrintService>
extends org.j8unit.repository.javax.print.PrintServiceTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.print.MultiDocPrintService#createMultiDocPrintJob() public abstract javax.print.MultiDocPrintJob javax.print.MultiDocPrintService.createMultiDocPrintJob()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createMultiDocPrintJob() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
