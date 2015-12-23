package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.PropertyEditorManager class
 * java.beans.PropertyEditorManager}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
 * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.PropertyEditorManagerTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.PropertyEditorManagerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.PropertyEditorManager
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PropertyEditorManagerTests<SUT extends java.beans.PropertyEditorManager>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
