$("input[type=checkbox]").click(function () {
    var number = $('input:checked').length;
    if(number == 1)
        $('#result').html(number + " box is checked");
    else
        $('#result').html(number + " boxes are checked");
})