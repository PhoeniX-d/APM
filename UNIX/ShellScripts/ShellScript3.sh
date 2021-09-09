#!/bin/bash
# Shell script to calculate sum of digits
read n
digit=0
sum-0

if [ $n -lt 0 ]
then 
    echo "Not a positive number"
    exit
fi

while [[ $n -gt 0 ]]
do 
    sd=$(( $n%10 ))
    sum=$(( $sum + $sd ))
    n=$(( $n/10 ))
done
echo "Sum of digit for given number is $sum"
