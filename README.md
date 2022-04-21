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

#### CAUTION

before maven builds the project this command is executed:

```bash
$ if not "%SomeVariable%"=="html-gen" SETX -m html-gen"%cd%"
```

this will create a system variable "html-gen". so you can run the hatml-gen in your comand with html-gen

To execute this command you need administrator rights.

If you do not have administrator rights you must before you will I explain inem in the user guide how you can run the
generator.

## User-Guide

### Run

#### With admin rights

```bash
$ html-gen
```

type in the comondo line the title of your html project

#### With no admin rights

delete the following line in run-mvn.bat

``` bash
$ if not "%SomeVariable%"=="html-gen" SETX -m html-gen"%cd%"
```

``` bash
.\run-mvn.bat
```

open html-gen.bat and replace %html-gen% with the path where this project is located

e.g.

``` bash
 $ copy C:\users\jane doe\FileGenerator\
```

now copy the htm-gen.bat into the directory where you need your html project and follow the steps below

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
