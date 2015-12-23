package org.j8unit.repository.java.util;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.InvalidPropertiesFormatException class
 * java.util.InvalidPropertiesFormatException}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test
 * methods is {@link org.j8unit.repository.java.util.InvalidPropertiesFormatExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.InvalidPropertiesFormatExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.InvalidPropertiesFormatException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidPropertiesFormatExceptionTests<SUT extends java.util.InvalidPropertiesFormatException>
extends org.j8unit.repository.java.io.IOExceptionTests<SUT> {

}
