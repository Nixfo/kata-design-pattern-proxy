# Java Design Pattern Proxy Kata

## Problem
The business object is a `Contract` containing several attributes.
The `ContractService` is currently fetching the data from a simulated database, which takes some time to get the data.
Implements the pattern Proxy to cache.

In a second time, we want to restrict the access of a `Contract` only if the `Contract` has not expired, that is to say 
the end date is before today.
Implements the pattern Proxy to restrict the access of the resource according to this rule.

Solve the tests under the package test using the Memento pattern.

## Solution
Solution is under the package solution. Classes under this package are prefixed with the symbol ɵ to disable IDE autocompletion.