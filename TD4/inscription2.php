<?php 
// Récupération des données du formulaire
$prenom = $_POST['prenom'];
$nom = $_POST['nom'];
$login = $_POST['login'];
$password = $_POST['mdp'];
$password_hashed = password_hash($password, PASSWORD_BCRYPT); // Sécurisation du mot de passe
$email = $_POST['mail'];
$date = $_POST['date_of_birth'];
$genre = $_POST['genre'];
$bac = $_POST['menu'];
$role = $_POST['role'];
$code = $_POST['code']; // Ajout du champ code à 5 chiffres

// Affichage des informations (Débogage)
echo "Bonjour $prenom $nom, votre pseudo est $login. Votre email est $email, né(e) le $date, sexe: $genre.";

// Inclusion du fichier de configuration
include "conf.php";

// Connexion à la base de données
$connexion = mysqli_connect($serveur, $user, $mdp, $nomBDD);

if (!$connexion) {
    die("Erreur de connexion à la base de données : " . mysqli_connect_error());
} else {
    echo '<br>Félicitations, vous êtes connecté à la BDD.<br>';
}

// Échappement des variables pour éviter les injections SQL
$nom = mysqli_real_escape_string($connexion, $nom);
$prenom = mysqli_real_escape_string($connexion, $prenom);
$login = mysqli_real_escape_string($connexion, $login);
$email = mysqli_real_escape_string($connexion, $email);
$date = mysqli_real_escape_string($connexion, $date);
$genre = mysqli_real_escape_string($connexion, $genre);
$bac = mysqli_real_escape_string($connexion, $bac);
$role = mysqli_real_escape_string($connexion, $role);
$code = mysqli_real_escape_string($connexion, $code);

// Requête SQL corrigée
$requete = "INSERT INTO adherent (nom, prenom, email, login, password, dateNaissance, Sexe, Annee_BAC, role, code) 
            VALUES ('$nom', '$prenom', '$email', '$login', '$password_hashed', '$date', '$genre', '$bac', '$role', '$code')";

if (mysqli_query($connexion, $requete)) {
    echo "<br>Inscription réussie !<br>";
} else {
    echo "<br>Erreur : " . mysqli_error($connexion) . "<br>";
}

// Fermeture de la connexion
mysqli_close($connexion);
?>




<html>
<head> 
    <title>Inscription réussie</title> 
</head> 
<body> 
    <form method="POST" action="index.php">
        <button type="submit">Se connecter</button>
    </form>
</body> 
</html>
