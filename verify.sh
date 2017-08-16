#!/bin/bash

mvn --projects parent-pom --also-make --also-make-dependents clean verify
