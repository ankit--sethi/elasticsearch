/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */

<<<<<<<< HEAD:libs/core/src/main/java/org/elasticsearch/core/CheckedSupplier.java
package org.elasticsearch.core;

/**
 * A {@link java.util.function.Supplier}-like interface which allows throwing checked exceptions.
 */
@FunctionalInterface
public interface CheckedSupplier<T, E extends Exception> {
    T get() throws E;
}
========
package org.elasticsearch.entitlement.runtime.policy;

import java.util.Set;

/**
 * A Policy and associated versions to which the policy applies
 */
public record VersionedPolicy(Policy policy, Set<String> versions) {}
>>>>>>>> 1bf50c9cf1aa157dceb23134a6202d0f5fcec330:libs/entitlement/src/main/java/org/elasticsearch/entitlement/runtime/policy/VersionedPolicy.java
