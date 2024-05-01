function validateMyForm()
{
    var myForm = document.forms[0];
    var gender = myForm.gender;

    if(gender.value.length == 0)
    {
        alert("Please enter the gender");
        gender.focus();
        return false;
    }
    var skills = myForm.skills;
    if(skills.value.length == 1)
    {
        alert("Please enter the skills");
        skills.focus();
        return false;
    }
}