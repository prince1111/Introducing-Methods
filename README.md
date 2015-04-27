# Introducing Methods

For this assignment, you are allowed to work in **pairs** if you wish. You **must** sign up for a group in Blackboard even if you are in a group of one.

## Overview
These exercises will allow you to write some programs structured using simple functions and procedures.

##Objectives
- Practice with programming fundamentals
  - Variables - Declaration and Assignment
  - Primitive types
  - Arithmetic Expressions
  - Simple keyboard input and text display output
  - Branching - if-elseif-else syntax
  - Loops - simple while loops, nested while loops
  - Methods - simple functions
- Works towards the following Course Goals:
  - Competency with using basic coding features of a high-level imperative programming language
  - Competency with writing computer programs to implement given simple algorithms
  - Familiarity with designing simple text-oriented user interfaces

## Overall Instructions.
1. To start, [**fork** this repository][forking].
2. [**Clone**][ref-clone] the repository to your computer.
 
## Exercise 1 Description
You will be writing a simple Java program that counts the words in a String. A "skeleton" of this code is provided in the file you cloned.  You will see that there are three methods declared in this file with no code provided.  You must fill in the appropriate code.  Pay close attention to what each method should be doing based on the information given in the comments before the method.

## Exercise 1 Sample Output
This is a sample transcript of what your program should do.  Text in bold is expected input from the user rather than output from the program:

<pre>
Enter a string: <b>the quick brown fox jumped</b>
Your string has 5 words in it.
</pre>

If you provide an empty string, your program should report an error until the user enters a non-empty string:

<pre>
Enter a string: 
ERROR - string must not be empty.

Enter a string: <b>A man, a plan, a canal; Panama</b>
Your string has 7 words in it.
</pre>

**NOTE**:  As described in the comments in the skeleton file, you may assume that words will have exactly one space between them.

Next, [**commit**][ref-commit] your changes. Use the commit message "Finish exercise 1."

## Exercise 2 Description

For this exercise, you should extend the code that you wrote in Exercise 1 with a new method.  This new method should use the following method header:

```java
private static String getFirstWord(String input)
```

It should take a String as input and return the first word of that String, using the definition of a word given in Exercise 1.  If the `String` is empty, it should return the empty string.

Then modify your main program so that after it reports how many words are in your `String` it also reports what the first word of your input `String` is.

## Exercise 2 Sample Output

This is a sample transcript of what your program should do. 

<pre>
Enter a string: <b>The quick brown fox jumped</b>
Your string has 5 words in it.
The first word is: The
</pre>

If there is only one word in your `String`, make sure that your program identifies it correctly:

<pre>
Enter a string: <b>One</b>
Your string has 1 words in it.
The first word is: One
</pre>

If the user enters an empty `String`, the code should report an error as it did in Exercise 1:

<pre>
Enter a string: 
ERROR - string must not be empty.

Enter a string: <b>Four score and seven years ago</b>
Your string has 6 words in it.
The first word is: Four
</pre>

Next, [**commit**][ref-commit] your changes. Use the commit message "Finish exercise 2."

## Exercise 3 Description

Write a new method `getWord()` that uses this method header:

```java
private static String getWord(String input, int n)
```

This method should act just like `getFirstWord()` did in Exercise 2 above, except that instead of returning the first word, it returns the nth word in the string, with the first word as word 0, the second word as word 1, etc. For example the following code:

```java
String myString = getWord("the quick brown fox jumped", 3);
```

should result in the variable myString taking on the value of "fox".  If the requested index is out of bounds your method should return an empty `String` "".

Modfiy your main loop to use this new method and allow the user to pick an arbitrary word to extract from your input `String`.

Finally: 
1. [**Commit**][ref-commit] your changes. Use the commit message "Finish exercise 3."
2. [**Push**][ref-push]/sync the changes up to GitHub.
3. [Create a **pull request**][pull-request] on the original repository to turn in the assignment.
4. Submit, in Blackboard, your GitHub username.

<!-- Links -->
[create-repo]: https://help.github.com/articles/create-a-repo
[private-repos]: /guide/private_repos
[add-to-team-action]: https://github.com/education/teachers_pet/#giving-others-access
[teachers-pet]: https://github.com/education/teachers_pet
[help-add-to-team]: https://help.github.com/articles/adding-organization-members-to-a-team
[help-access-control]: https://help.github.com/articles/what-are-the-different-access-permissions#organization-accounts
[forking]: https://guides.github.com/activities/forking/
[ref-clone]: http://gitref.org/creating/#clone
[ref-commit]: http://gitref.org/basic/#commit
[ref-push]: http://gitref.org/remotes/#push
[pull-request]: https://help.github.com/articles/creating-a-pull-request
[raw]: https://raw.githubusercontent.com/education/guide/master/docs/forks.md
