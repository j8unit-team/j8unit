package org.j8unit.repository.org.omg.IOP;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.IOP.CodecFactoryOperations interface
 * org.omg.IOP.CodecFactoryOperations}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link CodecFactoryOperationsClassTests}.
 * </p>
 *
 * @see org.omg.IOP.CodecFactoryOperations interface org.omg.IOP.CodecFactoryOperations (the hereby targeted
 *      class-under-test class)
 * @see CodecFactoryOperationsClassTests CodecFactoryOperationsClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CodecFactoryOperationsTests<SUT extends org.omg.IOP.CodecFactoryOperations>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link org.omg.IOP.CodecFactoryOperations#create_codec(org.omg.IOP.Encoding) public abstract
     * org.omg.IOP.Codec org.omg.IOP.CodecFactoryOperations.create_codec(org.omg.IOP.Encoding) throws
     * org.omg.IOP.CodecFactoryPackage.UnknownEncoding}.
     *
     * <p>
     * Test method for {@link org.omg.IOP.CodecFactoryOperations#create_codec(org.omg.IOP.Encoding) public abstract
     * org.omg.IOP.Codec org.omg.IOP.CodecFactoryOperations.create_codec(org.omg.IOP.Encoding) throws
     * org.omg.IOP.CodecFactoryPackage.UnknownEncoding}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see org.omg.IOP.CodecFactoryOperations#create_codec(org.omg.IOP.Encoding) public abstract org.omg.IOP.Codec
     *      org.omg.IOP.CodecFactoryOperations.create_codec(org.omg.IOP.Encoding) throws
     *      org.omg.IOP.CodecFactoryPackage.UnknownEncoding (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_create_codec_Encoding()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
