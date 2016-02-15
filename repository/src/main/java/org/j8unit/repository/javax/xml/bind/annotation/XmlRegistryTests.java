package org.j8unit.repository.javax.xml.bind.annotation;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.annotation.XmlRegistry interface
 * javax.xml.bind.annotation.XmlRegistry}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link XmlRegistryClassTests}.
 * </p>
 *
 * @see javax.xml.bind.annotation.XmlRegistry interface javax.xml.bind.annotation.XmlRegistry (the hereby targeted
 *      class-under-test class)
 * @see XmlRegistryClassTests XmlRegistryClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XmlRegistryTests<SUT extends javax.xml.bind.annotation.XmlRegistry>
extends org.j8unit.repository.java.lang.annotation.AnnotationTests<SUT> {

}
