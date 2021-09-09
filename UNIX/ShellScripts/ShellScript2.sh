#!/bin/bash
# Shell script to find largest of 3 numbers
read num1
read num2
read num3
if [ $num1 -eq $num2 -a $num1 -eq $num3 ]; then
    echo "All the three numbers are equal"
elif [[ $num1 -eq $num2 || $num2 -eq $num3 || $num3 -eq $num1 ]]; then
    echo "I cannot figure out which number is largest"
else
    if [ $num1 -gt $num2 -a $num1 -gt $num3 ]; then
        echo "$num1 is largest number"
    elif [ $num2 -gt $num1 -a $num2 -gt $num3 ]; then
        echo "$num2 is largest number"
    elif [ $num3 -gt $num1 -a $num3 -gt $num2 ]; then
        echo "$num3 is largest number"
    fi
fi
