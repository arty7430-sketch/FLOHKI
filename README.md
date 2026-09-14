# FLOHKI Android 1.0

Dieses Projekt ist eine native Android-Hülle mit einem vollständig offline nutzbaren FLOHKI-Marktplatz-Prototypen. Es wurde für `compileSdk/targetSdk 36` vorbereitet.

## Öffnen und App Bundle bauen
1. Aktuelles Android Studio installieren.
2. Diesen Ordner als Projekt öffnen.
3. Android SDK Platform 36 installieren, falls Android Studio danach fragt.
4. Projekt synchronisieren.
5. In Android Studio: **Build > Generate Signed App Bundle or APK > Android App Bundle**.
6. Einen eigenen Upload-Key/Keystore erstellen oder auswählen.
7. Release-AAB erzeugen und in die Google Play Console hochladen.

## Was bereits funktioniert
- Startseite/Marktplatz
- Suche
- Favoriten mit lokaler Speicherung
- Foto-/Galerieauswahl
- lokaler KI-ähnlicher Verkaufsflow mit Preisvorschlägen
- Anzeige erstellen und lokal veröffentlichen
- Chat-Demo
- Profil
- App-Icon, Theme und Store-Texte

## Wichtige Grenze vor einem echten öffentlichen Marktstart
Diese Version ist **offline/lokal**. Mehrere echte Nutzer können noch nicht miteinander handeln. Für einen öffentlichen Marktplatz braucht FLOHKI vor dem produktiven Launch mindestens Authentifizierung, Backend/Cloud-Datenbank, Bildspeicher, echte KI-/Preisquelle, Moderation/Meldewege, Datenschutz/Impressum und optional Push/Payment. Dafür sind externe Konten/Schlüssel nötig, die nicht sinnvoll in ein öffentliches App-Paket eingebaut werden dürfen.
