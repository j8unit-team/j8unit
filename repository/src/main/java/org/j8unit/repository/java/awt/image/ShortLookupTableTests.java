package org.j8unit.repository.java.awt.image;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.awt.image.ShortLookupTable class java.awt.image.ShortLookupTable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.image.ShortLookupTableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ShortLookupTableTests<SUT extends java.awt.image.ShortLookupTable>
extends org.j8unit.repository.java.awt.image.LookupTableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(int[],int[]) public int[] java.awt.image.ShortLookupTable.lookupPixel(int[],int[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_lookupPixel_intArray_intArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#lookupPixel(short[],short[]) public short[] java.awt.image.ShortLookupTable.lookupPixel(short[],short[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_lookupPixel_shortArray_shortArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.image.ShortLookupTable#getTable() public final short[][] java.awt.image.ShortLookupTable.getTable()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTable() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
