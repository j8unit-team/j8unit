#!/bin/bash

mvn --projects parent-pom --also-make-dependents -DupdateReleaseInfo=true clean install
