if [[ -f ${*}]]; then
    [ -w ${*} ] && W="Write : yes" || W="Write : no"
    [ -x ${*} ] && X="Execute : yes" || X="Execute : no"
    [ -r ${*} ] && R="Read : yes" || R="Read : no"
    [ -d ${*} ] && D="Directory : yes" || D="Directory : no"
    echo "$W"
    echo "$R"
    echo "$X"
    echo "$D"
fi