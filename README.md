This compiles under 2.12.6 but fails using https://github.com/scala/scala/pull/6582

The code that fails is basically this:

```scala
implicit def toOption[T](v: T): Option[T] = Option(v)
val a: Int = 123
val b: Option[Long] = a // Works under 2.12.6 but not the implicit-poly-prune-2.12.x PR
```

I'm not really sure if this was intended to work in the first place but this pattern
showed up in a large Scala project we have.  I'll probably remove the implicit from
our code and make all the conversions explicit since that is not a very good implicit
to have in the first place.  However I'm not sure if the PR intended to change this
behavior.
