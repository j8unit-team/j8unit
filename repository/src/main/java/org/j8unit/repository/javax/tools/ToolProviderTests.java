package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.ToolProvider class javax.tools.ToolProvider}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ToolProviderClassTests}.
 * </p>
 *
 * @see javax.tools.ToolProvider class javax.tools.ToolProvider (the hereby targeted class-under-test class)
 * @see ToolProviderClassTests ToolProviderClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ToolProviderTests<SUT extends javax.tools.ToolProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
