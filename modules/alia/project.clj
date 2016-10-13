(defproject cc.qbits/alia "3.2.0"
  :description "Cassandra CQL3 client for Clojure - datastax/java-driver wrapper"
  :url "https://github.com/mpenet/alia"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [cc.qbits/commons "0.4.6"]
                 [com.datastax.cassandra/cassandra-driver-core "3.1.1"
                  :classifier "shaded"
                  :exclusions [io.netty/*]]
                 [com.datastax.cassandra/cassandra-driver-dse "3.0.0-rc1"
                  :exclusions [com.datastax.cassandra/cassandra-driver-core]]]
  :jar-exclusions [#"log4j.properties"]
  :codox {:source-uri "https://github.com/mpenet/alia/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}
          :namespaces :all}
  :global-vars {*warn-on-reflection* true})
