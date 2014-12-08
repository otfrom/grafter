(ns grafter.rdf.ontologies.ons-geography
  (:require [grafter.rdf.ontologies.util :refer :all]))

(def statistical-entity (prefixer "http://statistics.data.gov.uk/def/statistical-entity#"))
(def statistical-entity:name                 (statistical-entity "name"))
(def statistical-entity:abbreviation         (statistical-entity "abbreviation"))
(def statistical-entity:owner                (statistical-entity "owner"))
(def statistical-entity:coverage             (statistical-entity "coverage"))
(def statistical-entity:relatedentity        (statistical-entity "relatedentity"))
(def statistical-entity:status               (statistical-entity "status"))
(def statistical-entity:liveinstances        (statistical-entity "liveinstances"))
(def statistical-entity:archivedinstances    (statistical-entity "archivedinstances"))
(def statistical-entity:coverage             (statistical-entity "coverage"))
(def statistical-entity:firstcode            (statistical-entity "firstcode"))
(def statistical-entity:lastcode             (statistical-entity "lastcode"))
(def statistical-entity:reservedcode         (statistical-entity "reservedcode"))
(def statistical-entity:introduced           (statistical-entity "introduced"))
(def statistical-entity:lastinstancechange   (statistical-entity "lastinstancechange"))
(def statistical-entity:code                 (statistical-entity "code"))
(def statistical-entity:crossborderinstances (statistical-entity "crossborderinstances"))
(def statistical-entity:theme                (statistical-entity "theme"))

(def statistical-geography (prefixer "http://statistics.data.gov.uk/def/statistical-geography#"))
(def statistical-geography:officialname      (statistical-geography "officialname"))
(def statistical-geography:status            (statistical-geography "status"))
(def statistical-geography:parentcode        (statistical-geography "parentcode"))

(def boundary-change (prefixer "http://statistics.data.gov.uk/def/boundary-change/"))
(def boundary-change:operativedate           (boundary-change "operativedate"))
(def boundary-change:originatingChangeOrder  (boundary-change "originatingChangeOrder"))
(def boundary-change:terminateddate          (boundary-change "terminateddate"))
(def boundary-change:changeOrderTitle        (boundary-change "changeOrderTitle"))
