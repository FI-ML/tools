echo off

if not "%SomeVariable%"=="html-gen" SETX html-gen "%cd%"

mvn wrapper:wrapper
./mvnw clean install
