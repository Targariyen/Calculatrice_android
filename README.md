# 🧮 Calculatrice Android

Application de calculatrice développée en **Java** avec **Android Studio**, dans le cadre de l'atelier *« De zéro à la calculatrice Android en Java pour débutants »*.

## 📱 Fonctionnalités

- Saisie des chiffres (0 à 9)
- Quatre opérations : addition (+), soustraction (−), multiplication (×), division (÷)
- Gestion du cas limite de la **division par zéro** (affichage de « Erreur » plutôt qu'un résultat incohérent)
- Bouton **C** pour réinitialiser un calcul
- Interface visuelle avec un thème de couleurs cohérent (écran sombre, boutons d'opération en orange, bouton clear en rouge)

## 🛠️ Technologies utilisées

- **Langage :** Java
- **IDE :** Android Studio
- **Build system :** Gradle
- **Interface :** XML (LinearLayout + GridLayout)

## 🚀 Installer et tester l'application

### Option 1 - Installer l'APK directement (le plus simple)

1. Va dans l'onglet [**Releases**](../../releases) de ce dépôt.
2. Télécharge le fichier `app-debug.apk` de la dernière version.
3. Transfère-le sur un téléphone Android et installe-le (l'autorisation d'installer depuis des « sources inconnues » peut être demandée).

### Option 2 - Compiler le projet soi-même

1. Clone ce dépôt : `git clone https://github.com/Targariyen/Calculatrice_android.git`
2. Ouvre le dossier dans **Android Studio**.
3. Laisse Gradle synchroniser le projet.
4. Lance l'application sur un émulateur ou un appareil réel avec le bouton ▶.

## 🧱 Structure du projet

```
app/src/main/java/.../MainActivity.java   → Logique de l'application (calculs, clics)
app/src/main/res/layout/activity_main.xml → Interface visuelle (écran, boutons)
```

## 🎓 Contexte

Ce projet a été réalisé dans le cadre d'un atelier scolaire, en suivant une progression par blocs : installation de l'environnement, création du projet, construction de l'interface, variables et logique conditionnelle, calcul et gestion des erreurs, réinitialisation, découverte de Gradle, mise en forme visuelle, tests et génération de l'APK.

## 👤 Auteur

**Targariyen**
