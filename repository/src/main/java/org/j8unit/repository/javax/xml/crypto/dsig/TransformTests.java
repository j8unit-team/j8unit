package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.Transform;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests;
import org.j8unit.repository.javax.xml.crypto.XMLStructureTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Transform
 * public abstract interface javax.xml.crypto.dsig.Transform}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.TransformClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformTests<SUT extends Transform>
extends XMLStructureTests<SUT>, AlgorithmMethodTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.crypto.dsig.Transform#getParameterSpec()
     * public abstract java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.Transform.getParameterSpec()}.
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
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext, java.io.OutputStream)
     * public abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext,java.io.OutputStream)
     * throws javax.xml.crypto.dsig.TransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.crypto.dsig.Transform#transform(javax.xml.crypto.Data, javax.xml.crypto.XMLCryptoContext) public
     * abstract javax.xml.crypto.Data
     * javax.xml.crypto.dsig.Transform.transform(javax.xml.crypto.Data,javax.xml.crypto.XMLCryptoContext) throws
     * javax.xml.crypto.dsig.TransformException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_transform_Data_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.dsig.Transform]

}
