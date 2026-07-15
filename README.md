# DigiStack Health Enterprise

Healthcare scheduling/referral application, built module-by-module to practice
IBM WebSphere ND administration end-to-end. Java 8 · Servlet/JSP · JDBC/DAO ·
PostgreSQL 15.x. Deliberately no frameworks (no Spring, no Hibernate) — the
point of this project is WebSphere administration, not framework mastery.

## What lives where

- **This repo** — the actual, buildable application source code. Written one
  module at a time, in Claude Code, in the same order as the sprint roadmap.
- **Your claude.ai project** — the simulation/planning layer: sprint roadmap,
  progress log, concept index, coding standards, and lab challenges. That's
  also where each sprint's ticket, learning session, and incident happen.

Don't build a module here before its sprint has actually run in the planning
layer — concept before build, same rule as everywhere else in this project.

## Conventions

Full detail lives in `10_CODING_STANDARDS_AND_CONCEPT_COVERAGE.md` in your
claude.ai project. The short version:

- Package structure is fixed: `com.digistack.health.{controller, service, dao,
  model, filter, util}` — one Service + one DAO per business capability.
- No SQL outside the `dao` package.
- No `System.out.println` — log through one shared utility class from day one.
- Business-rule violations throw custom checked exceptions, not
  `RuntimeException`.
- Commit messages reference the sprint's ticket ID, e.g.:
  `git commit -m "SR000011 (Sprint 2.1): Login servlet, service, DAO"`

## Keeping schema.sql in sync

`schema.sql` here is a copy of the one tracked in your claude.ai project. If a
sprint changes the schema, update **both** copies — they should never drift.

## Build

```bash
mvn clean package
```
Produces `target/digistack-health.war`. Nothing to deploy it *to* until Sprint
1.11 (WAS ND install) — Maven can build the WAR from the very first module,
but "build" and "deploy" are still two separate steps, same as in a real job.
