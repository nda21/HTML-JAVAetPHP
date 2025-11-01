<?php
session_start();
include '_conf.php'; // Ici, $connexion est un objet PDO

if (!isset($_SESSION["id"])) {
    exit();
}

try {
    // Connexion à la base de données avec MySQLi
    $connexion = mysqli_connect($serveurBDD, $userBDD, $mdpBDD, $nomBDD);

    if (!$connexion) {
        throw new Exception("Erreur de connexion : " . mysqli_connect_error());
    }

    // Requête SQL
    $sql = "SELECT num, prenom, nom FROM utilisateur WHERE type = 0 ORDER BY prenom, nom";

    // Préparation et exécution
    $stmt = $connexion->prepare($sql);
    $stmt->execute();

    // Récupération des résultats
    $result = $stmt->get_result(); // Récupère un objet mysqli_result
    $rows = $result->fetch_all(MYSQLI_ASSOC); // ✅ Récupère toutes les lignes

} catch (Exception $e) {
    die("Erreur lors de la récupération des élèves : " . $e->getMessage());
}


?>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Liste des élèves</title>
    <style>
        <style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f6f8;
        margin: 20px;
        color: #333;
    }

    h2 {
        color: #2c3e50;
        text-align: center;
    }

    table {
        width: 60%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #ffffff;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    th, td {
        padding: 12px 15px;
        border-bottom: 1px solid #ddd;
        text-align: left;
    }

    th {
        background-color: #2980b9;
        color: white;
        text-transform: uppercase;
    }

    tr:hover {
        background-color: #f1f1f1;
    }

    .liens {
        text-align: center;
        margin-top: 30px;
    }

    .liens a {
        display: inline-block;
        margin: 10px;
        padding: 10px 20px;
        text-decoration: none;
        color: white;
        background-color: #3498db;
        border-radius: 5px;
        transition: background-color 0.3s ease;
    }

    .liens a:hover {
        background-color: #2980b9;
    }
</style>

        
        
        
    </style>
</head>
<body>

<h2>Liste des élèves</h2>

<table>
    <tr>
        <th>Prénom</th>
        <th>Nom</th>
        
    </tr>

    <?php foreach ($rows as $rows) : ?>
        <tr>
            <td><?= htmlspecialchars($rows['prenom']) ?></td>
            <td><?= htmlspecialchars($rows['nom']) ?></td>
        </tr>
    <?php endforeach; ?>

</table>

<br><div class="liens">
        <a href="cr.php">Voir la liste des compte-rendus</a><br><br>
        <a href="accueil.php">Retourner à l'accueil</a>
    </div>
    
</body>
</html>