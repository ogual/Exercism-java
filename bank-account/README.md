# Bank Account

Welcome to Bank Account on Exercism's Java Track.
If you need help running the tests or submitting your code, check out `HELP.md`.

## Instructions

Simulate a bank account supporting opening/closing, withdrawals, and deposits of money.
Watch out for concurrent transactions!

A bank account can be accessed in multiple ways.
Clients can make deposits and withdrawals using the internet, mobile phones, etc.
Shops can charge against the account.

Create an account that can be accessed from multiple threads/processes (terminology depends on your programming language).

It should be possible to close an account; operations against a closed account must fail.

This exercise introduces [concurrency](https://docs.oracle.com/javase/tutorial/essential/concurrency/index.html). 
To pass the last test you might find the 
[`synchronized` keyword or locks](https://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html) useful.

Problems arising from running code concurrently are often intermittent because they depend on the order the code is
executed. Therefore the last test runs many [threads](https://docs.oracle.com/javase/8/docs/api/java/lang/Thread.html) 
several times to increase the chances of catching a bug. That means this test should fail if your implementation is not
[thread safe](https://en.wikipedia.org/wiki/Thread_safety), but there is a chance it will pass just because there was 
no concurrent modification attempt. It is unlikely that this will occur several times 
in a row since the order the code is executed should vary every time you run the test. So if you run the last test a 
couple of times and it passes every time then you can be reasonably sure that your implementation is correct.

## Source

### Created by

- @FridaTveit

### Contributed to by

- @jmrunkle
- @kytrinyx
- @lemoncurry
- @msomji
- @muzimuzhi
- @SleeplessByte
- @Smarticles101
- @sshine
- @stkent