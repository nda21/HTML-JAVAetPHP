<?php
include '_conf.php';

function genererMotDePasse($longueur) {
    // Ensemble des caractères utilisables pour le mot de passe
    $caracteres = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-=[]{}|;:,.<>?';
    // Initialisation du mot de passe
    $motDePasse = '';
    // Taille totale du jeu de caractères
    $tailleCaracteres = strlen($caracteres);
    // Boucle pour générer chaque caractère aléatoire
    for ($i = 0; $i < $longueur; $i++) {
        $indexAleatoire = random_int(0, $tailleCaracteres - 1);
        $motDePasse .= $caracteres[$indexAleatoire];
    }
    return $motDePasse;
}


if (isset($_POST['envoi_perdu'])) 
{
        $email=$_POST["email"];
        $login=$_POST["login"];
        $connexion = mysqli_connect($serveurBDD,$userBDD,$mdpBDD,$nomBDD);
        $requete="SELECT * FROM utilisateur
                WHERE email='$email' AND login='$login'";
          $resultat = mysqli_query($connexion, $requete); // on exécute la requête dans la variable resultat
           $trouve=0; //initialisation d'une variable trouve à 0 qui servira pour voir si on a trouvé une ligne dans la requête
            while($donnees = mysqli_fetch_assoc($resultat)) // pour chaque ligne dans la requête je stock ça dans un tableau $donnees avec comme colonne le nom des champs de la requête SQL
              {
                $trouve=1; //si on rentre dans la boucle c'est qu'on a trouvé 
              }
            //**** fin SQL
            if($trouve==1)
            {
                $newmdp=genererMotDePasse(10);
                $newmdphash=md5($newmdp);
               $requete="UPDATE `utilisateur` SET `motdepasse` = '$newmdphash' 
                     WHERE email='$email' AND login='$login'"; 

              
                if(!mysqli_query($connexion,$requete)) 
                    {
                    echo "erreur";
                    }
                else //si possibilité de faire la requete :
                    {
                   echo "MISE A JOUR MDP";
                    }
                
            }
           
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
                <button class="btn-menu" onclick="window.location.href='index.php'">index</button>
            </div>
        </nav>
    </header>

     <main>
        <section id="formulaire" class="form-container">
            <h2>Mot de passe oublié</h2>
            <form action="oubli.php" method="post">
                <div class="form-group">
                    <label>Email :</label>
                    <input type="email" name="email" placeholder="Entrez votre email" value="<?php if (isset($email)) echo $email;?>" required>
                </div>
                     <div class="form-group">
                    <label>Login :</label>
                    <input type="text" name="login" placeholder="Entrez votre login"  value="<?php if (isset($login)) echo $login;?>" required>
                </div>

                <button type="submit" class="btn-submit" name="envoi_perdu" value="1">Envoyer pour recevoir un nouveau mot de passe par email</button>
                <?php 
                if (isset($trouve)) 
                {
                    if($trouve==0)
                    {
                        echo "<br>ERREUR email/login non trouvé";
                    }
                    else {

                        $destinataire = "$email"; // Adresse du destinataire
                        $sujet = "Site CR STAGE : nouveau mot de passe"; // Sujet de l'e-mail
                        $message = "Bonjour, voici votre nouveau mot de passe sur le site des CR de stage : $newmdp"; // Corps de l'e-mail
                     
                        // Envoi de l'e-mail
                        if(mail($destinataire, $sujet, $message)) {
                            echo "L'e-mail a été envoyé avec succès.";
                        } else {
                            echo "Échec de l'envoi de l'e-mail.";
                          }
                    }
                }
                ?>
            </form>
        </section>
    </main>
</body>
</html>