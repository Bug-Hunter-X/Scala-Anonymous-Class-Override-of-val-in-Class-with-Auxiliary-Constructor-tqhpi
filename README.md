# Scala Anonymous Class Override of val in Class with Auxiliary Constructor

This repository demonstrates an uncommon bug in Scala related to overriding a `val` in an anonymous class that extends a class with an auxiliary constructor.  The issue arises when attempting to override a `val` within the anonymous class; the overridden value is ignored, and the value from the primary constructor is used instead.  This unexpected behavior can be difficult to debug without understanding the interaction between auxiliary constructors and anonymous class overrides.

The solution involves using a different approach to achieve the desired behavior.

## Bug Reproduction

The `Bug.scala` file contains the code that reproduces the bug. Run the code to see the unexpected output.

## Solution

The `BugSolution.scala` file demonstrates a corrected approach to achieve the desired outcome.
