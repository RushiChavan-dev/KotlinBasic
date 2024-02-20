@echo off
rem Check if an argument is provided
if "%~1"=="" (
    echo Please provide the name of the Kotlin file.
    exit /b
)

rem Compile the Kotlin file
kotlinc %1 -include-runtime -d %1.jar

rem Check if compilation was successful
if errorlevel 1 (
    echo Compilation failed. Exiting.
    exit /b
)


pause
