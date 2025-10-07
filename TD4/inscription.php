<html>
<head> 
    <meta charset="utf-8">
    <title>Inscription</title>
    <link rel="stylesheet" type="text/css" href="2style.css">
</head>  
<body>     

    <form method="post" action="inscription2.php" onsubmit="return checkpassword()">

        <label>Login :</label> <br>
        <input name="login" type="text" required><br>

        <label>Mot de passe :</label>
        <input id="password" name="mdp" type="password" required><br>

        <label>Répéter le mot de passe :</label>
        <input id="password_confirm" name="mdp_confirm" type="password" required><br>

        <label>Code à 5 chiffres :</label>
        <input name="code" type="text" pattern="\d{5}" title="Entrez un code de 5 chiffres" required><br>

        <label>Nom :</label> <br>
        <input name="nom" type="text" required><br>

        <label>Prénom :</label> <br>
        <input name="prenom" type="text" required><br>

        <label>Email :</label>
        <input name="mail" type="email" required><br>

        <label for="dob">Date de naissance :</label>
        <input type="date" id="dob" name="date_of_birth" required><br>

        <label>Sexe :</label>
        <input type="radio" name="genre" value="Monsieur" checked> Homme
        <input type="radio" name="genre" value="Madame"> Femme <br>

        <label>Année du bac :</label> <br>
        <select name="menu">
            <option value="2020">2020</option>
            <option value="2019">2019</option>
            <option value="2018">2018</option>
            <option value="2017">2017</option>
        </select><br>

        <label for="role">Rôle :</label>
        <select name="role">
            <option value="prof">Prof</option>
            <option value="eleve">Élève</option>
        </select><br>

        <input type="submit" value="S'inscrire">

    </form>

    <script>
        function checkpassword() {
            const password = document.getElementById("password").value;
            const confirmPassword = document.getElementById("password_confirm").value;

            if (password.length < 10) {
                alert("Le mot de passe doit contenir au moins 10 caractères.");
                return false;
            }

            if (password !== confirmPassword) {
                alert("Les mots de passe ne correspondent pas.");
                return false;
            }

            return true;
        }
    </script>

</body> 
</html>
