package org.j8unit.repository.org.omg.IOP;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.IOP.CodecFactoryOperations interface org.omg.IOP.CodecFactoryOperations},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.IOP.CodecFactoryOperationsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface CodecFactoryOperationsTests<SUT extends org.omg.IOP.CodecFactoryOperations>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecFactoryOperations#create_codec(org.omg.IOP.Encoding) public abstract org.omg.IOP.Codec org.omg.IOP.CodecFactoryOperations.create_codec(org.omg.IOP.Encoding) throws org.omg.IOP.CodecFactoryPackage.UnknownEncoding}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_codec_Encoding() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
