# fw1-template

A Leiningen template for FW/1 (Framework One).

## Usage

### One-Off Setup

For Leiningen 1.x, first install the [newnew plugin](https://github.com/Raynes/lein-newnew):

```
lein plugin install lein-newnew X.Y.Z
```

where X.Y.Z is the latest [version from Clojars](http://clojars.org/lein-newnew).

For Leiningen 2.x, the updated 'new' task already supports templates.

Then install fw1-template:

```
lein plugin install fw1-template 0.0.6
```

### Creating a New FW/1 Project

To use the template to create a new FW/1 project:

```
lein new fw1 mywebapp
```

This will create a new FW/1 project called mywebapp. You should be able to just drop into the folder and start FW/1:

```
PORT=8888 lein run
```

## License

Copyright © 2012 Sean Corfield

Distributed under the Eclipse Public License, the same as Clojure.
