# hello-world

An example of specter error: ERROR: Unable to resolve var: ALL in this context

## Dependencies

- java 1.7+
- clojurescript 1.10.339
- specter 1.1.1

## Usage

1. in the directory of the repo in bash do:

```bash
$ clj --main cljs.main --compile hello-world.core --repl
```

2. You should observe: WARNING: Use of undeclared Var hello-world.core/ALL ....
