package org.j8unit.repository.javax.accessibility;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.accessibility.AccessibleStreamable interface javax.accessibility.AccessibleStreamable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.accessibility.AccessibleStreamableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface AccessibleStreamableTests<SUT extends javax.accessibility.AccessibleStreamable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleStreamable#getMimeTypes() public abstract java.awt.datatransfer.DataFlavor[] javax.accessibility.AccessibleStreamable.getMimeTypes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMimeTypes() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.accessibility.AccessibleStreamable#getStream(java.awt.datatransfer.DataFlavor) public abstract java.io.InputStream javax.accessibility.AccessibleStreamable.getStream(java.awt.datatransfer.DataFlavor)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getStream_DataFlavor() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
