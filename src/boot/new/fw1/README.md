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

You can specify application configuration options via the `-c` (`--config`) option -- e.g., to override the default choice of jetty as the server:

```bash
boot run -c server=http-kit
```

To build a standalone JAR in the `target` folder:

```bash
boot build
```

The standalone JAR will read the `PORT` environment variable to determine the port on which to run.

To modify the FW/1 configuration, edit `src/{{sanitized}}/main.clj` and look at the `my-handler` function.

## License

Copyright (C) 2016 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
