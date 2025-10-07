<?php
session_start();

// Vérifier si l'utilisateur est connecté
if (!isset($_SESSION['login'])) {
    header("Location: index.php");
    exit();
}

// Affichage du message selon le rôle
$roleMessage = ($_SESSION['role'] == 'prof') ? "PARTIE PROF" : "PARTIE ELEVE";
?>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Accueil</title>
</head>
<body>
    <h1>Bienvenue <?php echo $_SESSION['login']; ?>, vous êtes connecté en tant que : <strong><?php echo $roleMessage; ?></strong></h1>
    <a href="deconnexion.php">Se déconnecter</a>
</body>
</html>
