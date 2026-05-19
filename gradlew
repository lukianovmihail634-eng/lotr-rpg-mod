#!/usr/bin/env sh

#
# Copyright 2015 the original author or authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

app_path=$()
L0="${0%/*}"
if [ -d "$L0" ] ; then
    app_path=$L0
fi

if [ "$1" = "-cp" ] || [ "$1" = "-classpath" ] ; then
    shift
    cp="$1"
    shift
    exec "$@" -cp "$cp" org.gradle.wrapper.GradleWrapperMain "$@"
else
    exec "$@" org.gradle.wrapper.GradleWrapperMain "$@"
fi
