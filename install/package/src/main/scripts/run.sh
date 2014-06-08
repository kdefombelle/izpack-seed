#!/bin/bash
LIB=lib
java -cp .:./izpack-seed-sample-app.jar:"$LIB/*" fr.kdefombelle.izpack.SampleApplication "$@"