#!/bin/sh

home=$PWD
mkdir -p $home/hello-client/target/classes
cd $home/hello-client/target/classes


keytool -genkeypair -keyalg RSA -validity 3600 -alias hello-client -keystore hello-client.jks -dname "cn=hello-client" -storepass changeit -keypass changeit

cd $home
