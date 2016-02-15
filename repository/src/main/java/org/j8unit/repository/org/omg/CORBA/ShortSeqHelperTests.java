package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain org.omg.CORBA.ShortSeqHelper class org.omg.CORBA.ShortSeqHelper}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ShortSeqHelperClassTests}.
 * </p>
 *
 * @see org.omg.CORBA.ShortSeqHelper class org.omg.CORBA.ShortSeqHelper (the hereby targeted class-under-test class)
 * @see ShortSeqHelperClassTests ShortSeqHelperClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ShortSeqHelperTests<SUT extends org.omg.CORBA.ShortSeqHelper>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
