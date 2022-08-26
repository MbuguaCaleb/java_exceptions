**Exception**

```yaml

An exception is an Object that contains information about an error.


Stack trace, is very useful in troubleshooting and it shows how the
methods have been called in reverse order.


When an exception is thrown/eg when we encounter an error java looks at a method/way of handling that
particular exception.


Java searches through your stack trace to find if you have in anyway handled
that paricular exeption....from the highest lever to the lowest level.


As a good developer you should anticipate exceptions and handle them effectively


```


**Types of Exeptions**

```yaml


1.Checked.

Checked exceptions are exceptions that we developers should anticipate and handle properly.

The java compiler helps us in handling the checked exceptions.

2.Unchecked.

They are not checked by compilers at compile time, they occur because of programming errors.

runtime exceptions:
  1.NullPointerException.
  2.ArithmeticException.
  3.IllegalArgumentException.
  4.IndexOutOfBoundsException.
  5.IllegalStateException.

3.Error.


Errors external to our applications.

```

**Exceptions Hierachy**

```yaml

1.Throwable

 The throwable class defines the common characteristics for all throwables and errors.

2.Exception and error

3.RuntimeException.


```