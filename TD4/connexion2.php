<?php
session_start(); // Démarrer la session

include "conf.php"; // Fichier de connexion à la base de données

// Vérifier si le formulaire a été soumis
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $login = $_POST["login"];
    $password = $_POST["password"];

    // Connexion à la base de données
    $connexion = mysqli_connect($serveur, $user, $mdp, $nomBDD);

    if (!$connexion) {
        die("Erreur de connexion à la base de données : " . mysqli_connect_error());
    }

    // Échapper les valeurs pour éviter les injections SQL
    $login = mysqli_real_escape_string($connexion, $login);

    // Requête pour récupérer l'utilisateur
    $requete = "SELECT id, login, password, role FROM adherent WHERE login='$login'";
    $resultat = mysqli_query($connexion, $requete);

    if (mysqli_num_rows($resultat) > 0) {
        $row = mysqli_fetch_assoc($resultat);
        if (password_verify($password, $row['password'])) { // Vérification du mot de passe
            $_SESSION['login'] = $row['login'];
            $_SESSION['role'] = $row['role'];

            // Redirection vers index2.php après connexion réussie
            header("Location: index2.php");
            exit();
        } else {
            echo "<script>alert('Mot de passe incorrect'); window.location.href='index.php';</script>";
        }
    } else {
        echo "<script>alert('Utilisateur non trouvé'); window.location.href='index.php';</script>";
    }

    mysqli_close($connexion);
}
?>
