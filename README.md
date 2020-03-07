Decorator Pattern
=================

[JL coding challenge 22](https://coding-challenges.jl-engineering.net/challenges/challenge-22/)

------

## Instructions

In this challenge you will use the Decorator pattern to create a decorator that enables behaviour to be added to an instance of a class at runtime.

The Partnership is going to start selling a JLP laptop that can be configured using a range of options. The available options are:
- Processor upgrade
- Memory upgrade
- Hard Drive upgrade
- Graphic Card upgrade
- Battery upgrade
- A shiny case


Each option will have an `option name` plus a `description` and a `price`. E.g. memory upgrade will have a name of `Memory` and description (e.g. `16GB`) and a price (e.g. `49.99`) which are specified when the option is added to the laptop.

The finished laptop object should be able to tell you:
- `Description` which includes the price of all of the options (selected?) as a String.
- A `total price` for the laptop and all of the options added as a number (e.g. a Double).

------

## The Decorator Pattern

[Referenced DZone article](https://dzone.com/articles/decorator-design-pattern-in-java)

The decorator design pattern allows us to dynamically add functionality and behavior to an object without affecting the behavior of other existing objects in the same class. 

We use inheritance to extend the behavior of the class. This takes place at compile time, and all of the instances of that class get the extended behavior.

Decorator design patterns allow us to add functionality to an object (not the class) at runtime, and we can apply this customised functionality to an individual object based on our requirement and choice.


*See also my [journal entry](https://github.com/mattTea/journal/blob/master/2020/03-March/2020-03-07.md) describing this pattern and the above implementation*