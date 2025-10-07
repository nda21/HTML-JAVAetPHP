<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Formulaire d'inscription</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 20px;
        }

        form {
            background-color: #fff;
            padding: 20px;
            max-width: 400px;
            margin: auto;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        input[type="submit"] {
            margin-top: 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

    <form action="inscription2.php" method="post">
        <label>Nom :</label>
        <input type="text" name="nom" placeholder="Entrer votre nom" required>

        <label>Prénom :</label>
        <input type="text" name="prenom" placeholder="Entrer votre prénom" required>

        <label>Login :</label>
        <input type="text" name="login" required>

        <label>Téléphone :</label>
        <input type="text" name="tel" required>

        <label>Mot de passe :</label>
        <input type="password" name="mdp" placeholder="Entrer votre mot de passe" required>

        <label>Email :</label>
        <input type="email" name="email" placeholder="Entrer votre email" required>

        <label>Fonction :</label>
        <select name="option">
            <option value="0">Élève</option>
            <option value="1">Prof</option>
        </select>

        <input type="submit" value="Envoyer" name="envoie">
    </form>

</body>
</html>
