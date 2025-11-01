<?php
include "conf.php";
session_start();


$login = $_POST['login'];

$pwd = $_POST['pwd'];

$numero = $_POST['numero'];

$date = $_POST['date'];

$cryptogramme = $_POST['cryptogramme'];

$nom = $_POST['nom'];
$prenom = $_POST['prenom'];






$_SESSION['email'];





if($connexion = mysqli_connect($serveur ,$user, $mdp, $nomBDD))
	{
		echo "vous etes connecter ";
	}
		// Si la connexion a réussi on va insérer les clients dans la BDD
		$requete="INSERT INTO utilisateur (num,nom,prenom,login,password,email,numero_compte,cryptogramme,date_expiration) 

		VALUES (NULL,'$nom','$prenom','$login','$pwd','{$_SESSION['email']}','$numero','$cryptogramme','$date')";

		if (!mysqli_query($connexion, $requete)) {
			echo "Erreur";
		}
		 $resultat = mysqli_query($connexion, $requete);

		if ($resultat) {
        echo " Utilisateur ajouté avec succès !";
    } else {
        echo "Erreur : " . mysqli_error($connexion);
    }






?>

