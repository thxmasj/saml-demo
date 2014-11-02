#!/bin/sh

mkdir -p hello-client/target/classes/
cd hello-client/target/classes/
rm sts-ssl.jks sts-ssl-trust.jks

# SSL: STS
keytool -genkeypair -validity 730 -alias sts-ssl -keystore sts-ssl.jks -dname "cn=sts.thomasjohansen.it" -storepass changeit -keypass changeit
keytool -export -file sts-ssl.cer -alias sts-ssl -keystore sts-ssl.jks -storepass changeit
keytool -import -trustcacerts -keystore sts-ssl-trust.jks -file sts-ssl.cer -alias sts-ssl -storepass changeit -noprompt

