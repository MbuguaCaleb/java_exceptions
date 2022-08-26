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


If an exception inherits from a parant there is no need to metion the 
child if i have the parent already declared.

```

**Finally Block in Error Cathching**

```yaml

It is very very important since here we put code that must be executed, for example closing 
connection.

If you had opened a connection eg a file reader and the control moved to a catch block, you 
may find that the connection will remain unclosed if not for a finally block.


Thr finally block is executed both after the code fails or runs successfully.

Refer to my Java Exeptions gist for the code,


```


**The Try with Resources**

```yaml


 //Better ways to release external resources//Example Database and File Handle connections //It is an improvement of the finally block.

//In Java we can initialize our external resources as part of the try statement

//using a try with resources we do not have to explicitly close our connection in the finally block.

//Java compiler will do that for us.
//what is passed after the try is a resource an Java will automatically close it for us.

```

**Rethrowing Exceptions**

```yaml


What if we do not want our code to break silently because when we hanlde the exceptions our
code keeps executing or logs to the DB...


we can rethtow and exception and forward it to my next block cof code.

Throwable class can be used where i am not sure of the specific exceptiion
to call.


```