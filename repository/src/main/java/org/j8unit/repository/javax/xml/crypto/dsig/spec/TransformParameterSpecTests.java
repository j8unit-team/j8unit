package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.spec.TransformParameterSpec interface
 * javax.xml.crypto.dsig.spec.TransformParameterSpec}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link TransformParameterSpecClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.spec.TransformParameterSpec interface javax.xml.crypto.dsig.spec.TransformParameterSpec
 *      (the hereby targeted class-under-test class)
 * @see TransformParameterSpecClassTests TransformParameterSpecClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TransformParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.TransformParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT> {

}
