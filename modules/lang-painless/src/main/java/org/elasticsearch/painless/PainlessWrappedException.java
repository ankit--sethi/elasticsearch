/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */

<<<<<<<< HEAD:libs/entitlement/qa/entitlement-test-plugin/src/main/java/org/elasticsearch/entitlement/qa/test/OperatingSystemActions.java
package org.elasticsearch.entitlement.qa.test;

import java.io.IOException;
import java.util.List;

@SuppressWarnings({ "unused" /* called via reflection */ })
class OperatingSystemActions {

    static void processBuilder_start() throws IOException {
        new ProcessBuilder("").start();
    }

    static void processBuilder_startPipeline() throws IOException {
        ProcessBuilder.startPipeline(List.of());
========
package org.elasticsearch.painless;

/**
 * Checked exceptions are wrapped in {@link ClassValue}#getFromHashMap in Error
 * which leads to unexpected behavior in Painless. This class is used as a
 * workaround for that exception wrapping.
 */
public class PainlessWrappedException extends Error {

    /**
     * Constructor.
     * @param cause The {@link Exception} cause.
     */
    public PainlessWrappedException(final Exception cause) {
        super(cause);
>>>>>>>> 1bf50c9cf1aa157dceb23134a6202d0f5fcec330:modules/lang-painless/src/main/java/org/elasticsearch/painless/PainlessWrappedException.java
    }

    private OperatingSystemActions() {}
}
