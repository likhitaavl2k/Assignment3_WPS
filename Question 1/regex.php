<?php

require_once("dummy.php");

if (isset($_POST['submit'])){
	$password = $_POST['password'];
}

$exp = preg_match_all("/^A[a-zA-z0-9]{3}[b|B]+[0-9]{2}/", $password, $array);

if($exp){
	echo "<script>
	swal({ 
		title: 'Strong Password!!',
		text: 'Matched with regex!',
		type: 'success' 
		},
		function(){
			window.location.href = 'index.html';
			});
			</script>";
}
else{
	echo "<script> swal('Wrong!!', 'The password must begin with  the  (uppercase)  letter  A.  Any  three  alphanumeric characters must follow. After these, the letter B (uppercase or lowercase) must be repeated one or more times, and the string must end with two digits', 'error') </script>";
	echo "<script>
	swal({ 
		title: 'Wrong!!',
		text: 'The password must begin with  the  (uppercase)  letter  A.  Any  three  alphanumeric characters must follow. After these, the letter B (uppercase or lowercase) must be repeated one or more times, and the string must end with two digits',
		type: 'error' 
		},
		function(){
			window.location.href = 'index.html';
			});
			</script>";
}

?>