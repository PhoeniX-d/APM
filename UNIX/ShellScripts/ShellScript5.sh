#!/bin/bash
# Shell script to display file info
for F in ${*}
do
   c=$( wc -c < ${F})
   echo "Number of characters in ${F} is $c"
   w=$( wc -w < ${F} )
   echo "Number of words in ${F} is $w"
   l=$( wc -l < ${F})
   echo "Number of lines in ${F} is $l"
done