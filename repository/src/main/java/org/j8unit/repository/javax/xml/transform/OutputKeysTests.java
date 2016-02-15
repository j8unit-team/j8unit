package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.OutputKeys class javax.xml.transform.OutputKeys}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link OutputKeysClassTests}.
 * </p>
 *
 * @see javax.xml.transform.OutputKeys class javax.xml.transform.OutputKeys (the hereby targeted class-under-test class)
 * @see OutputKeysClassTests OutputKeysClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OutputKeysTests<SUT extends javax.xml.transform.OutputKeys>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
