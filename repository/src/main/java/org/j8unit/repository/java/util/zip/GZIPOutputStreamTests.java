package org.j8unit.repository.java.util.zip;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.util.zip.GZIPOutputStream class java.util.zip.GZIPOutputStream},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.util.zip.GZIPOutputStreamClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface GZIPOutputStreamTests<SUT extends java.util.zip.GZIPOutputStream>
extends org.j8unit.repository.java.util.zip.DeflaterOutputStreamTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.util.zip.GZIPOutputStream#finish() public void java.util.zip.GZIPOutputStream.finish() throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_finish() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.zip.GZIPOutputStream#write(byte[],int,int) public synchronized void java.util.zip.GZIPOutputStream.write(byte[],int,int) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_write_byteArray_int_int() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
