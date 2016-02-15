package org.j8unit.repository.javax.naming.ldap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.naming.ldap.SortControl class javax.naming.ldap.SortControl}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SortControlClassTests}.
 * </p>
 *
 * @see javax.naming.ldap.SortControl class javax.naming.ldap.SortControl (the hereby targeted class-under-test class)
 * @see SortControlClassTests SortControlClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SortControlTests<SUT extends javax.naming.ldap.SortControl>
extends BasicControlTests<SUT> {

}
