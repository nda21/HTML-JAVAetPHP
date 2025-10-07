<?php
include '_conf.php';

if (isset($_POST['envoie'])) {

    $nom     = $_POST['nom'];
    $prenom  = $_POST['prenom']; // pas d'accent !
    $login   = $_POST['login'];
    $tel     = $_POST['tel'];
    $email   = $_POST['email']; // manquait dans ton code
    $mdp     = md5($_POST['mdp']); // ⚠️ obsolète, voir note sécurité
    $option  = $_POST['option'];
    // la varaible type dit si option égal à un 1 la valeur type prend 1
    $type = ($option == "1" )?1 : 0;

    // ce connecte à la base de données
    $connexion = mysqli_connect($serveurBDD, $userBDD, $mdpBDD, $nomBDD);

    //si la connexion échoue afficher probleme de connexion avec la BDD
    if (!$connexion) {
        die("Erreur de connexion à la BDD : " . mysqli_connect_error());
    }

    // Si on est connecter à la BDD inserer les valeurs dans la BDD recuperer par la fonction POST 
    $requete = "INSERT INTO utilisateur 
        (num, nom, prenom, tel, login, motdepasse, type, email, option, num_stage) 
        VALUES 
        (NULL, '$nom', '$prenom', '$tel', '$login', '$mdp', $type, '$email', '$option', NULL);";

    // la connexion reussi et les requete faites on creer la valiables $resultat 
    $resultat = mysqli_query($connexion, $requete);

    
    if ($resultat) {
        echo "Utilisateur ajouté avec succès !";
    } else {
        echo "Erreur : " . mysqli_error($connexion);
    }

header("Location: index.php"); // permet de me rediriger vers cette page 
    exit();
}
?>
