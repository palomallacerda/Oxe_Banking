(ns transferencias-api.handler 
  (:require [io.pedestal.http.route :as route]
            [io.pedestal.http :as http]))


(def service-map {::http/routes routes
                  ::http/port 9999
                  ::http/type :jetty
                  ::http/join? false})
