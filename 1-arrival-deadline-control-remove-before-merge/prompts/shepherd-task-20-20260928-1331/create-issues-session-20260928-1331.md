# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `20580094-58e7-49e2-8097-76c576c64510`  
> - **Started:** 9/28/2026, 1:31:59 PM  
> - **Duration:** 3m 10s  
> - **Exported:** 9/28/2026, 1:35:09 PM  

---

<sub>5s</sub>

### User

Invoke skill `shepherd-task-20-create-issues-from-plan` with these inputs:

- CAMPAIGN_ID: 3d813203-f331-4be7-a2b1-3680767f5a31
- LESSON_PROPAGATION: off
- REPO: edburns/dd-3070094-cargotracker-win32-x64-01
- BASE_BRANCH: experiment/shepherd-control
- PARENT_ISSUE: 1
- PLAN_DIRECTORY: 1-arrival-deadline-control-remove-before-merge
- PLAN_FILE_NAME: add-change-arrival-deadline-feature-ignorance-reduction-plan.md
- QUESTIONS_SECTION: ## Phase 3 — Ignorance reduction: questions to answer before writing code
- IMPLEMENTATION_SECTION: ## Phase 4 — Implementation (five serial issues)
- EXPECTED_TASK_COUNT: 5
- BASE_REMOTE: origin
- LOG_DIRECTORY: C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331
- DRAFT_VALIDATOR: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1
- ISSUE_BODY_VERIFIER: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1
- CHILD_LINK_VERIFIER: C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-stage20-child-links.ps1

Fixture pagination response contract (mandatory):

- `gh api ... --paginate --slurp` returns a JSON array of page payloads, so a
  one-page response has the shape `[[{...}]]`, not `[{...}]`.
- Before indexing child issue fields such as `.id`, normalize the response to
  one flat issue array exactly once.
- In Bash, use:
  `jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end'`.
- In PowerShell, capture the `gh` output and `$LASTEXITCODE` first, then pass
  the complete JSON through the same `jq` normalization before
  `ConvertFrom-Json`.
- Use the normalized flat array for the pre-creation baseline, final child
  count/order checks, and failure reconciliation. Do not apply `add` a second
  time to an already-flat array.


---

<sub>8s</sub>

### `skill`

**shepherd-task-20-create-issues-from-plan**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "shepherd-task-20-create-issues-from-plan"
}
```

</details>

```
Skill "shepherd-task-20-create-issues-from-plan" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>11s</sub>

### Copilot

I’m validating the campaign inputs, plan structure, repository state, and issue-writing conventions before any GitHub mutation.

---

<sub>29s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\01-1682-java-tool-ergonomics.md

<details>
<summary>15 lines</summary>

```
# Example 01: 1682-java-tool-ergonomics-prompts-remove-before-merge

Read `copilot-sdk/1682-java-tool-ergonomics-prompts-remove-before-merge/dd-3018003-ignorance-reduction-for-implementation-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 3 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating issues of type **Task** as children of Epic https://github.com/github/copilot-sdk/issues/1682 . These issues correspond to the sub-sections in `## Phase 4 — Implementation (the build order)`.

I want you to use `gh` to create issues as sub-issues of 1682.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Set the type to **Task**.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `upstream`: `edburns/1682-java-tool-ergonomics`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `1682-java-tool-ergonomics-prompts-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>29s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\02-1810-java-tool-as-lambda.md

<details>
<summary>12 lines</summary>

```
# Example 02: 1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge

Carefully read the plan `copilot-sdk/1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`.

We have completed Phases 1 - 3. We are now on Phase 4.

For each sub item in Phase 4, file a child issue of Feature #1810.

Use `gh` to look at Epic #1682 and its child issues for the standard of verbosity and concreteness for issue descriptions.

The issue should be assignable to a coding agent and there must be sufficient detail in the description for the agent to proceed to completion.

Pull out the specific relevant content from Phase 3 as it applies to this current issue in Phase 4.

Tell the agent to take `edburns/1810-java-tool-ergonomics-tool-as-lambda` as the base branch. When I assign the issue to the coding agent, I will set this as the base branch.

Tell the agent to read `1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`, which is present on the branch, for context.

Tell the agent which sub-item within Phase 4 they are solving.

Tell the agent that each issue will be assigned, resolved and merged to the base branch in the order in which they appear in the plan.

No work is to start until I assign each issue to the coding agent, in turn.
```

</details>


---

<sub>30s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\03-dd-3017826-java-real-estate-demo.md

<details>
<summary>14 lines</summary>

```
# Example 03: dd-3017826-java-real-estate-demo-remove-before-merge

Read `dd-3017826-java-real-estate-demo-remove-before-merge\dd-3017826-java-real-estate-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/2 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #2.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/2-build-out-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `dd-3017826-java-real-estate-demo-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>30s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md.**

C:\Users\edburns\.copilot\skills\shepherd-task-20-create-issues-from-plan\examples\04-28-python-agent-demo.md

<details>
<summary>16 lines</summary>

```
# Example 04: 28-python-agent-demo-remove-before-merge

Read `28-python-agent-demo-remove-before-merge/28-python-agent-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`. These pertain to the implementation tasks in Phase 3. ✅✅✅ Include relevant spike findings as self-contained prose in the issue description; do not direct the agent to spike directories or source files.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/28 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #28

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Again, ✅✅For each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`, include the relevant Resolution values in the issue description. These pertain to the implementation tasks in Phase 3. ✅✅✅ State relevant spike findings directly in the issue body with enough detail to implement them without reading spike code.

- For tasks dealing with the UI, make sure to refer to the relevant screengrabs, but only ones within `28-python-agent-demo-remove-before-merge/`.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/28-python-agent-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `28-python-agent-demo-remove-before-merge/`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>27s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md.**

C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md

<details>
<summary>679 lines</summary>

````
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns
Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)
Working directory: repository root of the current campaign worktree
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0
Baseline run instructions: `README.md`
Baseline preparation: fixed source branch and immutable SHA validated by the campaign fixture
Historical issue: `eclipse-ee4j/cargotracker#64`

Related directories and files:

- `src/main/java/org/eclipse/cargotracker/application/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
- `src/main/webapp/admin/dialogs/`
- `src/main/webapp/admin/tables/listNotRouted.xhtml`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

---

## Goal

Add an Administration dashboard operation that lets a shipping administrator
change the arrival deadline of a cargo listed in the **Not Routed Cargo** table.
The operation must preserve Cargo Tracker's layered architecture:

1. The application service owns the domain mutation.
2. The booking facade shields the web layer from domain types.
3. A JSF backing bean loads and submits the editable date.
4. A PrimeFaces dynamic dialog presents the editor.
5. The existing Not Routed Cargo table opens the dialog and refreshes after a
   successful update.

### User-visible acceptance behavior

Using the stable sample cargo `DEF789`:

1. Start the application with Java 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Open `http://localhost:8080/cargo-tracker/`.
3. Select **Administration**.
4. Find `DEF789` in the **Not Routed Cargo** table.
5. The Deadline cell displays its date together with an edit icon.
6. Hovering over the deadline displays:
   `Click to change cargo arrival deadline date.`
7. Selecting the deadline opens a modal dialog titled **Change Deadline**.
8. The dialog displays the cargo's origin and destination as read-only
   context.
9. The date editor is initialized to the cargo's current arrival deadline.
10. Selecting a different date and pressing **Update** closes the dialog and
    refreshes the Administration view.
11. The new date is shown in the Not Routed Cargo table.
12. Reloading the page continues to show the new date for the lifetime of the
    running in-memory sample application.
13. Pressing **Cancel** closes the dialog without changing the deadline.

### Domain acceptance behavior

Changing the deadline must:

- locate the cargo by `TrackingId`;
- preserve its existing origin;
- preserve its existing destination;
- replace only the arrival deadline in its `RouteSpecification`;
- apply the specification through `Cargo.specifyNewRoute(...)`;
- preserve the currently assigned itinerary rather than silently discarding
  it;
- allow the domain model to recalculate routing status and delivery-derived
  values against the new route specification;
- persist the changed cargo through `CargoRepository.store(...)`.

### Hard scope constraints

- Begin from commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d`.
- Preserve Java EE 7 and the `javax.*` namespace.
- Preserve the Java 7 source/target level used by this historical codebase.
- Run the application on JDK 17 using the existing Open Liberty profile.
- Do not migrate the application to Jakarta EE 8+, Jakarta EE 9+, Spring, or a
  different UI framework.
- Do not replace the in-memory Derby configuration or the Open Liberty runtime.
- Do not redesign unrelated cargo booking, routing, destination editing,
  messaging, batch, REST, or persistence behavior.
- Do not copy commits or files from feature-bearing branches. This plan is the
  implementation specification.
- Implement the five build issues below in order. Each issue must be complete
  and gated before the next issue begins.

---

## Completed phases

### Phase 1 ✅ — Establish a runnable feature-absent baseline

- Commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d` is based on the historical
  feature-absent commit and contains only the compatibility work needed to run
  the sample on JDK 17 and Open Liberty.
- `./mvnw clean package -Popenliberty liberty:run` starts the application.
- The home page and Administration flows return HTTP 200.
- JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
- The internal routing REST client works without a Jersey/MOXy classloading
  conflict.
- The scheduled batch job has the local authorization it needs.

### Phase 2 ✅ — Verify the before and after user experience

- Before implementation, `DEF789` appears in the Not Routed Cargo table with a
  plain-text deadline and no edit operation.
- The neighboring Destination column demonstrates the existing PrimeFaces
  dynamic-dialog interaction pattern.
- The desired after behavior has been manually exercised: open the deadline
  editor, choose a new date, update, refresh the table, and observe the
  persisted value.
- The historical architectural boundaries and affected files have been
  identified.

---

## Phase 3 — Ignorance reduction: questions to answer before writing code

Resolve these questions before production implementation begins. The
recommendations intentionally define the desired design closely enough that an
implementing agent should not need to invent a different architecture.

### 3.1 — Which cargos expose the edit operation?

**Question:** Should deadline editing be exposed for all cargos or only for
cargos displayed in the Not Routed Cargo table?

The requested feature originates in the Administration dashboard's Not Routed
Cargo table. Other tables represent routed, misrouted, claimed, or otherwise
progressed cargo. Adding the affordance to every table would expand the feature
and require additional business rules about changing deadlines after handling
has begun.

| Option | UI scope | Trade-off |
|--------|----------|-----------|
| A | Not Routed Cargo table only | Matches the requested feature and the established destination-edit affordance. |
| B | Every Administration cargo table | Broader capability, but introduces lifecycle and authorization questions outside the request. |
| C | Cargo details page only | Avoids table complexity but does not meet the requested dashboard interaction. |

The application-service operation itself does not need to encode a UI-table
restriction. It should accept a tracking ID and apply the domain mutation to
the located cargo. The presentation layer determines where the operation is
offered.

**Recommendation:** Option A. Add the edit affordance only to
`src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
operation generally usable for a valid cargo.

**Resolution:**

Select Option A. Expose the edit affordance only in
`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);

cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory, given that the
historical JUnit/Arquillian suite is configured for a remote Payara 4
container, while the prepared production baseline runs on JDK 17/Open Liberty?

The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
builds and compiles all test sources but does not provide a Liberty Arquillian
adapter. Modernizing the entire integration-test runtime is outside this
feature's scope.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Ensure all test sources compile as part of
   `./mvnw clean package -Popenliberty`.
3. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
4. Perform mandatory end-to-end verification against the running Open Liberty
   application.
5. Preserve the existing Payara Arquillian test path; do not delete, disable,
   or rewrite it to manufacture a passing result.

**Spike needed:** Before Issue 1 implementation, run the starting commit's
standard Open Liberty package command and record whether tests are compiled but
skipped. Confirm the new `BookingServiceTest` method can be added without
expanding the runtime modernization scope.

**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
as the mandatory executable gate. Keep the historical Arquillian test as a
precise application-layer specification and run it only when its documented
Payara environment is available.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through JPA, and asserts the complete
set of preserved and recalculated domain state described above. The prepared
Open Liberty build compiles this test but retains the historical default
`skipTests=true`; executing that Arquillian suite still requires its documented
remote Payara environment. Therefore the mandatory executable gates are the
JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
mocking dependency is part of this feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
4. Apply it using `cargo.specifyNewRoute(routeSpecification)`.
5. Persist using `cargoRepository.store(cargo)`.
6. Log the tracking ID and new deadline at `Level.INFO`, following the style of
   `changeDestination(...)`.

Do not:

- add a setter to `Cargo` or `RouteSpecification`;
- modify the origin or destination;
- clear or replace the itinerary directly;
- update persistence entities behind the aggregate's back.

**Tests to write first**

Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
`testChangeDestination()`. Build a new deadline one month after the test's
original `deadline`, invoke the service, reload the cargo with
`Cargo.findByTrackingId`, and assert:

- origin remains Chicago;
- destination remains Helsinki;
- stored deadline is the same calendar day as the requested new deadline;
- assigned itinerary remains unchanged;
- transport status remains `NOT_RECEIVED`;
- last known location remains `Location.UNKNOWN`;
- current voyage remains `Voyage.NONE`;
- cargo is not marked misdirected;
- estimated time of arrival is `Delivery.ETA_UNKOWN`;
- next expected activity is `Delivery.NO_ACTIVITY`;
- cargo is not unloaded at destination;
- routing status reflects the domain model's recalculation and remains
  `MISROUTED` for the established test sequence.

**Gating criteria**

- The test source compiles.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- No web, facade, REST, Liberty, or persistence configuration files change in
  this issue.

### 4.2 — Issue 2: Expose deadline changes through the booking facade

**What to build**

Expose the use case to presentation clients without leaking domain identifier
types into the web layer.

**Files to modify**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`

**Optional focused test file**

- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`

**Required API**

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

**Required implementation**

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

The facade must not:

- load and mutate `Cargo` itself;
- call `CargoRepository.store(...)`;
- parse a formatted date;
- introduce JSF or PrimeFaces types.

**Tests**

Where a container-free test is added, use a hand-written `BookingService` fake
or spy and prove that:

- the same `Date` object/value reaches the application service;
- the tracking-ID string is converted to an equivalent `TrackingId`;
- the facade delegates exactly once;
- no repository work is duplicated in the facade.

Do not add Mockito or another dependency solely for this test.

**Gating criteria**

- Existing facade consumers still compile.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
- The application-layer test added in Issue 1 remains unchanged and compiling.

### 4.3 — Issue 3: Implement the deadline editor backing model

**What to build**

Add the view-scoped backing bean that loads a cargo's current deadline and
submits a replacement deadline through the booking facade. Do not add the
dialog launcher or XHTML in this issue.

**File to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`

**Required bean shape**

```java
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;
}
```

Required properties and methods:

- `getTrackingId()` / `setTrackingId(String)`
- `getCargo()`
- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`
- `load()`
- `changeArrivalDeadline()`

**Load behavior**

1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.
2. Store the returned `CargoRoute`.
3. Parse `cargo.getArrivalDeadlineDate()` using `MM/dd/yyyy`.
4. Store the resulting `Date` in `arrivalDeadlineDate`.
5. Do not query a repository or domain object directly.
6. Do not ignore a parsing failure or merely print its stack trace. Surface a
   clear application/view error consistent with existing JSF behavior.

**Submit behavior**

1. Refuse a null date through JSF validation or explicit bean validation.
2. Call
   `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.
3. Close the dynamic dialog with:

   ```java
   PrimeFaces.current().dialog().closeDynamic("DONE");
   ```

4. Do not close the dialog if the facade call fails.

**Tests to write**

Add a container-free JUnit test if practical, using a hand-written fake facade,
that proves:

- `load()` requests the correct tracking ID;
- `load()` converts an `MM/dd/yyyy` DTO date into the editable `Date`;
- `changeArrivalDeadline()` delegates the selected date and tracking ID;
- a malformed DTO deadline is surfaced rather than converted to null;
- a null selected date is rejected.

Do not add a mocking framework solely for these tests.

**Gating criteria**

- The bean is serializable and uses the established CDI/JSF annotations.
- The bean references only facade DTOs, not domain model classes.
- `./mvnw clean package -Popenliberty` succeeds on JDK 17.

### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog

**What to build**

Add the session-scoped dialog launcher and the dynamic dialog view. The dialog
must work when addressed directly with a `trackingId` query parameter, but it
is not yet linked from the dashboard in this issue.

**Files to create**

- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`

**Launcher requirements**

Use:

```java
@ManagedBean(name = "changeArrivalDeadlineDateDialog")
@SessionScoped
```

Implement:

- `showDialog(String trackingId)`
- `handleReturn(SelectEvent event)`
- `cancel()`

`showDialog(...)` must:

- set the options documented in Question 3.7;
- pass `trackingId` as a dynamic-dialog request parameter;
- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`.

`cancel()` must close the dialog without invoking the facade.

**XHTML requirements**

The page title must be:

```xhtml
<title>Change Deadline</title>
```

Place metadata directly beneath the root `<html>` element and before
`<h:head>`:

```xhtml
<f:metadata>
    <f:viewParam name="trackingId"
                 value="#{changeArrivalDeadlineDate.trackingId}"/>
    <f:viewAction action="#{changeArrivalDeadlineDate.load}"/>
</f:metadata>
```

The form must display:

- `Origin:` and `changeArrivalDeadlineDate.cargo.originName`;
- `Destination:` and
  `changeArrivalDeadlineDate.cargo.finalDestinationName`;
- `Deadline:` and a `p:datePicker` bound to
  `changeArrivalDeadlineDate.arrivalDeadlineDate`;
- **Cancel**, invoking
  `changeArrivalDeadlineDateDialog.cancel()`;
- **Update**, invoking
  `changeArrivalDeadlineDate.changeArrivalDeadline()`.

The date picker must require a value. The Update action must reload or refresh
the calling Administration view after a successful dialog close, following the
existing destination-dialog behavior.

**Runtime tests**

With the application running, request:

```text
http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789
```

Verify:

- HTTP 200;
- title is **Change Deadline**;
- origin and destination render;
- the existing deadline is selected;
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRouted.arrivalDeadlineDate`;
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   ./mvnw clean package -Popenliberty liberty:run
   ```

2. Confirm the home page returns HTTP 200.
3. Open Administration and locate `DEF789`.
4. Record the original deadline.
5. Confirm the deadline now has an edit icon and tooltip.
6. Open the deadline dialog.
7. Confirm origin and destination identify the same cargo.
8. Choose a visibly different date.
9. Press **Update**.
10. Confirm the dialog closes and the Not Routed Cargo table refreshes.
11. Confirm the table shows the selected date.
12. Reload the browser and confirm the selected date remains.
13. Reopen the dialog and confirm the editor initializes to the changed date.
14. Press **Cancel** and confirm no additional change occurs.
15. Verify the Destination edit dialog still opens.
16. Verify selecting `DEF789` for routing still loads without an error page.

**Log acceptance**

The final run must contain none of:

- `<f:metadata> Parent UIComponent`;
- `TagException`;
- `VerifyError`;
- `FacesException`;
- `CWWKZ0002E` or `CWWKZ0003E`;
- recurring batch authorization failures;
- new FFDC files attributable to this feature.

Transient JMS activation-order warnings are acceptable only if all message
endpoints subsequently activate, as established by the prepared baseline.

**Final regression and scope checks**

- `./mvnw clean package -Popenliberty` succeeds.
- The existing test sources and the new deadline test compile.
- No Java EE namespace migration occurred.
- No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
  compatibility fix from the starting commit was reverted.
- The feature affects only the intended application, facade, web, dialog,
  table, and test surfaces.
- Stop Liberty cleanly.

---

## Phase 5 — Documentation and implementation handoff

- Update `README.md` only if user-facing Administration capabilities are
  enumerated there; add one concise sentence that administrators can change an
  unrouted cargo's arrival deadline.
- Record the exact JDK 17 run command in the final issue or pull-request
  description:

  ```bash
  ./mvnw clean package -Popenliberty liberty:run
  ```

- Include `DEF789` and the before/after deadline values in the acceptance
  evidence.
- State explicitly that data is in-memory and resets when the application is
  rebuilt/restarted.

---

## Cross-cutting concerns

| Concern | Required handling |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
| Date handling | Use `java.util.Date` at service/facade boundaries and `MM/dd/yyyy` for the date-only editor representation. |
| Time zones | Acceptance compares the calendar date displayed by the application; do not introduce a new timezone policy in this feature. |
| Error handling | Do not silently swallow parse, lookup, validation, or persistence failures. A failed update must not look successful. |
| JSF compatibility | Keep `<f:metadata>` at view-root scope for MyFaces. |
| Bean lifecycle | Editor is CDI `@ViewScoped`; dynamic-dialog launcher mirrors the existing session-scoped JSF managed bean. |
| Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
| Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
| Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
| Experiment integrity | Implement from this specification starting at `9b9f311b2a3a2854bdac947593950d9edb6bca7d`; do not cherry-pick or inspect feature-bearing commits. |
````

</details>


---

<sub>27s</sub>

### `view`

**view the file at C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\shepherd-campaign.json.**

C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\shepherd-campaign.json

<details>
<summary>16 lines</summary>

```
{
  "schemaVersion": 1,
  "campaignId": "3d813203-f331-4be7-a2b1-3680767f5a31",
  "campaignIssueNumber": 1,
  "campaignShortname": "arrival-deadline-control",
  "repository": "edburns/dd-3070094-cargotracker-win32-x64-01",
  "baseBranch": "experiment/shepherd-control",
  "lessonPropagation": "off",
  "campaignMetadataDirectory": "1-arrival-deadline-control-remove-before-merge",
  "lessonsFile": "campaign-lessons.md",
  "createdBy": {
    "shepherdTaskVersion": "1.0.5",
    "stageOutcomeProtocolVersion": 1
  },
  "createdAt": "2026-09-28T17:31:53Z"
}
```

</details>


---

<sub>28s</sub>

### `glob`

**1-arrival-deadline-control-remove-before-merge/**/***

"1-arrival-deadline-control-remove-before-merge/**/*"

<details>
<summary>7 matches</summary>

```
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\shepherd-test-experiment.json
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\shepherd-campaign.json
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\add-change-arrival-deadline-feature-ignorance-reduction-plan.md
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\campaign-lessons.md
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\create-issues-otel-20260928-1331.jsonl
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\20260928-1331-invoke-shepherd-task-20-create-issues-from-plan-skill.ps1
C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\20260928-1331-invoke-shepherd-task-20-create-issues-from-plan-skill.md
```

</details>


---

<sub>31s</sub>

### `powershell`

**Validate local paths and Git state**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $logDir='C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331'; $bodyDir=Join-Path $logDir 'issue-bodies'; if (-not [IO.Path]::IsPathFullyQualified($logDir)) { throw 'LOG_DIRECTORY is not absolute' }; if (-not (Test-Path -LiteralPath $logDir -PathType Container)) { throw 'LOG_DIRECTORY does not exist' }; New-Item -ItemType Directory -Force -Path $bodyDir | Out-Null; $probe=Join-Path $bodyDir '.write-probe'; [IO.File]::WriteAllText($probe,'ok'); Remove-Item -LiteralPath $probe; foreach($p in @('C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1','C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1','C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-stage20-child-links.ps1')) { if (-not [IO.Path]::IsPathFullyQualified($p) -or -not (Test-Path -LiteralPath $p -PathType Leaf)) { throw \"Missing script: $p\" } }; git remote -v; git branch --list 'experiment/shepherd-control'; git status --short --branch",
  "description": "Validate local paths and Git state"
}
```

</details>

<details>
<summary>6 lines</summary>

```
origin	git@github.com:edburns/dd-3070094-cargotracker-win32-x64-01.git (fetch)
origin	git@github.com:edburns/dd-3070094-cargotracker-win32-x64-01.git (push)
* experiment/shepherd-control
## experiment/shepherd-control...origin/experiment/shepherd-control
?? 1-arrival-deadline-control-remove-before-merge/prompts/
<shellId: 1 completed with exit code 0>
```

</details>


---

<sub>31s</sub>

### `powershell`

**Query repository parent and children**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3070094-cargotracker-win32-x64-01'; $repoOut=& gh api \"repos/$repo\" 2>&1; $repoCode=$LASTEXITCODE; if($repoCode -ne 0){throw ($repoOut|Out-String)}; $parentOut=& gh api \"repos/$repo/issues/1\" 2>&1; $parentCode=$LASTEXITCODE; if($parentCode -ne 0){throw ($parentOut|Out-String)}; $childrenOut=& gh api \"repos/$repo/issues/1/sub_issues\" --paginate --slurp 2>&1; $childrenCode=$LASTEXITCODE; if($childrenCode -ne 0){throw ($childrenOut|Out-String)}; $normalized=$childrenOut | & jq 'if length == 0 then [] elif all(.[]; type == \"array\") then add else . end'; $jqCode=$LASTEXITCODE; if($jqCode -ne 0){throw 'jq normalization failed'}; [pscustomobject]@{repository=($repoOut|Out-String|ConvertFrom-Json);parent=($parentOut|Out-String|ConvertFrom-Json);children=($normalized|Out-String|ConvertFrom-Json -NoEnumerate)} | ConvertTo-Json -Depth 10",
  "description": "Query repository parent and children"
}
```

</details>

<details>
<summary>227 lines</summary>

```
{
  "repository": {
    "id": 1393387189,
    "node_id": "R_kgDOUw1mtQ",
    "name": "dd-3070094-cargotracker-win32-x64-01",
    "full_name": "edburns/dd-3070094-cargotracker-win32-x64-01",
    "private": false,
    "owner": {
      "login": "edburns",
      "id": 75821,
      "node_id": "MDQ6VXNlcjc1ODIx",
      "avatar_url": "https://avatars.githubusercontent.com/u/75821?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/edburns",
      "html_url": "https://github.com/edburns",
      "followers_url": "https://api.github.com/users/edburns/followers",
      "following_url": "https://api.github.com/users/edburns/following{/other_user}",
      "gists_url": "https://api.github.com/users/edburns/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/edburns/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/edburns/subscriptions",
      "organizations_url": "https://api.github.com/users/edburns/orgs",
      "repos_url": "https://api.github.com/users/edburns/repos",
      "events_url": "https://api.github.com/users/edburns/events{/privacy}",
      "received_events_url": "https://api.github.com/users/edburns/received_events",
      "type": "User",
      "user_view_type": "public",
      "site_admin": true
    },
    "html_url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01",
    "description": "The project demonstrates how you can develop applications with Jakarta EE using widely adopted architectural best practices like Domain-Driven Design (DDD).",
    "fork": false,
    "url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01",
    "forks_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/forks",
    "keys_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/teams",
    "hooks_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/hooks",
    "issue_events_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/events{/number}",
    "events_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/events",
    "assignees_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/assignees{/user}",
    "branches_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/branches{/branch}",
    "tags_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/tags",
    "blobs_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/languages",
    "stargazers_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/stargazers",
    "contributors_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/contributors",
    "subscribers_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/subscribers",
    "subscription_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/subscription",
    "commits_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/contents/{+path}",
    "compare_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/merges",
    "archive_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/downloads",
    "issues_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues{/number}",
    "pulls_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/labels{/name}",
    "releases_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/releases{/id}",
    "deployments_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/deployments",
    "created_at": "2026-09-28T17:15:55Z",
    "updated_at": "2026-09-28T17:20:28Z",
    "pushed_at": "2026-09-28T17:31:55Z",
    "git_url": "git://github.com/edburns/dd-3070094-cargotracker-win32-x64-01.git",
    "ssh_url": "git@github.com:edburns/dd-3070094-cargotracker-win32-x64-01.git",
    "clone_url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01.git",
    "svn_url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01",
    "homepage": "https://eclipse-ee4j.github.io/cargotracker/",
    "size": 79859,
    "stargazers_count": 0,
    "watchers_count": 0,
    "language": null,
    "has_issues": true,
    "has_projects": true,
    "has_downloads": false,
    "has_wiki": true,
    "has_pages": false,
    "has_discussions": false,
    "forks_count": 0,
    "mirror_url": null,
    "archived": false,
    "disabled": false,
    "open_issues_count": 1,
    "license": {
      "key": "mit",
      "name": "MIT License",
      "spdx_id": "MIT",
      "url": "https://api.github.com/licenses/mit",
      "node_id": "MDc6TGljZW5zZTEz"
    },
    "allow_forking": true,
    "is_template": false,
    "web_commit_signoff_required": false,
    "has_pull_requests": true,
    "pull_request_creation_policy": "all",
    "topics": [],
    "visibility": "public",
    "forks": 0,
    "open_issues": 1,
    "watchers": 0,
    "default_branch": "20260902-2104Z-commit-e7b651f-liberty",
    "permissions": {
      "admin": true,
      "maintain": true,
      "push": true,
      "triage": true,
      "pull": true
    },
    "temp_clone_token": "",
    "allow_squash_merge": true,
    "allow_merge_commit": true,
    "allow_rebase_merge": true,
    "allow_auto_merge": false,
    "delete_branch_on_merge": false,
    "allow_update_branch": false,
    "use_squash_pr_title_as_default": false,
    "squash_merge_commit_message": "COMMIT_MESSAGES",
    "squash_merge_commit_title": "COMMIT_OR_PR_TITLE",
    "merge_commit_message": "PR_TITLE",
    "merge_commit_title": "MERGE_MESSAGE",
    "security_and_analysis": {
      "secret_scanning": {
        "status": "enabled"
      },
      "secret_scanning_push_protection": {
        "status": "enabled"
      },
      "dependabot_security_updates": {
        "status": "disabled"
      },
      "secret_scanning_non_provider_patterns": {
        "status": "disabled"
      },
      "secret_scanning_validity_checks": {
        "status": "disabled"
      }
    },
    "network_count": 0,
    "subscribers_count": 0
  },
  "parent": {
    "url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1",
    "repository_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01",
    "labels_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/labels{/name}",
    "comments_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/comments",
    "events_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/events",
    "html_url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1",
    "id": 5618676501,
    "node_id": "I_kwDOUw1mtc8AAAABTuYzFQ",
    "number": 1,
    "title": "[Campaign][off] Cargo Tracker arrival-deadline control",
    "user": {
      "login": "edburns",
      "id": 75821,
      "node_id": "MDQ6VXNlcjc1ODIx",
      "avatar_url": "https://avatars.githubusercontent.com/u/75821?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/edburns",
      "html_url": "https://github.com/edburns",
      "followers_url": "https://api.github.com/users/edburns/followers",
      "following_url": "https://api.github.com/users/edburns/following{/other_user}",
      "gists_url": "https://api.github.com/users/edburns/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/edburns/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/edburns/subscriptions",
      "organizations_url": "https://api.github.com/users/edburns/orgs",
      "repos_url": "https://api.github.com/users/edburns/repos",
      "events_url": "https://api.github.com/users/edburns/events{/privacy}",
      "received_events_url": "https://api.github.com/users/edburns/received_events",
      "type": "User",
      "user_view_type": "public",
      "site_admin": true
    },
    "labels": [],
    "state": "open",
    "locked": false,
    "assignees": [],
    "milestone": null,
    "comments": 0,
    "created_at": "2026-09-28T17:31:53Z",
    "updated_at": "2026-09-28T17:31:53Z",
    "closed_at": null,
    "assignee": null,
    "author_association": "OWNER",
    "issue_field_values": [],
    "type": null,
    "active_lock_reason": null,
    "sub_issues_summary": {
      "total": 0,
      "completed": 0,
      "percent_completed": 0
    },
    "issue_dependencies_summary": {
      "blocked_by": 0,
      "total_blocked_by": 0,
      "blocking": 0,
      "total_blocking": 0
    },
    "body": "## Shepherd-task Cargo Tracker control campaign\n\nThis campaign contains five serial tasks that add the Change Arrival Deadline\nfeature to the prepared Cargo Tracker baseline with lesson propagation\ndisabled.\n\n- Campaign base branch: `experiment/shepherd-control`\n- Campaign shortname: `arrival-deadline-control`\n- Lesson propagation: `off`\n- Immutable baseline SHA: `9b9f311b2a3a2854bdac947593950d9edb6bca7d`\n- Expected task count: 5\n- Task 1: application-layer deadline change operation\n- Task 2: booking-facade deadline change operation\n- Task 3: deadline editor backing model\n- Task 4: PrimeFaces deadline dialog\n- Task 5: Administration dashboard integration and acceptance",
    "closed_by": null,
    "reactions": {
      "url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/reactions",
      "total_count": 0,
      "+1": 0,
      "-1": 0,
      "laugh": 0,
      "hooray": 0,
      "confused": 0,
      "heart": 0,
      "rocket": 0,
      "eyes": 0
    },
    "timeline_url": "https://api.github.com/repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/timeline",
    "performed_via_github_app": null,
    "state_reason": null,
    "pinned_comment": null
  },
  "children": []
}
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>36s</sub>

### Copilot

Preflight passed: the parent is open, the base branch is non-default, the owner is a user (so children will be untyped), there are no existing children, and all nine implementation questions have substantive resolutions. I’m now checking the supplied validators and branch snapshots, then I’ll persist all five drafts before creating anything.

---

<sub>45s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\validate-stage20-drafts.ps1

<details>
<summary>60 lines</summary>

```
# shepherd-task-version: 1.0.5
<#
.SYNOPSIS
    Validates persisted stage-20 issue bodies before GitHub mutation.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [string]$BodyDirectory,

    [Parameter(Mandatory)]
    [ValidateRange(1, [int]::MaxValue)]
    [int]$ExpectedCount,

    [Parameter(Mandatory)]
    [ValidateSet('off', 'campaign')]
    [string]$LessonPropagation
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

if (-not (Test-Path -LiteralPath $BodyDirectory -PathType Container)) {
    throw "Stage-20 body directory does not exist: $BodyDirectory"
}

$bodyFiles = @(
    Get-ChildItem -LiteralPath $BodyDirectory -Filter '*-body.md' -File |
        Where-Object { $_.Name -notlike '*-observed-body.md' } |
        Sort-Object Name
)
if ($bodyFiles.Count -ne $ExpectedCount) {
    throw "Expected $ExpectedCount persisted stage-20 body files; found $($bodyFiles.Count)."
}

$requiredHeadings = @(
    '## Campaign context and required reading',
    '## Branch and execution order',
    '## Implement',
    '## Completion gates',
    '## Out of scope'
)

foreach ($bodyFile in $bodyFiles) {
    $text = [System.IO.File]::ReadAllText($bodyFile.FullName)
    $lines = [System.IO.File]::ReadAllLines($bodyFile.FullName)
    if ([string]::IsNullOrWhiteSpace($text) -or $text -notmatch "`r?`n" -or $lines.Count -le 1) {
        throw "Persisted issue body must contain physical Markdown lines: $($bodyFile.FullName)"
    }

    $firstNonblank = $lines | Where-Object { -not [string]::IsNullOrWhiteSpace($_) } | Select-Object -First 1
    if ($firstNonblank -notmatch '^##\s+\S') {
        throw "Persisted issue body must begin with a level-two heading: $($bodyFile.FullName)"
    }

    foreach ($heading in $requiredHeadings) {
        if ($lines -cnotcontains $heading) {
            throw "Persisted issue body is missing the physical heading '$heading': $($bodyFile.FullName)"
        }
    }

    $hasCampaignLessons = $lines -ccontains '## Campaign lessons (REQUIRED)'
    if ($LessonPropagation -eq 'campaign' -and -not $hasCampaignLessons) {
        throw "Treatment issue body is missing its campaign-lessons heading: $($bodyFile.FullName)"
    }
    if ($LessonPropagation -eq 'off' -and $hasCampaignLessons) {
        throw "Control issue body unexpectedly contains a campaign-lessons heading: $($bodyFile.FullName)"
    }
}

$bodyFiles
```

</details>


---

<sub>45s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-github-issue-body.ps1

<details>
<summary>166 lines</summary>

```
# shepherd-task-version: 1.0.5
<#
.SYNOPSIS
    Fetches a GitHub issue through REST and verifies its body against a file.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [ValidatePattern('^[A-Za-z0-9_.-]+/[A-Za-z0-9_.-]+$')]
    [string]$Repository,

    [Parameter(Mandatory)]
    [ValidateRange(1, [int]::MaxValue)]
    [int]$IssueNumber,

    [Parameter(Mandatory)]
    [string]$ExpectedBodyPath,

    [ValidateRange(1, 100)]
    [int]$MaxAttempts = 6,

    [ValidateRange(0, 300)]
    [int]$DelaySeconds = 5,

    [string]$DiagnosticPath,

    [string]$GitHubCli = 'gh'
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'
$PSNativeCommandUseErrorActionPreference = $false

function ConvertTo-NormalizedLineEndings {
    param([AllowEmptyString()][string]$Text)
    return $Text -replace "`r`n|`r", "`n"
}

function Test-EquivalentBody {
    param(
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    if ($Actual -ceq $Expected) {
        return $true
    }
    if ($Actual.EndsWith("`n") -and $Actual.Substring(0, $Actual.Length - 1) -ceq $Expected) {
        return $true
    }
    if ($Expected.EndsWith("`n") -and $Expected.Substring(0, $Expected.Length - 1) -ceq $Actual) {
        return $true
    }
    return $false
}

function Get-Sha256 {
    param([AllowEmptyString()][string]$Text)

    $bytes = [System.Text.UTF8Encoding]::new($false).GetBytes($Text)
    return [Convert]::ToHexString([System.Security.Cryptography.SHA256]::HashData($bytes)).ToLowerInvariant()
}

function Get-FirstDifference {
    param(
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    $limit = [Math]::Min($Actual.Length, $Expected.Length)
    $offset = 0
    while ($offset -lt $limit -and $Actual[$offset] -ceq $Expected[$offset]) {
        $offset++
    }
    if ($offset -eq $limit -and $Actual.Length -eq $Expected.Length) {
        return $null
    }

    $prefix = $Expected.Substring(0, [Math]::Min($offset, $Expected.Length))
    $line = ([regex]::Matches($prefix, "`n").Count) + 1
    $lastNewline = $prefix.LastIndexOf("`n", [StringComparison]::Ordinal)
    $column = if ($lastNewline -lt 0) { $offset + 1 } else { $offset - $lastNewline }
    return [ordered]@{
        offset = $offset
        line = $line
        column = $column
    }
}

function Test-TerminalGitHubFailure {
    param([string]$Message)
    return $Message -match '(?i)(HTTP\s+(401|403)|authentication|not authorized|resource not accessible)'
}

function Write-Diagnostic {
    param(
        [string]$Reason,
        [int]$Attempts,
        [AllowEmptyString()][string]$Actual,
        [AllowEmptyString()][string]$Expected
    )

    if ([string]::IsNullOrWhiteSpace($DiagnosticPath)) {
        return
    }

    $parent = Split-Path -Parent $DiagnosticPath
    if (-not [string]::IsNullOrWhiteSpace($parent) -and
        -not (Test-Path -LiteralPath $parent -PathType Container)) {
        New-Item -ItemType Directory -Path $parent | Out-Null
    }

    $diagnostic = [ordered]@{
        schemaVersion = 1
        repository = $Repository
        issueNumber = $IssueNumber
        endpoint = "repos/$Repository/issues/$IssueNumber"
        attempts = $Attempts
        observedAt = (Get-Date).ToUniversalTime().ToString('o')
        reason = $Reason
        expectedLength = $Expected.Length
        actualLength = $Actual.Length
        expectedSha256 = Get-Sha256 $Expected
        actualSha256 = Get-Sha256 $Actual
        firstDifference = Get-FirstDifference -Actual $Actual -Expected $Expected
    }
    $diagnostic | ConvertTo-Json -Depth 4 |
        Set-Content -LiteralPath $DiagnosticPath -Encoding utf8NoBOM
}

if (-not (Test-Path -LiteralPath $ExpectedBodyPath -PathType Leaf)) {
    throw "Expected issue body file not found: $ExpectedBodyPath"
}

$expected = ConvertTo-NormalizedLineEndings (
    Get-Content -LiteralPath $ExpectedBodyPath -Raw
)
$lastReason = ''
$lastActual = ''
$previousConsoleOutputEncoding = [Console]::OutputEncoding
$previousOutputEncoding = $OutputEncoding
$utf8Encoding = [System.Text.UTF8Encoding]::new($false)

try {
    [Console]::OutputEncoding = $utf8Encoding
    $OutputEncoding = $utf8Encoding

    for ($attempt = 1; $attempt -le $MaxAttempts; $attempt++) {
        $output = (& $GitHubCli api "repos/$Repository/issues/$IssueNumber" 2>&1 | Out-String).Trim()
        $exitCode = $LASTEXITCODE
        if ($exitCode -ne 0) {
            $lastReason = "GitHub REST request failed with exit code $exitCode."
            if (Test-TerminalGitHubFailure $output) {
                Write-Diagnostic -Reason $lastReason -Attempts $attempt -Actual '' -Expected $expected
                throw "Unable to fetch issue #$IssueNumber from ${Repository}: $output"
            }
        }
        else {
            try {
                $issue = $output | ConvertFrom-Json
                $lastActual = ConvertTo-NormalizedLineEndings ([string]$issue.body)
                if (Test-EquivalentBody -Actual $lastActual -Expected $expected) {
                    return $issue
                }
                $lastReason = 'GitHub issue body differs from the persisted draft.'
            }
            catch {
                $lastReason = "GitHub REST response was invalid JSON: $($_.Exception.Message)"
            }
        }

        if ($attempt -lt $MaxAttempts) {
            Write-Warning "$lastReason Retrying issue #$IssueNumber body verification ($attempt/$MaxAttempts)."
            if ($DelaySeconds -gt 0) {
                Start-Sleep -Seconds $DelaySeconds
            }
        }
    }

    Write-Diagnostic -Reason $lastReason -Attempts $MaxAttempts -Actual $lastActual -Expected $expected
    $diagnosticSuffix = if ([string]::IsNullOrWhiteSpace($DiagnosticPath)) {
        ''
    }
    else {
        " Diagnostic: $DiagnosticPath"
    }
    throw "Issue #$IssueNumber body verification failed after $MaxAttempts attempts. $lastReason$diagnosticSuffix"
}
finally {
    $OutputEncoding = $previousOutputEncoding
    [Console]::OutputEncoding = $previousConsoleOutputEncoding
}
```

</details>


---

<sub>46s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-stage20-child-links.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\verify-stage20-child-links.ps1

<details>
<summary>39 lines</summary>

```
# shepherd-task-version: 1.0.5
<#
.SYNOPSIS
    Verifies Stage 20 child count, identity uniqueness, and creation order.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory)]
    [string]$PreCreationChildrenPath,

    [Parameter(Mandatory)]
    [string]$FinalChildrenPath,

    [Parameter(Mandatory)]
    [string]$CreationLedgerPath
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$filterPath = Join-Path $PSScriptRoot 'verify-stage20-child-links.jq'
if (-not (Test-Path -LiteralPath $filterPath -PathType Leaf)) {
    throw "Stage-20 child-link verification filter was not found: $filterPath"
}

foreach ($inputPath in @(
    $PreCreationChildrenPath,
    $FinalChildrenPath,
    $CreationLedgerPath
)) {
    if (-not (Test-Path -LiteralPath $inputPath -PathType Leaf)) {
        throw "Stage-20 child-link verification input was not found: $inputPath"
    }
}

$output = & jq -n `
    --slurpfile baseline $PreCreationChildrenPath `
    --slurpfile final $FinalChildrenPath `
    --slurpfile ledger $CreationLedgerPath `
    -f $filterPath 2>&1
$jqExitCode = $LASTEXITCODE
if ($jqExitCode -ne 0) {
    throw "Stage-20 child-link verification failed: $($output | Out-String)"
}

$output
```

</details>


---

<sub>46s</sub>

### `powershell`

**Verify branch plan and manifest**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'; $repo='edburns/dd-3070094-cargotracker-win32-x64-01'; $remote=(git remote get-url origin); if($LASTEXITCODE -ne 0){throw 'origin missing'}; if($remote -notmatch 'github\\.com[:/]edburns/dd-3070094-cargotracker-win32-x64-01(?:\\.git)?$'){throw \"origin mismatch: $remote\"}; git ls-remote --exit-code --heads origin 'refs/heads/experiment/shepherd-control' | Out-Null; if($LASTEXITCODE -ne 0){throw 'remote base branch missing'}; $plan=git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'; if($LASTEXITCODE -ne 0){throw 'plan missing from base branch'}; $campaign=git show 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json'; if($LASTEXITCODE -ne 0){throw 'campaign manifest missing from base branch'}; git cat-file -e 'experiment/shepherd-control:1-arrival-deadline-control-remove-before-merge/campaign-lessons.md'; if($LASTEXITCODE -ne 0){throw 'campaign-lessons.md missing from base branch'}; $q=[regex]::Matches(($plan -join \"`n\"),'(?m)^## Phase 3 — Ignorance reduction: questions to answer before writing code$').Count; $i=[regex]::Matches(($plan -join \"`n\"),'(?m)^## Phase 4 — Implementation \\(five serial issues\\)$').Count; $tasks=[regex]::Matches(($plan -join \"`n\"),'(?m)^### 4\\.[1-5] — Issue [1-5]: ').Count; [pscustomobject]@{remote=$remote;questionHeadingCount=$q;implementationHeadingCount=$i;directTaskCount=$tasks;campaign=($campaign -join \"`n\"|ConvertFrom-Json)}|ConvertTo-Json -Depth 5",
  "description": "Verify branch plan and manifest"
}
```

</details>

<details>
<summary>23 lines</summary>

```
{
  "remote": "git@github.com:edburns/dd-3070094-cargotracker-win32-x64-01.git",
  "questionHeadingCount": 1,
  "implementationHeadingCount": 1,
  "directTaskCount": 5,
  "campaign": {
    "schemaVersion": 1,
    "campaignId": "3d813203-f331-4be7-a2b1-3680767f5a31",
    "campaignIssueNumber": 1,
    "campaignShortname": "arrival-deadline-control",
    "repository": "edburns/dd-3070094-cargotracker-win32-x64-01",
    "baseBranch": "experiment/shepherd-control",
    "lessonPropagation": "off",
    "campaignMetadataDirectory": "1-arrival-deadline-control-remove-before-merge",
    "lessonsFile": "campaign-lessons.md",
    "createdBy": {
      "shepherdTaskVersion": "1.0.5",
      "stageOutcomeProtocolVersion": 1
    },
    "createdAt": "2026-09-28T17:31:53Z"
  }
}
<shellId: 2 completed with exit code 0>
```

</details>


---

<sub>1m 52s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

````json
"*** Begin Patch\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260928-1331/issue-bodies/01-4.1-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`\n+- `### User-visible acceptance behavior`\n+- `### Domain acceptance behavior`\n+- `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.1 — Issue 1: Add the application-layer deadline change operation`\n+- `## Cross-cutting concerns`\n+\n+This task implements subsection **4.1 — Issue 1: Add the application-layer deadline change operation**.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the base branch and target the task PR to that branch. The five tasks are assigned, completed, and merged serially in plan order. Do not begin until this issue is assigned. This is task 1 of 5; no later task may be started or assumed complete.\n+\n+Start from the campaign baseline and implement from the specification. Do not cherry-pick, copy, or inspect feature-bearing commits or files.\n+\n+## Resolved decisions and research findings\n+\n+- The domain mutation replaces the value-object `RouteSpecification`; it does not mutate a deadline field. Load by `TrackingId`, preserve the cargo's existing origin and destination, construct a replacement specification with the supplied `Date`, call `Cargo.specifyNewRoute(...)`, and store through `CargoRepository.store(...)`.\n+- Do not add mutable deadline setters to `Cargo` or `RouteSpecification`. Calling `specifyNewRoute(...)` is required so routing and delivery-derived state are recalculated by the aggregate.\n+- Preserve any assigned itinerary. Do not clear, replace, or reroute it. In the established sequential application test, the itinerary remains unchanged and routing status remains `MISROUTED` after the deadline changes.\n+- A non-null date is required at the eventual UI boundary, but this operation must not invent a new chronological rule. Do not require a future date, a date later than the old deadline, or a date after every itinerary leg; rely on existing `RouteSpecification` invariants.\n+- Research on the prepared baseline established that `BookingServiceTest` is compiled by the JDK 17 Open Liberty package build, while the historical default keeps `skipTests=true`. Executing Arquillian still requires its documented remote Payara environment. Preserve that path rather than modernizing or bypassing it.\n+\n+## Implement\n+\n+Modify only the application-layer API, implementation, and its existing application test:\n+\n+- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`\n+- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`\n+- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`\n+\n+Add this API:\n+\n+```java\n+void changeDeadline(TrackingId trackingId, Date deadline);\n+```\n+\n+Implement it in `DefaultBookingService` by:\n+\n+1. Loading the cargo with `cargoRepository.find(trackingId)`.\n+2. Reading the current destination from `cargo.getRouteSpecification().getDestination()`.\n+3. Constructing a new `RouteSpecification` from `cargo.getOrigin()`, that current destination, and the supplied deadline.\n+4. Applying the specification with `cargo.specifyNewRoute(routeSpecification)`.\n+5. Persisting with `cargoRepository.store(cargo)`.\n+6. Logging the tracking ID and new deadline at `Level.INFO` in the established `changeDestination(...)` style.\n+\n+Keep this task free of facade, JSF, PrimeFaces, REST, persistence-configuration, and Liberty-configuration changes.\n+\n+## Tests\n+\n+Write the test change before production code. Append sequential `testChangeDeadline()` after `testChangeDestination()` in `BookingServiceTest`. Create a deadline one month after the test's original `deadline`, invoke the service, reload through `Cargo.findByTrackingId`, and assert:\n+\n+- origin remains Chicago;\n+- destination remains Helsinki;\n+- the stored deadline is the same calendar day as requested;\n+- the assigned itinerary is unchanged;\n+- transport status remains `NOT_RECEIVED`;\n+- last known location remains `Location.UNKNOWN`;\n+- current voyage remains `Voyage.NONE`;\n+- the cargo is not misdirected;\n+- estimated arrival remains `Delivery.ETA_UNKOWN`;\n+- next expected activity remains `Delivery.NO_ACTIVITY`;\n+- the cargo is not unloaded at destination;\n+- routing status is recalculated and remains `MISROUTED`.\n+\n+Use date assertions that discriminate the requested calendar date without introducing a new timezone policy.\n+\n+## Completion gates\n+\n+- The new test method is ordered after `testChangeDestination()` and its source compiles.\n+- `./mvnw clean package -Popenliberty` succeeds on JDK 17.\n+- The implementation demonstrably calls `specifyNewRoute(...)` and stores the aggregate.\n+- Existing itinerary identity/content and every unaffected domain field listed above are asserted.\n+- The diff contains no web, facade, REST, Liberty, persistence configuration, namespace migration, dependency, or unrelated domain changes.\n+- Preserve Java EE 7, `javax.*`, Java 7 source/target compatibility, Derby, and the existing historical Arquillian configuration.\n+\n+## Out of scope\n+\n+- Facade API or implementation.\n+- Backing beans, dialogs, XHTML, dashboard integration, browser acceptance, or runtime UI work.\n+- New date-policy validation.\n+- New DTOs, mocking libraries, test-runtime modernization, Jakarta migration, Spring migration, or persistence redesign.\n+- Clearing/replacing itineraries, direct persistence-field updates, destination/origin changes, or unrelated refactoring.\n+\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260928-1331/issue-bodies/02-4.2-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`\n+- `### Domain acceptance behavior`\n+- `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.2 — Issue 2: Expose deadline changes through the booking facade`\n+- `## Cross-cutting concerns`\n+\n+This task implements subsection **4.2 — Issue 2: Expose deadline changes through the booking facade**.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the base branch and target the task PR to that branch. The five tasks are assigned, completed, and merged serially in plan order. Do not begin until this issue is assigned and task 1 has been merged. This is task 2 of 5; preserve task 1 and all of its gates.\n+\n+Implement from the plan and merged base branch. Do not cherry-pick, copy, or inspect feature-bearing commits or files.\n+\n+## Resolved decisions and research findings\n+\n+- The facade boundary uses `String trackingId` and `java.util.Date arrivalDeadline`. It must not expose `TrackingId`, `Cargo`, or `RouteSpecification` to presentation code and must not introduce a command DTO or formatted-string date parameter.\n+- `DefaultBookingServiceFacade` converts only the identifier with `new TrackingId(trackingId)` and passes the same `Date` to `BookingService.changeDeadline(...)`.\n+- The aggregate mutation remains owned by the application service added in task 1. The facade must not load a cargo, mutate domain state, or call a repository.\n+- Research on the prepared baseline established that the JDK 17 Open Liberty build compiles test sources but keeps historical tests skipped by default; do not modernize Arquillian or add a mocking dependency to manufacture a test result.\n+\n+## Implement\n+\n+Modify:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`\n+\n+Add:\n+\n+```java\n+void changeDeadline(String trackingId, Date arrivalDeadline);\n+```\n+\n+Implement exact delegation equivalent to:\n+\n+```java\n+bookingService.changeDeadline(\n+        new TrackingId(trackingId),\n+        arrivalDeadline);\n+```\n+\n+Follow the existing facade style, imports, annotations, and method placement. Keep date parsing and presentation concerns out of this layer.\n+\n+An optional focused test may be added at:\n+\n+- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`\n+\n+If practical without a container, use a hand-written `BookingService` fake/spy. Do not add Mockito or another dependency solely for this task.\n+\n+## Tests\n+\n+If the focused test is added, prove:\n+\n+- the tracking-ID string becomes an equivalent `TrackingId`;\n+- the same `Date` instance/value reaches the application service;\n+- delegation occurs exactly once;\n+- no repository or duplicate mutation work occurs in the facade.\n+\n+Whether or not a focused test is practical, compilation must prove all existing facade consumers remain compatible and the task-1 API is invoked with the intended types.\n+\n+## Completion gates\n+\n+- `./mvnw clean package -Popenliberty` succeeds on JDK 17.\n+- Existing facade consumers compile.\n+- The task-1 `BookingServiceTest` remains unchanged and compiles.\n+- The facade performs identifier conversion and one delegation only.\n+- No domain repository, date parsing, JSF, PrimeFaces, DTO expansion, dependency, or unrelated configuration changes are present.\n+- Preserve Java EE 7, `javax.*`, Java 7 source/target compatibility, Derby, Open Liberty, and the historical Arquillian path.\n+\n+## Out of scope\n+\n+- Reimplementing or altering the task-1 domain mutation.\n+- Parsing formatted deadlines.\n+- Loading `CargoRoute` or domain entities.\n+- Backing beans, dialog launchers, XHTML, dashboard integration, and runtime UI acceptance.\n+- New DTOs, mocking frameworks, new dependencies, Arquillian modernization, namespace migration, or unrelated refactoring.\n+\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260928-1331/issue-bodies/03-4.3-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`\n+- `### Hard scope constraints`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.3 — Issue 3: Implement the deadline editor backing model`\n+- `## Cross-cutting concerns`\n+\n+This task implements subsection **4.3 — Issue 3: Implement the deadline editor backing model**.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the base branch and target the task PR to that branch. The five tasks are assigned, completed, and merged serially in plan order. Do not begin until this issue is assigned and tasks 1 and 2 have merged. This is task 3 of 5; preserve all earlier APIs and gates.\n+\n+Implement from the plan and merged base branch. Do not cherry-pick, copy, or inspect feature-bearing commits or files.\n+\n+## Resolved decisions and research findings\n+\n+- Keep the web boundary layered: the backing bean uses `BookingServiceFacade` and `CargoRoute`; it must not access `Cargo`, `TrackingId`, `RouteSpecification`, or a repository.\n+- Keep date conversion in the view-scoped editor. Load `CargoRoute` through `loadCargoForRouting(trackingId)` and parse its date-only representation with a per-load `new SimpleDateFormat(\"MM/dd/yyyy\")`. The plan records that the full formatted deadline begins with `MM/dd/yyyy`; parsing the DTO's displayed date representation yields that same calendar date.\n+- Do not add a shared mutable `SimpleDateFormat` or broaden `CargoRoute` with a new `Date` property.\n+- Surface malformed DTO dates as a clear application/view error. Never swallow the exception, print a stack trace, or silently submit `null`.\n+- The editor is a serializable CDI `@Named @ViewScoped` bean. Dynamic-dialog launching remains a separate session-scoped JSF managed bean for task 4.\n+- Require a non-null selected date, but add no minimum, future, old-deadline, or itinerary-date rule.\n+- A successful submission delegates to the facade and closes with `\"DONE\"`. A facade failure must propagate and must not close the dialog.\n+- Research established that tests should be container-free where practical and use hand-written fakes; no mocking dependency or Arquillian modernization is warranted.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`\n+\n+Required shape:\n+\n+```java\n+@Named\n+@ViewScoped\n+public class ChangeArrivalDeadlineDate implements Serializable {\n+    private static final long serialVersionUID = 1L;\n+\n+    private String trackingId;\n+    private CargoRoute cargo;\n+    private Date arrivalDeadlineDate;\n+\n+    @Inject\n+    private BookingServiceFacade bookingServiceFacade;\n+}\n+```\n+\n+Provide:\n+\n+- `getTrackingId()` and `setTrackingId(String)`;\n+- `getCargo()`;\n+- `getArrivalDeadlineDate()` and `setArrivalDeadlineDate(Date)`;\n+- `load()`;\n+- `changeArrivalDeadline()`.\n+\n+`load()` must call `bookingServiceFacade.loadCargoForRouting(trackingId)`, retain the returned `CargoRoute`, parse the DTO's `MM/dd/yyyy` date into `arrivalDeadlineDate`, and explicitly surface parsing failures in the repository's established JSF error style.\n+\n+`changeArrivalDeadline()` must reject a null date, call `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`, and only after successful return call:\n+\n+```java\n+PrimeFaces.current().dialog().closeDynamic(\"DONE\");\n+```\n+\n+Do not add the launcher or XHTML in this task.\n+\n+## Tests\n+\n+Add a container-free JUnit test if practical with a hand-written facade fake. Prove:\n+\n+- `load()` requests the exact tracking ID;\n+- an `MM/dd/yyyy` DTO date becomes the editable `Date` for the same calendar day;\n+- submission delegates the exact tracking ID and selected date;\n+- malformed DTO input surfaces an error rather than becoming `null`;\n+- a null selected date is rejected;\n+- a facade exception prevents the close call or otherwise propagates before successful-close behavior.\n+\n+Do not add a mocking framework solely for these tests. Keep tests compatible with the historical build and dependencies.\n+\n+## Completion gates\n+\n+- `./mvnw clean package -Popenliberty` succeeds on JDK 17.\n+- The new bean is serializable and uses the established CDI `@Named` and JSF `@ViewScoped` annotations.\n+- The bean references facade APIs/DTOs only, with no domain or repository imports.\n+- Date parsing is per-load, explicit, and failure-visible.\n+- Null is rejected and successful delegation precedes dialog close.\n+- No launcher, XHTML, dashboard, dependency, configuration, namespace, or unrelated changes are present.\n+\n+## Out of scope\n+\n+- Session-scoped dialog launcher and dynamic-dialog options.\n+- Dialog XHTML, dashboard link, tooltip, Ajax return listener, and browser acceptance.\n+- Changes to `CargoRoute`, application service, repository, domain model, or facade contract.\n+- Shared formatters, new date business rules, mocking libraries, new dependencies, Arquillian modernization, or framework migration.\n+\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260928-1331/issue-bodies/04-4.4-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`\n+- `### User-visible acceptance behavior`\n+- `### Hard scope constraints`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog`\n+- `## Cross-cutting concerns`\n+\n+This task implements subsection **4.4 — Issue 4: Implement the PrimeFaces deadline dialog**.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the base branch and target the task PR to that branch. The five tasks are assigned, completed, and merged serially in plan order. Do not begin until this issue is assigned and tasks 1–3 have merged. This is task 4 of 5; preserve all prior behavior and gates.\n+\n+Implement from the plan and merged base branch. Do not cherry-pick, copy, or inspect feature-bearing commits or files.\n+\n+## Resolved decisions and research findings\n+\n+- Mirror the existing Change Destination dynamic-dialog lifecycle: the editor remains CDI `@Named @ViewScoped`, while the launcher is a serializable JSF managed bean named `changeArrivalDeadlineDateDialog` with `@SessionScoped`.\n+- Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with one `trackingId` parameter in `Map<String, List<String>>`.\n+- Required options are: `modal=true`, `draggable=true`, `resizable=false`, `contentWidth=410`, and `contentHeight=280`.\n+- Successful editor submission closes with `\"DONE\"`; cancellation closes with the empty string and must not invoke the facade. The caller's eventual `dialogReturn` handling updates `tableNotRouted`.\n+- Because the prepared Open Liberty runtime uses MyFaces, `<f:metadata>` must be a direct child of the root `<html>` element before `<h:head>` and `<h:body>`. Nesting it in `<h:body>` causes the known `UIViewRoot`/parent-component failure.\n+- The date picker requires a non-null value with normal Faces validation feedback, but no new chronological business rule.\n+- Runtime verification—not modernization of the remote-Payara Arquillian setup—is the mandatory executable evidence for this UI task.\n+\n+## Implement\n+\n+Create:\n+\n+- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`\n+- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`\n+\n+The launcher must be serializable and use:\n+\n+```java\n+@ManagedBean(name = \"changeArrivalDeadlineDateDialog\")\n+@SessionScoped\n+```\n+\n+Implement `showDialog(String trackingId)`, `handleReturn(SelectEvent event)`, and `cancel()`. Follow the existing destination dialog's repository-compatible PrimeFaces APIs and lifecycle. `showDialog(...)` supplies the exact options and request parameter above. `cancel()` closes with an empty string and performs no facade call.\n+\n+The XHTML title must be `Change Deadline`. Place this metadata directly beneath `<html>` and before `<h:head>`:\n+\n+```xhtml\n+<f:metadata>\n+    <f:viewParam name=\"trackingId\"\n+                 value=\"#{changeArrivalDeadlineDate.trackingId}\"/>\n+    <f:viewAction action=\"#{changeArrivalDeadlineDate.load}\"/>\n+</f:metadata>\n+```\n+\n+The form must show read-only `Origin:` / `changeArrivalDeadlineDate.cargo.originName` and `Destination:` / `changeArrivalDeadlineDate.cargo.finalDestinationName`, plus a labeled, required `p:datePicker` bound to `changeArrivalDeadlineDate.arrivalDeadlineDate`. Add **Cancel** invoking `changeArrivalDeadlineDateDialog.cancel()` and **Update** invoking `changeArrivalDeadlineDate.changeArrivalDeadline()`. Include visible validation feedback and preserve accessibility labels.\n+\n+The dialog must also work when loaded directly with a `trackingId` query parameter. Do not connect it to the dashboard yet.\n+\n+## Tests\n+\n+Run the application on JDK 17 and directly request:\n+\n+`http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789`\n+\n+Verify:\n+\n+- HTTP 200 and title **Change Deadline**;\n+- origin, destination, and current deadline render;\n+- no `TagException`, `<f:metadata> Parent UIComponent`, `FacesException`, or server error;\n+- required validation prevents null submission and displays feedback;\n+- Cancel closes without changing the persisted deadline;\n+- Update changes the deadline and closes successfully;\n+- a failed update does not look successful;\n+- the existing Destination dialog still works.\n+\n+## Completion gates\n+\n+- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.\n+- Direct dialog loading and both actions pass the runtime checks.\n+- MyFaces metadata placement is exactly at view-root scope.\n+- The launcher uses the exact path, parameter, options, close values, scopes, and bean names specified above.\n+- Destination editing remains functional.\n+- Stop Liberty cleanly before completing the task.\n+- No dashboard-table, domain, repository, dependency, runtime-modernization, namespace, or unrelated changes are present.\n+\n+## Out of scope\n+\n+- Editing `listNotRouted.xhtml` or exposing the affordance from any Administration table.\n+- Changing application/facade contracts, domain mutation behavior, `CargoRoute`, Derby, Liberty, REST, messaging, or batch configuration.\n+- Inline editing, full-page navigation, additional date rules, framework migration, or Arquillian modernization.\n+\n*** Add File: 1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20260928-1331/issue-bodies/05-4.5-body.md\n+## Campaign context and required reading\n+\n+On the `experiment/shepherd-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`\n+- `### User-visible acceptance behavior`\n+- `### Domain acceptance behavior`\n+- `### Hard scope constraints`\n+- `### 3.1 — Which cargos expose the edit operation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard`\n+- `## Phase 5 — Documentation and implementation handoff`\n+- `## Cross-cutting concerns`\n+\n+This task implements subsection **4.5 — Issue 5: Integrate deadline editing into the Administration dashboard**.\n+\n+## Branch and execution order\n+\n+Use `experiment/shepherd-control` as the base branch and target the task PR to that branch. The five tasks are assigned, completed, and merged serially in plan order. Do not begin until this issue is assigned and tasks 1–4 have merged. This is task 5 of 5; preserve every prior gate and complete final end-to-end acceptance.\n+\n+Implement from the plan and merged base branch. Do not cherry-pick, copy, or inspect feature-bearing commits or files.\n+\n+## Resolved decisions and research findings\n+\n+- Expose deadline editing only in `src/main/webapp/admin/tables/listNotRouted.xhtml`. Do not add it to routed, misrouted, claimed, details, or other tables. The service/facade remain generally callable and do not encode table membership.\n+- Mirror the adjacent Destination column's PrimeFaces command-link and dynamic-dialog return pattern. Do not introduce inline editing or page navigation.\n+- The completed dialog receives only `trackingId`, closes with `\"DONE\"` after success or an empty string on cancel, and the caller handles `dialogReturn` to update `tableNotRouted`.\n+- The feature preserves origin, destination, and any itinerary; aggregate recalculation remains owned by `Cargo.specifyNewRoute(...)`. Final acceptance must catch accidental regression of routing and destination flows.\n+- Require a non-null date but no new chronological rule.\n+- Research established that the mandatory executable gate is JDK 17/Open Liberty package/start plus HTTP and complete browser acceptance. The build compiles tests while historical `skipTests=true` remains; do not replace or rewrite the remote-Payara Arquillian path.\n+- Data is in-memory and persists only for the lifetime of the running sample; rebuilding/restarting resets it.\n+\n+## Implement\n+\n+Modify:\n+\n+- `src/main/webapp/admin/tables/listNotRouted.xhtml`\n+\n+Within the existing Deadline column, replace plain deadline text with a `p:commandLink` that:\n+\n+- invokes `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;\n+- continues to display `cargoNotRouted.arrivalDeadlineDate`;\n+- uses the existing Font Awesome edit-icon style from the adjacent Destination affordance;\n+- uses a stable ID such as `arrivalDeadlineToUpdate`;\n+- includes a `dialogReturn` listener invoking `changeArrivalDeadlineDateDialog.handleReturn`;\n+- updates `tableNotRouted`;\n+- exposes the exact tooltip `Click to change cargo arrival deadline date.`.\n+\n+Follow the adjacent Destination column's established structure and styling. Do not alter destination editing, tracking-ID navigation, or routing selection.\n+\n+Update `README.md` only if it already enumerates user-facing Administration capabilities; if so, add one concise sentence that administrators can change an unrouted cargo's arrival deadline. Do not add unrelated documentation.\n+\n+## Tests\n+\n+Perform this complete end-to-end flow against a clean JDK 17 Open Liberty run:\n+\n+1. Run `./mvnw clean package -Popenliberty liberty:run`.\n+2. Confirm the home page returns HTTP 200.\n+3. Open Administration and find stable sample cargo `DEF789`.\n+4. Record the original deadline.\n+5. Verify the Deadline cell now has the edit icon and exact tooltip.\n+6. Open the deadline dialog and verify origin/destination identify `DEF789`.\n+7. Select a visibly different date and press **Update**.\n+8. Verify the dialog closes, `tableNotRouted` refreshes, and the selected date appears.\n+9. Reload the browser and verify that date remains for the running application's lifetime.\n+10. Reopen the dialog and verify it initializes to the changed date.\n+11. Press **Cancel** and verify no additional change.\n+12. Verify the Destination edit dialog still opens.\n+13. Verify selecting `DEF789` for routing loads without an error page.\n+\n+Capture acceptance evidence with `DEF789`, the before/after deadline values, and the exact run command. State that the in-memory data resets on rebuild/restart.\n+\n+Inspect the final runtime log and require absence of:\n+\n+- `<f:metadata> Parent UIComponent`;\n+- `TagException`;\n+- `VerifyError`;\n+- `FacesException`;\n+- `CWWKZ0002E` or `CWWKZ0003E`;\n+- recurring batch authorization failures;\n+- new feature-attributable FFDC files.\n+\n+Transient JMS activation-order warnings are acceptable only if all message endpoints subsequently activate, as established by the baseline.\n+\n+## Completion gates\n+\n+- `./mvnw clean package -Popenliberty` succeeds and existing/new test sources compile.\n+- The full `DEF789` browser flow passes with before/after evidence.\n+- The affordance exists only in the Not Routed Cargo table and uses the exact action, listener, update target, tooltip, and stable component ID.\n+- Destination editing, routing selection, tracking, startup, REST, messaging, and batch behavior remain intact.\n+- No Java EE namespace migration occurred; preserve Java EE 7, `javax.*`, Java 7 source/target, Derby, Open Liberty, JSF metadata fixes, batch authorization, and REST compatibility.\n+- The final diff is limited to intended application/facade/web/dialog/table/test surfaces inherited from the serial tasks plus the conditional concise README update.\n+- Stop Liberty cleanly.\n+\n+## Out of scope\n+\n+- Adding deadline editing to any other table or page.\n+- Changing domain/facade contracts already completed by prior tasks.\n+- New authorization/lifecycle policies, date chronology rules, inline editing, navigation redesign, UI framework migration, persistence redesign, or runtime modernization.\n+- Reverting prepared compatibility work or redesigning unrelated booking, routing, destination, messaging, batch, REST, or persistence behavior.\n+\n*** End Patch\n"
````

</details>

```
Added 5 file(s): C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\issue-bodies\01-4.1-body.md, C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\issue-bodies\02-4.2-body.md, C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\issue-bodies\03-4.3-body.md, C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\issue-bodies\04-4.4-body.md, C:\Users\edburns\workareas\dd-3070094-cargotracker-win32-x64-01-shepherd-control\1-arrival-deadline-control-remove-before-merge\prompts\shepherd-task-20-20260928-1331\issue-bodies\05-4.5-body.md
```


---

<sub>2m 0s</sub>

### Copilot

All five issue bodies are persisted with concrete resolutions, spike findings, serial prerequisites, tests, and scope boundaries. I’m running the mandatory draft validator and atomically initializing the ledger/result artifacts and normalized baseline snapshot; only then will GitHub issue creation begin.

---

<sub>2m 8s</sub>

### `powershell`

**Validate drafts and initialize artifacts**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'\n$logDir='C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331'\n$bodyDir=Join-Path $logDir 'issue-bodies'\n$validator='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\validate-stage20-drafts.ps1'\nfunction Write-AtomicFile([string]$Destination,[string]$Content) {\n  $temporary=\"$Destination.tmp.$([guid]::NewGuid().ToString('N'))\"\n  try {\n    [IO.File]::WriteAllText($temporary,$Content + \"`n\",[Text.UTF8Encoding]::new($false))\n    Move-Item -LiteralPath $temporary -Destination $Destination -Force\n  } finally {\n    if(Test-Path -LiteralPath $temporary){Remove-Item -LiteralPath $temporary -Force}\n  }\n}\n$validated=@(& $validator -BodyDirectory $bodyDir -ExpectedCount 5 -LessonPropagation off)\nif($validated.Count -ne 5){throw \"Draft validator returned $($validated.Count) files\"}\n$ledger=Join-Path $logDir 'creation-ledger.json'\n$result=Join-Path $logDir 'stage-20-result.json'\n$baseline=Join-Path $logDir 'pre-creation-children.json'\nWrite-AtomicFile $ledger '[]'\nWrite-AtomicFile $result '{\"schemaVersion\":1,\"status\":\"in_progress\",\"ledgerFile\":\"creation-ledger.json\",\"operationError\":null}'\n$ledgerCheck=& jq -e 'type == \"array\" and length == 0' $ledger 2>&1; $ledgerCode=$LASTEXITCODE; if($ledgerCode -ne 0){throw \"Ledger initialization failed: $($ledgerCheck|Out-String)\"}\n$resultCheck=& jq -e '.schemaVersion == 1 and .status == \"in_progress\" and .ledgerFile == \"creation-ledger.json\" and .operationError == null' $result 2>&1; $resultCode=$LASTEXITCODE; if($resultCode -ne 0){throw \"Result initialization failed: $($resultCheck|Out-String)\"}\n$childrenOutput=& gh api 'repos/edburns/dd-3070094-cargotracker-win32-x64-01/issues/1/sub_issues' --paginate --slurp 2>&1\n$childrenExitCode=$LASTEXITCODE\nif($childrenExitCode -ne 0){throw \"Unable to query parent children: $($childrenOutput|Out-String)\"}\n$normalizedOutput=$childrenOutput | & jq 'if length == 0 then [] elif all(.[]; type == \"array\") then add else . end'\n$jqExitCode=$LASTEXITCODE\nif($jqExitCode -ne 0){throw 'Unable to normalize baseline child response'}\n$normalizedText=($normalizedOutput -join \"`n\")\n$parsed=$normalizedText | ConvertFrom-Json -NoEnumerate\nif($parsed -isnot [System.Array]){throw 'Normalized baseline root is not an array'}\nWrite-AtomicFile $baseline $normalizedText\n[pscustomobject]@{validatedBodies=$validated.Name;baselineChildren=([object[]]$parsed).Count;ledger=$ledger;result=$result;baseline=$baseline}|ConvertTo-Json -Depth 5",
  "description": "Validate drafts and initialize artifacts"
}
```

</details>

<details>
<summary>14 lines</summary>

```
{
  "validatedBodies": [
    "01-4.1-body.md",
    "02-4.2-body.md",
    "03-4.3-body.md",
    "04-4.4-body.md",
    "05-4.5-body.md"
  ],
  "baselineChildren": 0,
  "ledger": "C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331\\creation-ledger.json",
  "result": "C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331\\stage-20-result.json",
  "baseline": "C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331\\pre-creation-children.json"
}
<shellId: 3 completed with exit code 0>
```

</details>


---

<sub>2m 20s</sub>

### Copilot

Draft validation and artifact read-back passed, with an empty normalized child baseline. Child issues will be created **without an issue type** because this user-owned repository has no organization issue types; creation, exact-body verification, and linking will now proceed serially in plan order.

---

<sub>2m 55s</sub>

### `powershell`

**Create verify and link child issues**

<details>
<summary>Arguments</summary>

```json
{
  "command": "$ErrorActionPreference='Stop'\nSet-StrictMode -Version Latest\n$repo='edburns/dd-3070094-cargotracker-win32-x64-01'\n$parent=1\n$logDir='C:\\Users\\edburns\\workareas\\dd-3070094-cargotracker-win32-x64-01-shepherd-control\\1-arrival-deadline-control-remove-before-merge\\prompts\\shepherd-task-20-20260928-1331'\n$bodyDir=Join-Path $logDir 'issue-bodies'\n$ledgerPath=Join-Path $logDir 'creation-ledger.json'\n$resultPath=Join-Path $logDir 'stage-20-result.json'\n$prePath=Join-Path $logDir 'pre-creation-children.json'\n$finalPath=Join-Path $logDir 'final-children.json'\n$bodyVerifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-github-issue-body.ps1'\n$linkVerifier='C:\\Users\\edburns\\.copilot\\plugins\\shepherd-task\\scripts\\verify-stage20-child-links.ps1'\n[Console]::OutputEncoding=[Text.UTF8Encoding]::new($false)\n$OutputEncoding=[Text.UTF8Encoding]::new($false)\nfunction Write-AtomicFile([string]$Destination,[string]$Content) {\n  $temporary=\"$Destination.tmp.$([guid]::NewGuid().ToString('N'))\"\n  try {\n    [IO.File]::WriteAllText($temporary,$Content + \"`n\",[Text.UTF8Encoding]::new($false))\n    [IO.File]::Move($temporary,$Destination,$true)\n  } finally {\n    if(Test-Path -LiteralPath $temporary){Remove-Item -LiteralPath $temporary -Force}\n  }\n}\nfunction Read-CreationLedger {\n  $parsed=[IO.File]::ReadAllText($ledgerPath) | ConvertFrom-Json -NoEnumerate\n  if($parsed -isnot [System.Array]){throw 'Creation ledger JSON root must be an array.'}\n  $ledger=[object[]]$parsed\n  if(@($ledger | Where-Object {$_ -is [System.Array]}).Count -ne 0){throw 'Creation ledger must not contain nested array entries.'}\n  return $ledger\n}\nfunction Write-CreationLedger([object[]]$Ledger) {\n  $json=ConvertTo-Json -InputObject ([object[]]$Ledger) -Depth 10\n  Write-AtomicFile $ledgerPath $json\n  [void](Read-CreationLedger)\n}\nfunction Set-LedgerFlag([long]$Number,[string]$Field,[bool]$Value) {\n  $ledger=@(Read-CreationLedger)\n  foreach($entry in $ledger){if([long]$entry.number -eq $Number){$entry.$Field=$Value}}\n  Write-CreationLedger ([object[]]$ledger)\n}\nfunction Get-NormalizedChildren {\n  $childrenOutput=& gh api \"repos/$repo/issues/$parent/sub_issues\" --paginate --slurp 2>&1\n  $childrenExitCode=$LASTEXITCODE\n  if($childrenExitCode -ne 0){throw \"Unable to query parent children: $($childrenOutput|Out-String)\"}\n  $normalizedOutput=$childrenOutput | & jq 'if length == 0 then [] elif all(.[]; type == \"array\") then add else . end'\n  $jqExitCode=$LASTEXITCODE\n  if($jqExitCode -ne 0){throw \"Unable to normalize parent children: $($normalizedOutput|Out-String)\"}\n  $text=($normalizedOutput -join \"`n\")\n  $parsed=$text | ConvertFrom-Json -NoEnumerate\n  if($parsed -isnot [System.Array]){throw 'Normalized child response root is not an array.'}\n  return [pscustomobject]@{Text=$text;Items=[object[]]$parsed}\n}\nfunction Write-Result([string]$Status,$OperationError) {\n  $document=[ordered]@{schemaVersion=1;status=$Status;ledgerFile='creation-ledger.json';operationError=$OperationError}\n  Write-AtomicFile $resultPath (ConvertTo-Json $document -Compress -Depth 5)\n}\nfunction Reconcile-Failure([string]$Operation,[string]$Message) {\n  try {\n    $server=Get-NormalizedChildren\n    $serverIds=@($server.Items | ForEach-Object {[long]$_.id})\n    $ledger=@(Read-CreationLedger)\n    foreach($entry in $ledger){$entry.linked=($serverIds -contains [long]$entry.id)}\n    Write-CreationLedger ([object[]]$ledger)\n  } catch {\n    $Message=\"$Message Reconciliation error: $($_.Exception.Message)\"\n  }\n  Write-Result 'failed' ([ordered]@{operation=$Operation;error=$Message})\n  $reconciled=@(Read-CreationLedger)\n  [pscustomobject]@{status='failed';operation=$Operation;error=$Message;ledger=$reconciled;cleanup=@($reconciled|ForEach-Object{\"gh issue delete $($_.number) --repo `\"$repo`\" --yes\"})}|ConvertTo-Json -Depth 10\n}\n$tasks=@(\n  [pscustomobject]@{Subsection='4.1';File='01-4.1-body.md';Title='4.1 — Add the application-layer deadline change operation'},\n  [pscustomobject]@{Subsection='4.2';File='02-4.2-body.md';Title='4.2 — Expose deadline changes through the booking facade'},\n  [pscustomobject]@{Subsection='4.3';File='03-4.3-body.md';Title='4.3 — Implement the deadline editor backing model'},\n  [pscustomobject]@{Subsection='4.4';File='04-4.4-body.md';Title='4.4 — Implement the PrimeFaces deadline dialog'},\n  [pscustomobject]@{Subsection='4.5';File='05-4.5-body.md';Title='4.5 — Integrate deadline editing into the Administration dashboard'}\n)\n$currentOperation='pre-mutation validation'\ntry {\n  $initial=@(Read-CreationLedger)\n  if($initial.Count -ne 0){throw 'Creation ledger is not empty before mutation.'}\n  foreach($task in $tasks){\n    $bodyFile=Join-Path $bodyDir $task.File\n    $currentOperation=\"create issue for subsection $($task.Subsection)\"\n    $createOutput=& gh api \"repos/$repo/issues\" -X POST -f \"title=$($task.Title)\" -F \"body=@$bodyFile\" 2>&1\n    $createExitCode=$LASTEXITCODE\n    if($createExitCode -ne 0){throw \"GitHub create failed: $($createOutput|Out-String)\"}\n    try{$issue=($createOutput|Out-String)|ConvertFrom-Json}catch{throw \"Create response was invalid JSON: $($_.Exception.Message)\"}\n    $entry=[pscustomobject][ordered]@{\n      implementationSubsection=$task.Subsection\n      bodyFile=\"issue-bodies/$($task.File)\"\n      id=[long]$issue.id\n      number=[int]$issue.number\n      title=[string]$issue.title\n      url=[string]$issue.html_url\n      body_verified=$false\n      linked=$false\n    }\n    $ledger=@(Read-CreationLedger)\n    $ledger+= $entry\n    Write-CreationLedger ([object[]]$ledger)\n\n    $currentOperation=\"verify issue #$($issue.number) body\"\n    try {\n      $observedIssue=& $bodyVerifier -Repository $repo -IssueNumber ([int]$issue.number) -ExpectedBodyPath $bodyFile -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($issue.number)-body-verification-failure.json\")\n    } catch {\n      throw \"Issue body verification failed for issue #$($issue.number): $($_.Exception.Message)\"\n    }\n    Set-LedgerFlag ([long]$issue.number) 'body_verified' $true\n\n    $currentOperation=\"link issue #$($issue.number) to parent #$parent\"\n    $linked=$false\n    $linkErrors=@()\n    for($attempt=1;$attempt -le 3 -and -not $linked;$attempt++){\n      $payload=@{sub_issue_id=[long]$issue.id}|ConvertTo-Json -Compress\n      $linkOutput=$payload | & gh api \"repos/$repo/issues/$parent/sub_issues\" -X POST --input - 2>&1\n      $linkExitCode=$LASTEXITCODE\n      if($linkExitCode -eq 0){$linked=$true}else{$linkErrors+=\"attempt ${attempt}: $($linkOutput|Out-String)\"; if($attempt -lt 3){Start-Sleep -Seconds 2}}\n    }\n    if(-not $linked){throw \"Link failed after 3 attempts: $($linkErrors -join ' | ')\"}\n    Set-LedgerFlag ([long]$issue.number) 'linked' $true\n  }\n\n  $currentOperation='capture and verify final child links'\n  $final=Get-NormalizedChildren\n  Write-AtomicFile $finalPath $final.Text\n  try {\n    $linkVerification=& $linkVerifier -PreCreationChildrenPath $prePath -FinalChildrenPath $finalPath -CreationLedgerPath $ledgerPath\n  } catch {\n    throw \"Child link verifier failed: $($_.Exception.Message)\"\n  }\n\n  $currentOperation='verify final issue postconditions'\n  $ledger=@(Read-CreationLedger)\n  foreach($entry in $ledger){\n    $bodyFile=Join-Path $logDir ([string]$entry.bodyFile -replace '/', '\\')\n    try {\n      $observedIssue=& $bodyVerifier -Repository $repo -IssueNumber ([int]$entry.number) -ExpectedBodyPath $bodyFile -MaxAttempts 6 -DelaySeconds 5 -DiagnosticPath (Join-Path $logDir \"issue-$($entry.number)-final-body-verification-failure.json\")\n    } catch {\n      throw \"Final body verification failed for issue #$($entry.number): $($_.Exception.Message)\"\n    }\n    if([string]$observedIssue.state -ne 'open'){throw \"Issue #$($entry.number) is not open.\"}\n    if(@($observedIssue.assignees).Count -ne 0){throw \"Issue #$($entry.number) unexpectedly has assignees.\"}\n  }\n  Write-Result 'complete' $null\n  [pscustomobject]@{status='complete';issueType=$null;ledger=@(Read-CreationLedger);linkVerification=$linkVerification}|ConvertTo-Json -Depth 10\n} catch {\n  Reconcile-Failure $currentOperation $_.Exception.Message\n  exit 1\n}",
  "description": "Create verify and link child issues",
  "initial_wait": 180,
  "mode": "sync"
}
```

</details>

<details>
<summary>71 lines</summary>

```
{
  "status": "complete",
  "issueType": null,
  "ledger": [
    {
      "implementationSubsection": "4.1",
      "bodyFile": "issue-bodies/01-4.1-body.md",
      "id": 5618710162,
      "number": 2,
      "title": "4.1 — Add the application-layer deadline change operation",
      "url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/2",
      "body_verified": true,
      "linked": true
    },
    {
      "implementationSubsection": "4.2",
      "bodyFile": "issue-bodies/02-4.2-body.md",
      "id": 5618710557,
      "number": 3,
      "title": "4.2 — Expose deadline changes through the booking facade",
      "url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/3",
      "body_verified": true,
      "linked": true
    },
    {
      "implementationSubsection": "4.3",
      "bodyFile": "issue-bodies/03-4.3-body.md",
      "id": 5618710998,
      "number": 4,
      "title": "4.3 — Implement the deadline editor backing model",
      "url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/4",
      "body_verified": true,
      "linked": true
    },
    {
      "implementationSubsection": "4.4",
      "bodyFile": "issue-bodies/04-4.4-body.md",
      "id": 5618711381,
      "number": 5,
      "title": "4.4 — Implement the PrimeFaces deadline dialog",
      "url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/5",
      "body_verified": true,
      "linked": true
    },
    {
      "implementationSubsection": "4.5",
      "bodyFile": "issue-bodies/05-4.5-body.md",
      "id": 5618711772,
      "number": 6,
      "title": "4.5 — Integrate deadline editing into the Administration dashboard",
      "url": "https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/6",
      "body_verified": true,
      "linked": true
    }
  ],
  "linkVerification": [
    "{",
    "  \"baselineCount\": 0,",
    "  \"ledgerCount\": 5,",
    "  \"finalCount\": 5,",
    "  \"newIssueIds\": [",
    "    5618710162,",
    "    5618710557,",
    "    5618710998,",
    "    5618711381,",
    "    5618711772",
    "  ]",
    "}"
  ]
}
<shellId: 4 completed with exit code 0>
```

</details>


---

<sub>2m 58s</sub>

### Copilot

All five issues were created, exact-body verified twice, linked once in plan order, left open and unassigned, and the stage result is marked complete. I’m checking the local stage-25 invocation syntax so the handoff command is accurate.

---

<sub>3m 1s</sub>

### `rg`

**shepherd-task-25-given-list**

"shepherd-task-25-given-list" (~\.copilot\plugins\shepherd-task)

<details>
<summary>131 matches</summary>

```
[grep content: 111 matches across 53 file(s) under C:/Users/edburns/.copilot/plugins/shepherd-task]

figure (2 match(es)):
  01- shepherd-task-25-given-list.md:3:Stage 25 (`shepherd-task-25-given-list`) owns one serial run. It validates the durable campaign
  01- shepherd-task-25-given-list.md:12:    participant GL as Stage 25: shepherd-task-25-given-list
making-of.md:248: `shepherd-task-25-given-list-run.json`. The run begins as `running` and is

README.md (8 match(es)):
  33: - one or more `shepherd-task-25-given-list` runs.
  54: | 25         |                                                    | `shepherd-task-25-given-list`                     | Runs selected child issues serially, invokes `shepherd-task` separately for each issue to perform stages 30 and 40, and always invokes stage 50 |
  256: ./plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh \
  264: .\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1 `
  295: - [Figure 01 — stage 25 given-list batch orchestration](figure-01-shepherd-task-25-given-list.md)
  449: `shepherd-task-25-given-list-run.json`:
  542:     ├── shepherd-task-25-given-list-run.json
  627: | `scripts/shepherd-task-25-given-list.*` | Run stage 25: create a run and dispatch issues serially |

skills/shepherd-task (3 match(es)):
  50- create-post-mortem\SKILL.md:13:This skill is designed to be invoked from `shepherd-task-25-given-list.ps1` / `shepherd-task-25-given-list.sh` in a `finally` / `trap EXIT` path so it runs for **all outcomes**, not only after success.
  50- create-post-mortem\SKILL.md:60:2. If `shepherd-task-25-given-list-run.json` exists, verify its campaign ID,
  20- create-issues-from-plan\SKILL.md:384:2. Comma-separated child issue numbers for `shepherd-task-25-given-list`.

test/lesson-propagation-default-contract.ps1 (4 match(es)):
  9: $stage25 = Join-Path $scriptsDirectory 'shepherd-task-25-given-list.ps1'
  160:         (Join-Path $harnessDirectory 'shepherd-task-25-given-list.ps1'),
  196:             Join-Path $harnessDirectory 'shepherd-task-25-given-list.ps1'
  214:         Join-Path $runDirectories[0].FullName 'shepherd-task-25-given-list-run.json'
test/cargotracker-add-change-arrival-deadline-feature/02-create-issues.sh:226:     "$scripts_directory/shepherd-task-25-given-list.sh" \
test/cargotracker-add-change-arrival-deadline-feature/02-create-issues.ps1:264:     (Join-Path $PSScriptRoot '..' '..' 'scripts' 'shepherd-task-25-given-list.ps1')
test/cargotracker-add-change-arrival-deadline-feature/06-stage40-review-contract.ps1:14: $stage25Path = Join-Path $repoRoot 'plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1'
test/cargotracker-add-change-arrival-deadline-feature/06-stage40-review-contract.sh:10: STAGE25="$REPO_ROOT/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh"
test/cargotracker-add-change-arrival-deadline-feature/07-driver-encoding-contract.ps1:296:         'shepherd-task-25-given-list.ps1',
test/cargotracker-add-change-arrival-deadline-feature/07-driver-encoding-contract.sh:52:     'shepherd-task-25-given-list.sh'
test/cargotracker-add-change-arrival-deadline-feature/08-psncpps-contract.ps1:13: $stage25 = Join-Path $scriptsDirectory 'shepherd-task-25-given-list.ps1'
test/cargotracker-add-change-arrival-deadline-feature/08-psncpps-contract.sh:8: stage25="$scripts_directory/shepherd-task-25-given-list.sh"
test/cargotracker-add-change-arrival-deadline-feature/10-cargotracker-fixture-contract.ps1:207:     "scripts\\shepherd-task-25-given-list\.ps1"
test/cargotracker-add-change-arrival-deadline-feature/10-cargotracker-fixture-contract.sh:137: [[ "$(grep -Fc 'shepherd-task-25-given-list.sh' "$driver")" -eq 1 ]] ||
test/lesson-propagation-default-contract.sh:9: STAGE25="$SCRIPTS_DIR/shepherd-task-25-given-list.sh"

test/cargotracker-add-change-arrival-deadline-feature/20260927 (5 match(es)):
  1548- job-logs.txt:59:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False     DarkGray
  1548- job-logs.txt:60:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False     DarkGray
  1548- job-logs.txt:73:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                                                   False      Magenta
  1548- job-logs.txt:74:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False      Magenta
  1548- job-logs.txt:86:Logging shepherd-task-25-given-list run to: C:\Users\edburns\workareas\dd-3069621-cargotracker-win32-x64-shepherd-control\1-arrival-deadline-…     False          Red

workshop.md (3 match(es)):
  215: & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `
  229: /Users/edburns/.copilot/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh 2\,3 1-math-control-remove-before-merge
  241: By the time you have invoked `shepherd-task-25-given-list` the work proceeds in an entirely human hands-off manner. See `awesome-copilot-01/plugins/shepherd-task/README.md` Sections **Stage 30 readiness boundary** through **Workflow approval helper** and **Post-mortem behavior**.
test/cargotracker-add-change-arrival-deadline-feature-treatment-control/02-create-issues.ps1:255:     (Join-Path $PSScriptRoot '..' '..' 'scripts' 'shepherd-task-25-given-list.ps1')

test/cargotracker-add-change-arrival-deadline-feature/run-campaign.sh (2 match(es)):
  190:         local manifest="$directory/shepherd-task-25-given-list-run.json"
  336: stage25_script="$shepherd_plugin/scripts/shepherd-task-25-given-list.sh"

test/cargotracker-add-change-arrival-deadline-feature/run-campaign.ps1 (2 match(es)):
  341:                 $manifestPath = Join-Path $_.FullName 'shepherd-task-25-given-list-run.json'
  473:         'scripts\shepherd-task-25-given-list.ps1'

scripts/shepherd-task (5 match(es)):
  25- given-list.ps1:65:$runManifestPath = Join-Path $logDirFull 'shepherd-task-25-given-list-run.json'
  25- given-list.ps1:117:    Write-Host "Logging shepherd-task-25-given-list run to: $logDirFull"
  25- given-list.sh:6:#   ./shepherd-task-25-given-list.sh <TASK_ISSUES> <CAMPAIGN_METADATA_DIRECTORY>
  25- given-list.sh:80:RUN_MANIFEST="$LOG_DIR_FULL/shepherd-task-25-given-list-run.json"
  25- given-list.sh:116:echo "Logging shepherd-task-25-given-list run to: $LOG_DIR_FULL"
scripts/shepherd-task-monitor.ps1:10:     Run this in a SEPARATE terminal while shepherd-task-25-given-list.ps1 is running.
scripts/shepherd-task-monitor.sh:9: # Run this in a SEPARATE terminal while shepherd-task-25-given-list.sh is running.
scripts/shepherd-task.ps1:22:     Existing shepherd-task-25-given-list run directory.
test/simple-math-treatment-control/02-create-issues.ps1:256:     (Join-Path $PSScriptRoot '..' '..' 'scripts' 'shepherd-task-25-given-list.ps1')
test/version-lineup-contract.sh:98: grep -Fq 'stageOutcomeProtocolVersion:' "$plugin_root/scripts/shepherd-task-25-given-list.sh"
test/simple-math/02-create-issues.ps1:265:     (Join-Path $PSScriptRoot '..' '..' 'scripts' 'shepherd-task-25-given-list.ps1')
test/simple-math/02-create-issues.sh:27: stage25="$scripts_directory/shepherd-task-25-given-list.sh"
test/cargotracker-add-change-arrival-deadline-feature-treatment-control/06-stage40-review-contract.ps1:14: $stage25Path = Join-Path $repoRoot 'plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1'
test/cargotracker-add-change-arrival-deadline-feature-treatment-control/06-stage40-review-contract.sh:10: STAGE25="$REPO_ROOT/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh"
test/cargotracker-add-change-arrival-deadline-feature-treatment-control/08-psncpps-contract.ps1:13: $stage25 = Join-Path $scriptsDirectory 'shepherd-task-25-given-list.ps1'
test/simple-math-treatment-control/06-stage40-review-contract.ps1:14: $stage25Path = Join-Path $repoRoot 'plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1'
test/simple-math-treatment-control/06-stage40-review-contract.sh:10: STAGE25="$REPO_ROOT/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh"
test/simple-math-treatment-control/08-psncpps-contract.ps1:13: $stage25 = Join-Path $scriptsDirectory 'shepherd-task-25-given-list.ps1'

test/simple-math-treatment-control/20260831-run-treatment-control-experiment.ps1 (3 match(es)):
  151:                 $manifestPath = Join-Path $_.FullName 'shepherd-task-25-given-list-run.json'
  501:         -Path (Join-Path $ShepherdPlugin 'scripts\shepherd-task-25-given-list.ps1') `
  511:         -Path (Join-Path $ShepherdPlugin 'scripts\shepherd-task-25-given-list.ps1') `

test/cargotracker-add-change-arrival-deadline-feature-treatment-control/20260902-run-treatment-control-experiment.ps1 (3 match(es)):
  149:                 $manifestPath = Join-Path $_.FullName 'shepherd-task-25-given-list-run.json'
  502:         -Path (Join-Path $ShepherdPlugin 'scripts\shepherd-task-25-given-list.ps1') `
  512:         -Path (Join-Path $ShepherdPlugin 'scripts\shepherd-task-25-given-list.ps1') `
test/simple-math/06-stage40-review-contract.ps1:14: $stage25Path = Join-Path $repoRoot 'plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1'
test/simple-math/06-stage40-review-contract.sh:10: STAGE25="$REPO_ROOT/plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh"

test/cargotracker-add-change-arrival-deadline-feature-treatment-control/202609023-1638Z-run-treatment-control-experiment-resumeable.ps1 (3 match(es)):
  180:             'shepherd-task-25-given-list-run.json'
  395:         'shepherd-task-25-given-list-run.json'
  436:                 'scripts\shepherd-task-25-given-list.ps1') `

test/simple-math-treatment-control/README.md (2 match(es)):
  411: & "$ShepherdPlugin/scripts/shepherd-task-25-given-list.ps1" `
  420: & "$ShepherdPlugin/scripts/shepherd-task-25-given-list.ps1" `
test/simple-math/07-driver-encoding-contract.ps1:296:         'shepherd-task-25-given-list.ps1',
test/simple-math/07-driver-encoding-contract.sh:46:     'shepherd-task-25-given-list.sh'
test/simple-math/08-psncpps-contract.ps1:13: $stage25 = Join-Path $scriptsDirectory 'shepherd-task-25-given-list.ps1'
test/simple-math/08-psncpps-contract.sh:17: stage25="$scripts_directory/shepherd-task-25-given-list.sh"

test/cargotracker-add-change-arrival-deadline-feature-treatment-control/README.md (2 match(es)):
  305: & "$ShepherdPlugin\scripts\shepherd-task-25-given-list.ps1" `
  310: & "$ShepherdPlugin\scripts\shepherd-task-25-given-list.ps1" `
test/simple-math/10-simple-math-fixture-contract.ps1:136:     "scripts\\shepherd-task-25-given-list\.ps1"
test/simple-math/10-simple-math-fixture-contract.sh:81: [[ "$(grep -Fc 'scripts/shepherd-task-25-given-list.sh' "$driver")" -eq 1 ]] ||

test/simple-math/20260924 (8 match(es)):
  1317- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False       DarkGray
  1317- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False       DarkGray
  1335- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False       DarkGray
  1335- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False       DarkGray
  1401- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False       DarkGray
  1401- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False       DarkGray
  1401- job-logs.txt:72:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                                                   False        Magenta
  1401- job-logs.txt:73:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False        Magenta

test/simple-math/20260927 (14 match(es)):
  0101- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False     DarkGray
  0101- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False     DarkGray
  0101- job-logs.txt:72:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                                                   False      Magenta
  0101- job-logs.txt:73:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False      Magenta
  0101- job-logs.txt:85:Logging shepherd-task-25-given-list run to: C:\Users\edburns\workareas\dd-3069621-win32-x64-01-shepherd-control\1-math-control-remove-before-…     False          Red
  0948- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False     DarkGray
  0948- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False     DarkGray
  0948- job-logs.txt:72:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                                                   False      Magenta
  0948- job-logs.txt:73:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False      Magenta
  0948- job-logs.txt:85:Logging shepherd-task-25-given-list run to: C:\Users\edburns\workareas\dd-3069621-win32-x64-01-shepherd-control\5-math-control-remove-before-…     False          Red
  1213- job-logs.txt:58:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                                                  False     DarkGray
  1213- job-logs.txt:59:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False     DarkGray
  1213- job-logs.txt:72:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                                                   False      Magenta
  1213- job-logs.txt:73:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                                                    False      Magenta

test/simple-math/20260928 (4 match(es)):
  0850- job-logs.txt:57:[shepherd] Planned invocation of shepherd-task-25-given-list.ps1:                                                       
  0850- job-logs.txt:58:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                         
  0850- job-logs.txt:71:[shepherd] Actual invocation of shepherd-task-25-given-list.ps1:                                                        
  0850- job-logs.txt:72:  & 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `                         

test/simple-math/run-campaign.ps1 (2 match(es)):
  340:                 $manifestPath = Join-Path $_.FullName 'shepherd-task-25-given-list-run.json'
  469:         'scripts\shepherd-task-25-given-list.ps1'

test/simple-math/run-campaign.sh (2 match(es)):
  202:         local manifest="$directory/shepherd-task-25-given-list-run.json"
  338:     local stage25_script="$shepherd_plugin/scripts/shepherd-task-25-given-list.sh"
```

</details>


---

<sub>3m 4s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\README.md.**

C:\Users\edburns\.copilot\plugins\shepherd-task\README.md (lines 248-272)

<details>
<summary>17 lines</summary>

````
`stage-20-result.json` to explicitly report `complete`; a zero Copilot process
exit alone is not treated as successful issue creation.

### 5. Run stage 25 with an ordered issue list

Bash:

```bash
./plugins/shepherd-task/scripts/shepherd-task-25-given-list.sh \
  "<issue-number>,<issue-number>" \
  <campaign-metadata-directory>
```

PowerShell:

```powershell
.\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1 `
  -TaskIssues "<issue-number>,<issue-number>" `
  -CampaignMetadataDirectory <campaign-metadata-directory>
```

Stage 25 invokes `shepherd-task` for each issue in order.

**Note:** Manually invoking `shepherd-task` is also supported entry-point.
````

</details>


---

<sub>3m 4s</sub>

### `view`

**view the file at C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1.**

C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1 (lines 1-45)

<details>
<summary>38 lines</summary>

```
# shepherd-task-version: 1.0.5
<#
.SYNOPSIS
    Stage 25: dispatches an ordered issue subset within an initialized shepherd-task campaign.
#>

[CmdletBinding()]
param(
    [Parameter(Mandatory, Position = 0)]
    [string]$TaskIssues,

    [Parameter(Mandatory, Position = 1)]
    [string]$CampaignMetadataDirectory
)

Set-StrictMode -Version Latest
$ErrorActionPreference = 'Stop'

$versionInfo = & (Join-Path $PSScriptRoot 'read-shepherd-task-version.ps1')

if ($TaskIssues -notmatch '^[1-9][0-9]*(,[1-9][0-9]*)*$') {
    throw 'TaskIssues must be a comma-separated list of positive issue numbers.'
}
if ([IO.Path]::IsPathRooted($CampaignMetadataDirectory) -or $CampaignMetadataDirectory -ne (Split-Path -Leaf $CampaignMetadataDirectory)) {
    throw 'CampaignMetadataDirectory must be a repository-root-relative basename.'
}
if ($CampaignMetadataDirectory -notmatch '^[1-9][0-9]*-[a-z0-9][a-z0-9-]*-remove-before-merge$') {
    throw 'CampaignMetadataDirectory does not follow the campaign directory naming contract.'
}

$repoRootOutput = @(& git rev-parse --show-toplevel 2>$null)
$gitExitCode = $LASTEXITCODE
if ($gitExitCode -ne 0 -or $repoRootOutput.Count -eq 0) {
    throw 'Run inside the campaign Git worktree.'
}
$repoRoot = $repoRootOutput | Select-Object -First 1
$repoRoot = [IO.Path]::GetFullPath($repoRoot.Trim())
$campaignPath = [IO.Path]::GetFullPath((Join-Path $repoRoot $CampaignMetadataDirectory))
if (-not (Test-Path -LiteralPath $campaignPath -PathType Container)) { throw "Campaign metadata directory not found: $campaignPath" }
$campaignPath = (Resolve-Path -LiteralPath $campaignPath).Path
if ([IO.Directory]::GetParent($campaignPath).FullName -ne $repoRoot) { throw 'Campaign metadata directory must be a direct child of the repository root.' }

$manifestPath = Join-Path $campaignPath 'shepherd-campaign.json'
if (-not (Test-Path -LiteralPath $manifestPath -PathType Leaf)) { throw "Campaign manifest not found: $manifestPath" }
$campaign = Get-Content -LiteralPath $manifestPath -Raw | ConvertFrom-Json
```

</details>


---

<sub>3m 7s</sub>

### Copilot

Created and linked five ordered, open, unassigned child issues under #1. All issue bodies and child ordering were verified; issues were created **without an issue type**.

| Subsection | Issue | Title |
|---|---:|---|
| 4.1 | [#2](https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/2) | Add the application-layer deadline change operation |
| 4.2 | [#3](https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/3) | Expose deadline changes through the booking facade |
| 4.3 | [#4](https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/4) | Implement the deadline editor backing model |
| 4.4 | [#5](https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/5) | Implement the PrimeFaces deadline dialog |
| 4.5 | [#6](https://github.com/edburns/dd-3070094-cargotracker-win32-x64-01/issues/6) | Integrate deadline editing into the Administration dashboard |

**Stage 25 issue list:** `2,3,4,5,6`

```powershell
& 'C:\Users\edburns\.copilot\plugins\shepherd-task\scripts\shepherd-task-25-given-list.ps1' `
  -TaskIssues '2,3,4,5,6' `
  -CampaignMetadataDirectory '1-arrival-deadline-control-remove-before-merge'
```

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>
