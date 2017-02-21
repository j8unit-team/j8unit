package org.j8unit.runners.conformance;

import org.j8unit.runners.conformance.APIConformance.APIConformanceCandidates;
import org.j8unit.runners.conformance.APIConformance.ClassTestsDiscovery;
import org.j8unit.runners.conformance.APIConformance.InstanceTestsDiscovery;

@APIConformanceCandidates(Deprecated.class)
@ClassTestsDiscovery(args = { "some.reusable.j8unit.test.repository.", "ClassTests" })
@InstanceTestsDiscovery(args = { "some.reusable.j8unit.test.repository.", "Tests" })
public class SuiteOfDeprecated_WithReusableTests {
}
