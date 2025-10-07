<?php
// session_start permet de garder l'utisateur connecté
session_start();

// fonction isset -> indique que si la variable 'deco' existe  et GET permets de retourner  une valeur si elle a été envoyée via l’URL
      if (isset($_GET['deco']))
            {

              session_destroy();
              //détruit la session après clique sur bouton deconnexion
              echo "deconnectée";
            } 
?>


<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Suivi des Stages</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <!-- Menu de navigation -->
    <header>
        <nav class="menu">
            <div class="logo">Suivi Stages</div>
            <div class="menu-buttons">
                <button class="btn-menu" onclick="window.location.href='oubli.php'">Mot de passe oublié</button>
                <!-- rajout pour la page inscription -->
                <button class="btn-menu" onclick="window.location.href='inscription.php'">Inscriptions</button>
            </div>
        </nav>
    </header>

     <main>
        <section id="formulaire" class="form-container">
            <h2>Connexion</h2>
            <form action="accueil.php" method="post">
                <div class="form-group">
                    <label>Login :</label>
                    <input type="text" name="login" placeholder="Entrez votre login" required>
                </div>
                <div class="form-group">
                    <label>Mot de passe :</label>
                    <input type="password" name="mdp" placeholder="Entrez votre login" name="envoi" required>
                </div>
                <button type="submit" class="btn-submit" name="envoi" value="1">Envoyer</button>
            </form>
        </section>
    </main>
</body>
</html>