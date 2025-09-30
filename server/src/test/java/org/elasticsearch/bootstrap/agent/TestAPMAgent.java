/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */

<<<<<<<< HEAD:libs/entitlement/src/main/java/org/elasticsearch/entitlement/runtime/policy/VersionedPolicy.java
package org.elasticsearch.entitlement.runtime.policy;

import java.util.Set;

/**
 * A Policy and associated versions to which the policy applies
 */
public record VersionedPolicy(Policy policy, Set<String> versions) {}
========
package org.elasticsearch.bootstrap.agent;

/**
 * A test double for the APM agent
 */
public class TestAPMAgent {}
>>>>>>>> 1bf50c9cf1aa157dceb23134a6202d0f5fcec330:server/src/test/java/org/elasticsearch/bootstrap/agent/TestAPMAgent.java
