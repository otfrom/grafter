(ns grafter.rdf.ontologies.qb
  "Some convenience terms for the data cube vocabulary."
  (:use [grafter.rdf.ontologies.util]))

(def qb (prefixer "http://purl.org/linked-data/cube#"))

(def qb:DataStructureDefinition (qb "DataStructureDefinition"))
(def qb:DataSet (qb "DataSet"))
(def qb:dataSet (qb "dataSet"))

(def qb:component (qb "component"))
(def qb:componentRequired (qb "componentRequired"))
(def qb:componentAttachment (qb "componentAttachment"))

(def qb:structure (qb "structure"))

(def qb:dimension (qb "dimension"))

(def qb:attribute (qb "attribute"))

(def qb:measure (qb "measure"))
(def qb:measureType (qb "measureType"))
(def qb:MeasureProperty (qb "MeasureProperty"))

(def qb:Observation (qb "Observation"))

(def qb:concept (qb "concept"))
