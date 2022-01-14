- Strings, String API
Strings are objects that are immutable in nature and are created in the string class. Made of var primartives. Strings are immutable, they cannot be altered once created. 
Application Programming Interface: How stings interact with the memory and the JVM. If you create a string literal they will stored in the string pool inside the heap. If you create a string with a constructor, they will be stored in the heap, but outside the string pool. 

- varargs
Variable Arguments: allows us to set an argument to a method whose size is determined at runtime. It is a construct "..." which replaces the array notation. 
Can only have one vararg in a method and has to be the last perameter defined. If it is put in early the JVM will think it is an argument you are passing in and not something you are waiting on to process. 

- Methods
A Method is a block of code that will only execute its contents when called, can take information through parameters. Methods can only be within a class. Methods are behaviors of classes, they are functions that live within a class. The main method makes the class executable: public static void main 

- Variable Scopes
How far the variable is visible and available throughout a program.

Instance Scope Variables (Instantiated when an object is created. A field that is attached to an object itself. Think variables attached to objects.)

Class/static (Defined by the keyword static, variables can be made available by the class name itself. They change across all other instances of the class, they are available inside a class instead of being attached to a specific instance of a class.)

Method (A variable that is instantiated is only available inside a method that it is declared in. Permaeters are only available in the method block as well.)

Block (Think variables that are brought up in if statements, while if conditional statements, only visible within the block scope.)

- Non-access Modifiers - Keywords that describe the behavior of a class.

Static A keyword that changes the scope of the variable to class scope. When classes are declared static everything in the class changes to static including all methods related to that class. While static variables and methods are able to be accessed without the need of an instance or creation of a new object. When static is used in front of a method it makes that method connected to the class itself rather than an instance of the class. The same logic applys for variables where static is declared within the declaration.

Final It cannot be changed or tampered with, no matter what it may be applied to: a variable, a method or a class 

Abstract - Used as a layout that will be referance when called upon and need to be overriden. The class that you are attaching it to cannot be instantiated because it relys on concrete implementation via methods or other classes. 


Obscure and rarely used:
    Volatile Marks a variable to never be cached thread-locally
    Transient Makes a variable non serializable
    Synchronized Deals with preventing deadlocks on threads
    strictfp Helps with portability by resrticting floating points.
