package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.NodeSetData interface javax.xml.crypto.NodeSetData}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link NodeSetDataClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.NodeSetData interface javax.xml.crypto.NodeSetData (the hereby targeted class-under-test class)
 * @see NodeSetDataClassTests NodeSetDataClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NodeSetDataTests<SUT extends javax.xml.crypto.NodeSetData>
extends DataTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.NodeSetData#iterator() public abstract java.util.Iterator
     * javax.xml.crypto.NodeSetData.iterator()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.NodeSetData#iterator() public abstract java.util.Iterator
     * javax.xml.crypto.NodeSetData.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.NodeSetData#iterator() public abstract java.util.Iterator
     *      javax.xml.crypto.NodeSetData.iterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
