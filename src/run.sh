#!/bin/sh

path="com/furzoom/lab/"
src=${path}$1.java
obj=${path}$1.class

lastModifySrc=`stat -c %Y $src`
lastModifyObj=0

if [ -f $obj ]
then
    lastModifyObj=`stat -c %Y $obj`
fi

if [ $lastModifySrc -gt $lastModifyObj ]
then
    echo "javac com/furzoom/lab/$1.java"
    javac com/furzoom/lab/$1.java
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

