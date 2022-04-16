# File-Generator

---

* [About](#about)
* [Setup-Guide](#Setup-Guide)
* [User guide](#User-Guide)
* [MIT-License](#MIT-License)

## About

A small html files generator written in java.

## Setup-Guide

#### First step:

install java https://java.tutorials24x7.com/blog/how-to-install-java-17-on-windows

#### Next step

now you have to create the .jar file with the help of maven by executing this command in your terminal

```bash
$ \FileGenerator\run-mvn.bat
```

#### Last step:

Open html-gen.bat and set the path where the 
FileGenerator folder is located

```
.\FileGenerator\target\FileGenerator.jar
```

Now you can e.g. drag the batch file into any folder where you want to have the html directory or copy the path
into your system environment variables, and then you can call it from any directory on your pc.

## User-Guide

#### Run

```bash
$ \FileGenerator\html-gen.bat
```

type in the comondo line the title of your html project

```bash
 Please enter your project title
 $ hello world

 You need a index.html (y/n): $ y
 index.html files was added

 Add your html files, enter q to exit
 
 $ hello_world_one   
 $ hello_world_two   
 $ hello_world_three 
 $ q                 
```

(q) closes the console and the generator is ready.

#### result

##### Compiled files (alternatively `dist`)

```
.
├── hello world
    └── src
        └── css
            └── styles.css
        └── hello_world_one.html
        └── hello_world_two.html
        └── hello_world_three.html
        └── index.html

```

## MIT-License

#### [MIT License](MIT-LICENSE.txt)
