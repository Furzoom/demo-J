#!/bin/sh

path="com/furzoom/lab/"

# check argments number
if [ $# -ne 1 ]
then
    echo "Usage: $0 [clean | list | <class_name>]"
    exit 1
fi

# special arguments
if [ $1 = "clean" ]
then
    rm $path/*.class
    exit 0
elif [ $1 = "list" ]
then
    ls $path/
    exit 0
fi

# get source and object file modify timestamp
src=${path}$1.java
obj=${path}$1.class

lastModifyObj=0
if [ -f $src ]
then
    lastModifySrc=`stat -c %Y $src`
else
    echo "file '$1' not found"
    exit 1
fi

if [ -f $obj ]
then
    lastModifyObj=`stat -c %Y $obj`
fi

if [ $lastModifySrc -gt $lastModifyObj ]
then
    echo "javac com/furzoom/lab/$1.java"
    `javac com/furzoom/lab/$1.java`
fi

if [ -f $obj ]
then
    lastModifyObj=`stat -c %Y $obj`
fi

if [ $lastModifySrc -gt $lastModifyObj ]
then
    exit
fi

echo "java com/furzoom/lab/$1"
java com/furzoom/lab/$1

