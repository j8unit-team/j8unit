package org.j8unit.repository.org.w3c.dom;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.DocumentFragment interface org.w3c.dom.DocumentFragment}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DocumentFragmentClassTests}.
 * </p>
 *
 * @see org.w3c.dom.DocumentFragment interface org.w3c.dom.DocumentFragment (the hereby targeted class-under-test class)
 * @see DocumentFragmentClassTests DocumentFragmentClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocumentFragmentTests<SUT extends org.w3c.dom.DocumentFragment>
extends NodeTests<SUT> {

}
