package org.j8unit.repository.javax.swing.plaf;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.plaf.TableHeaderUI class javax.swing.plaf.TableHeaderUI}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link TableHeaderUIClassTests}.
 * </p>
 *
 * @see javax.swing.plaf.TableHeaderUI class javax.swing.plaf.TableHeaderUI (the hereby targeted class-under-test class)
 * @see TableHeaderUIClassTests TableHeaderUIClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TableHeaderUITests<SUT extends javax.swing.plaf.TableHeaderUI>
extends ComponentUITests<SUT> {

}
