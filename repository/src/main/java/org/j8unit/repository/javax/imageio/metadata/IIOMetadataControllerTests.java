package org.j8unit.repository.javax.imageio.metadata;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.imageio.metadata.IIOMetadataController interface
 * javax.imageio.metadata.IIOMetadataController}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.javax.imageio.metadata.IIOMetadataControllerTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.imageio.metadata.IIOMetadataControllerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.imageio.metadata.IIOMetadataController
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface IIOMetadataControllerTests<SUT extends javax.imageio.metadata.IIOMetadataController>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.imageio.metadata.IIOMetadataController#activate(javax.imageio.metadata.IIOMetadata)
     * public abstract boolean
     * javax.imageio.metadata.IIOMetadataController.activate(javax.imageio.metadata.IIOMetadata)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.imageio.metadata.IIOMetadataController#activate(javax.imageio.metadata.IIOMetadata)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_activate_IIOMetadata()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}
