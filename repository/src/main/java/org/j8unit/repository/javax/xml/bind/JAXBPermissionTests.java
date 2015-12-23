package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.bind.JAXBPermission class javax.xml.bind.JAXBPermission},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.bind.JAXBPermissionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.bind.JAXBPermissionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.bind.JAXBPermission
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface JAXBPermissionTests<SUT extends javax.xml.bind.JAXBPermission>
extends org.j8unit.repository.java.security.BasicPermissionTests<SUT> {

}
