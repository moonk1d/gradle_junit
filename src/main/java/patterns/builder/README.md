# Builder pattern

Class represents advanced version of the builder pattern which allows:

* build object with chain invocation

```java
Cat cat=Cat.newBuilder().setColor("green").setName("Kitty").setAge(2).build();
```

* provides hasFieldName() methods for each field which indicates whether object field was
  initialized or not  
  *Note: hasFieldName() methods assumes that value exists if values != default values for the field
  type*

type | default values
---- | --------------
reference | null
byte | 0
short | 0
int | 0
long | 0L
float | 0.0f
double | 0.0d
char | '\u0000'
boolean | false

* get builder object from the class

```java
Cat cat = Cat.newBuilder().setColor("green").setName("Kitty").setAge(2).build();
Cat modifiedCat = cat.toBuilder().setName("ModifiedKitty").build();
```

*Note: toBuilder() method merge object fields with non-default values to builder object*
  
