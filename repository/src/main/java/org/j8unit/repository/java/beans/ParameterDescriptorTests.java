package org.j8unit.repository.java.beans;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.beans.ParameterDescriptor class java.beans.ParameterDescriptor},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.beans.ParameterDescriptorTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.beans.ParameterDescriptorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.beans.ParameterDescriptor
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ParameterDescriptorTests<SUT extends java.beans.ParameterDescriptor>
extends org.j8unit.repository.java.beans.FeatureDescriptorTests<SUT> {

}
