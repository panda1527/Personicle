#!/bin/bash
for ((t=0; t<=$1; t++))
do
    mvn exec:java -Dexec.mainClass="asterix.config.AsterixConfTest" -Dexec.classpathScope="test" &
done
wait