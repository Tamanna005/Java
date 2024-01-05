<?php
//print_r($_POST) //to get data in form of array
$username = $_POST['username'];
$password = $_POST['password'];

//compare these variables

$db_username = "SOU";
$db_password = "123";
//session varible can be use globaly

//nested if
if($username == $db_username ){ // to compare values 
    if($password == $db_password){
        //session varible can be use globaly
        session_start();
        $_SESSION['s_username'] = $username;
//if 
        header("Location:dashboard.php");
        }else{
            header("Location:form.php"); //redirect to the login page if data don't match
        }
}
console.log("Welcome");
?>