#!/bin/bash

mvn --projects parent-pom --also-make-dependents clean verify
