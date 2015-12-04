package org.j8unit.repository.javax.lang.model.element;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.lang.model.element.NestingKind class javax.lang.model.element.NestingKind}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.lang.model.element.NestingKindClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface NestingKindTests<SUT extends javax.lang.model.element.NestingKind>
extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.lang.model.element.NestingKind> {

    /**
     * <p>
     * Test method for {@link javax.lang.model.element.NestingKind#isNested() public boolean
     * javax.lang.model.element.NestingKind.isNested()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isNested()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
