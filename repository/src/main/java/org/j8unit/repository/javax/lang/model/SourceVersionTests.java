package org.j8unit.repository.javax.lang.model;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.lang.model.SourceVersion class javax.lang.model.SourceVersion}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SourceVersionClassTests}.
 * </p>
 *
 * @see javax.lang.model.SourceVersion class javax.lang.model.SourceVersion (the hereby targeted class-under-test class)
 * @see SourceVersionClassTests SourceVersionClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SourceVersionTests<SUT extends javax.lang.model.SourceVersion>
extends org.j8unit.repository.java.lang.EnumTests<SUT, javax.lang.model.SourceVersion> {

}
