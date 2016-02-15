package org.j8unit.repository.javax.management.monitor;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.management.monitor.MonitorSettingException class
 * javax.management.monitor.MonitorSettingException}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link MonitorSettingExceptionClassTests}.
 * </p>
 *
 * @see javax.management.monitor.MonitorSettingException class javax.management.monitor.MonitorSettingException (the
 *      hereby targeted class-under-test class)
 * @see MonitorSettingExceptionClassTests MonitorSettingExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MonitorSettingExceptionTests<SUT extends javax.management.monitor.MonitorSettingException>
extends org.j8unit.repository.javax.management.JMRuntimeExceptionTests<SUT> {

}
