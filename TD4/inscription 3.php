<?php 

$prenom = $_POST ['prenom'];
$nom = $_POST['nom'];
$text = $_POST['login'];
$password = $_POST['mdp'];
$email = $_POST['mail'];
$date = $_POST['date_of_birth'];
$radio = $_POST['genre'];
$bac = $_POST['menu'];
echo "Bonjour $prenom $nom du pseudo $text votre mot de passe est $password avec votre mail $email , $date, $radio";

include "conf.php";
if ($connexion = mysqli_connect($serveur, $user, $mdp ,$nomBDD))

{
    echo 'Felicitation, vous êtes connecté à la BDD';
    $requete="Insert into adherent (id,nom,prenom,email,login,password,dateNaissance,Sexe,Annee_BAC) VALUE ('','$nom','$prenom','$email','$text','$password','$date','$radio','$bac')";
    echo "<hr>$requete<hr>";
    $i=0;
if (!mysqli_query($connexion,$requete))

{
        echo"<br>Erreur:.mysqli_error($connexion) <br>";
}
mysqli_close($connexion);
}
else
{
    echo 'Erreur';
}
?>

