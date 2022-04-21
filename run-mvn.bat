echo off

if not "%SomeVariable%"=="html-gen" SETX -m html-gen "%cd%"

./mvnw clean install
