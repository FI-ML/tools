echo off
copy %html-gen%\target\FileGenerator.jar %cd%

java -jar FileGenerator.jar
del  %cd%\FileGenerator.jar

