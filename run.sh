mvn compile
mvn exec:java -Dexec.mainClass="personicle.datagen.Sandbox"
export MAVEN_OPTS="-Xms4g -Xmx10g"; mvn exec:java -Dexec.mainClass="IdQuery"
export MAVEN_OPTS="-Xms4g -Xmx200g"; mvn exec:java -Dexec.mainClass="asterix.record.RecordEfficiencyTest" -Dexec.classpathScope="test"
export MAVEN_OPTS="-Xms4g -Xmx200g"; LD_PRELOAD=`jemalloc-config --libdir`/libjemalloc.so.`jemalloc-config --revision` mvn exec:java -Dexec.mainClass="asterix.record.RecordEfficiencyTest" -Dexec.classpathScope="test"