# {{name}}

A website written in FW/1 (Framework One).

## Usage

To run application:

```bash
boot run
```

or, to run the server on a different port:

```bash
boot run -p 8888
```

You can specify FW/1 configuration options via the `-c` (`--config`) option -- e.g., selecting a different `:home` action:

```bash
boot run -c home=section.item
```

To build a standalone JAR in the `target` folder:

```bash
boot build
```

The standalone JAR will read the `PORT` environment variable to determine the port on which to run.

## License

Copyright (C) 2016 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
