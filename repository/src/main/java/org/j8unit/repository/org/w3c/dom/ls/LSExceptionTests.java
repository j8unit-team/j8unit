package org.j8unit.repository.org.w3c.dom.ls;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.w3c.dom.ls.LSException class org.w3c.dom.ls.LSException}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LSExceptionClassTests}.
 * </p>
 *
 * @see org.w3c.dom.ls.LSException class org.w3c.dom.ls.LSException (the hereby targeted class-under-test class)
 * @see LSExceptionClassTests LSExceptionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LSExceptionTests<SUT extends org.w3c.dom.ls.LSException>
extends org.j8unit.repository.java.lang.RuntimeExceptionTests<SUT> {

}
