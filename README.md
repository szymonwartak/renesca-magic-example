# renesca-magic example

A simple example to demonstrate the features of the [renesca-magic](https://github.com/renesca/renesca-magic) library.

Find the code in [src/main/scala/renesca/magicexample/Main.scala](https://github.com/renesca/renesca-magic-example/blob/master/src/main/scala/renesca/magicexample/Main.scala)

This example assumes your server is running on `http://localhost:7474` with username and password set to `neo4j`.
You can change this in the code.
It also expects your database to be completely empty and exits otherwise to not destroy any of your data.

To run this project type:
```sh
$ sbt run
```

There is no output. But at compile time the following code will be generated: [magic](https://github.com/renesca/renesca-magic-example/tree/master/magic)

## License
Licensed under the [Apache License, Version 2.0][Apache]

[Apache]: http://www.apache.org/licenses/LICENSE-2.0
