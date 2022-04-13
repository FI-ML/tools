# File-Generator

---

* [About](#about)
* [Setup-Guide](#Setup-Guide)
* [MIT-License](#MIT-License)

## About

Is a small html generator

The title you enter via the terminal with this title is then as in this example:

```
\hello-world\src\index.html and *\css\style.css 
````

The directory is created

## Setup-Guide

First step:

```bash
$ \FileGenerator\run-mvn.bat
```

It creates a jar file via mvn wrapper

Step two:

open html-gen.bat and set the path to

```
.\FileGenerator\target\FileGenerator.jar
```

```bash
$ \FileGenerator\html-gen.bat
```

You can copy the batch-script to where you need it or put it into the environment varaibels etc.

And execute it.

The folder with the files is then created from the directory from which you call the script.

## MIT-License
* [MIT License](MIT-LICENSE.txt)
