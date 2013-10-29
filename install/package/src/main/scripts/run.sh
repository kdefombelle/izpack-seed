#!/bin/bash
LIB=lib
java -cp .:./sample-application.jar:"$LIB/*" com.kdefombelle.sample.SampleApplication "$@"