/**
 * Business logic and validation — the only layer that enforces business rules
 * (e.g. the 24-hour cancellation window, appointment transaction boundaries).
 * No HTTP handling and no direct JDBC belongs here.
 */
package com.digistack.health.service;
