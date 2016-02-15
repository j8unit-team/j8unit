package org.j8unit.repository.javax.xml.soap;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.soap.SAAJMetaFactory class javax.xml.soap.SAAJMetaFactory}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SAAJMetaFactoryClassTests}.
 * </p>
 *
 * @see javax.xml.soap.SAAJMetaFactory class javax.xml.soap.SAAJMetaFactory (the hereby targeted class-under-test class)
 * @see SAAJMetaFactoryClassTests SAAJMetaFactoryClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SAAJMetaFactoryTests<SUT extends javax.xml.soap.SAAJMetaFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
