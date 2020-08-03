#!/bin/bash

tag_version=$1

mkdir ~/.bintray/
FILE=$HOME/.bintray/.credentials
cat <<EOF >$FILE
realm = Bintray API Realm
host = api.bintray.com
user = $BINTRAY_SNOWPLOW_MAVEN_USER
password = $BINTRAY_SNOWPLOW_MAVEN_API_KEY
EOF

cd $TRAVIS_BUILD_DIR
pwd

project_version=$(sbt version -Dsbt.log.noformat=true | tail -n 1 | awk '{print $2}')
if [ "${project_version}" == "${tag_version}" ]; then
    sbt +publish
    sbt +bintraySyncMavenCentral
else
    echo "Tag version '${tag_version}' doesn't match version in scala project ('${project_version}'). Aborting!"
    exit 1
fi
