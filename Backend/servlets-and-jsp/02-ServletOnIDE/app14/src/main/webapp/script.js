function validateMyForm()
{
    var myForm = document.forms[0];
    var firstName = myForm.firstName;

    if(firstName.value.length == 0)
    {
        alert("Please enter the first Name");
        firstName.focus();
        return false;
    }
    var lastName = myForm.lastName;
    if(lastName.value.length == 0)
    {
        alert("Please enter the last Name");
        lastName.focus();
        return false;
    }
}