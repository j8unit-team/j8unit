package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.tools.ToolProvider class javax.tools.ToolProvider}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.tools.ToolProviderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.tools.ToolProviderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.tools.ToolProvider
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToolProviderTests<SUT extends javax.tools.ToolProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
