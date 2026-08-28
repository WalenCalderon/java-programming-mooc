# Java Programming MOOC setup for IntelliJ IDEA

Last verified: July 31, 2026

## Recommended setup

Use IntelliJ IDEA as the editor and Maven as the local test runner. Download exercise ZIP files from the official TestMyCode web portal.

Do not install the old TMC plugin for IntelliJ or the archived TMC command-line client:

- The official IntelliJ plugin is still described as a beta originally developed in 2016. There is no maintained release documented as compatible with IntelliJ IDEA 2026.2.
- The official `tmc-cli` repository was archived on June 3, 2025.
- The course documentation still describes TMCBeans as its supported integrated client, but TMCBeans is not required for writing code or running the Maven tests.

This setup keeps IntelliJ IDEA 2026.2 as the primary IDE and avoids installing obsolete TMC software.

## Local environment

- Operating system: Arch Linux
- IntelliJ IDEA: 2026.2.0.1 Ultimate
- Default Java: OpenJDK 21
- Additional installed JDK: OpenJDK 26
- Project language level: Java 8, as specified by each exercise `pom.xml`
- Maven: the Maven distribution bundled with IntelliJ IDEA

No global Java selection was changed. TMCBeans and Java 11 were not installed.

The `mvn` launcher at `~/.local/bin/mvn` points to IntelliJ's bundled Maven:

```text
~/.local/share/JetBrains/Toolbox/apps/intellij-idea/plugins/maven-plugin/lib/maven3/bin/mvn
```

## Download Part 2 of Java Programming I

Part 2 is part of the same **Java Programming I** course as Part 1. Do not switch to the separate Java Programming II course: that course begins at Part 8.

The correct official TestMyCode course is:

<https://tmc.mooc.fi/org/mooc/courses/600>

1. Sign in with the same MOOC.fi/TMC account used for Java Programming I.
2. Open course 600 and download the available ZIP templates whose names begin with `part02-Part02_`.
3. Part 2 begins with `part02-Part02_01.Squared` and ends with `part02-Part02_34.AdvancedAstrology`.
4. Extract each ZIP under this repository's `part02/` directory.
5. Keep each exercise directory intact; its `pom.xml`, `src/main`, `src/test`, `.tmcproject.yml`, and checkstyle files belong together.
6. Do not download or place any `part08-Part08_` exercise in `part02/`.

The course may gate later exercises based on progress. The official FAQ says the integrated TMC client normally reveals the next exercises after enough points are earned in the preceding part. The web portal shows the exercises currently available to the signed-in account.

## Open an exercise in IntelliJ IDEA

1. Start IntelliJ IDEA.
2. Select **File > Open**.
3. Select the exercise's `pom.xml`, for example:

   ```text
   part02/part02-Part02_01.Squared/pom.xml
   ```

4. Choose **Open as Project** if prompted.
5. Allow IntelliJ to import the Maven dependencies.
6. In **File > Project Structure > Project**, select the existing JDK 21 installation for this project. Do not change the system-wide Java default.

Although the exercises target Java 8 bytecode, JDK 21 can compile them through the Maven compiler settings in their `pom.xml`.

You may also open the repository-level `pom.xml` when you want IntelliJ to show every locally included module.

## Run tests

From IntelliJ:

1. Open the Maven tool window.
2. Expand the exercise project.
3. Run **Lifecycle > test**.

Alternatively, click the run icon beside an individual JUnit test class.

From a terminal:

```bash
cd /path/to/exercise
mvn test
```

To test all modules already registered in the repository aggregator:

```bash
cd /home/walen/NetBeansProjects/mooc-java-programming-i
mvn test
```

The first run needs network access to download Maven dependencies from Maven Central and the TMC Maven repository.

## Submitting solutions

IntelliJ and Maven can edit, compile, and run the local tests, but they do not submit exercise points to the TMC server.

Current practical options are:

1. Use the official TMC web portal when an upload/submission control is available for the exercise.
2. If server submission is required and the portal does not provide it, use TMCBeans only as a submission/download utility while continuing to write all code in IntelliJ.

TMCBeans was intentionally not installed during this setup. If it becomes necessary, install it with a dedicated Java 11 launcher or per-application configuration; do not change Arch Linux's default Java or IntelliJ's project SDK.

## Current TMC limitations

- The official course material still documents NetBeans with the TMC plugin as its supported integrated workflow.
- The IntelliJ TMC plugin is an old beta and has no verified IntelliJ IDEA 2026.2 compatibility.
- The old TMC CLI is archived and should not be used for a new setup.
- Maven runs the provided local tests but does not award points or submit results to TMC.
- JavaFX and OpenJFX are not needed for Part 2 of Java Programming I.
- Exact output, whitespace, and punctuation are significant in many course tests.

## Official references

- Course setup: <https://java-programming.mooc.fi/part-1/1-starting-programming/>
- Course FAQ: <https://java-programming.mooc.fi/faq/>
- Java Programming I course portal: <https://tmc.mooc.fi/org/mooc/courses/600>
- Legacy IntelliJ plugin repository: <https://github.com/testmycode/tmc-intellij>
- Archived TMC CLI repository: <https://github.com/testmycode/tmc-cli>
