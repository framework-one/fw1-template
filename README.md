# fw1-template

A [Boot](http://boot-clj.com) template for [FW/1](https://github.com/framework-one/fw1-clj) (Framework One).

### Creating a New FW/1 Project

To use the template to create a new FW/1 project:

```bash
boot -d seancorfield/boot-new new -t fw1 -n mywebapp
```

This will create a new FW/1 project called mywebapp. You should be able to just drop into the folder and start FW/1:

```bash
PORT=8888 boot run
```
or:
```bash
boot run -p 8888
```

You can also build a standalone JAR for that new app:

```bash
boot build
```

And run that JAR:

```bash
PORT=8888 java -jar target/mywebapp-0.1.0-SNAPSHOT-standalone.jar
```

## License

Copyright (c) 2012-2016 Sean Corfield

Distributed under the Eclipse Public License, the same as Clojure.
