Sample repository in order to play with Scala language


Compiling a scala script file is possible using 
```
scalac -Xscript Upper1 pathToYourFile
```

See scalap -cp & javap -cp for reverse engineering on a given .class file

When Explicit Type Annotations Are Required ? 
In practical terms, you have to provide explicit type annotations for the following situations: 
- A mutable var or immutable val declaration where you don’t assign a value, (e.g., abstract declarations in a class like val book: String, var count: Int). 
- All method parameters (e.g., def deposit( amount: Money) = {…}). 
- Method return types in the following cases: 
    - When you explicitly call return in a method (even at the end). 
    - When a method is recursive. When two or more methods are overloaded (have the same name) and one of them calls another; the calling method needs a return type annotation. 
    - When the inferred return type would be more general than you intended, e.g., Any.

Wampler, Dean; Payne, Alex. Programming Scala: Scalability = Functional Programming + Objects (p. 47). O'Reilly Media. Édition du Kindle. 