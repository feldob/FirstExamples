# **Java och Git: En Praktisk Introduktion till att Skapa ett Online Casino**

## **Del 1: Modellera ett Online Casino med Java (2,5 timmar)**

### **1. Grundläggande Klasser för Casinot**
- **Uppgift:** Börja med att modellera ditt online casino. Skapa klasser som `Player`, `Game`, `WheelOfFortune`, och `Roulette`. För `Player`, inkludera attribut som `namn`, `saldo` och metoder för att sätta insatser. För spelklasserna, börja med att implementera en metod `spin` i `WheelOfFortune` och `bet` i `Roulette`. Fundera ut ett användningsfall där en spelare startar spelet och satsar pengar. Hur ska interaktionen se ut? Du har alla friheter att nyttja terminalen som du vill - hur skulle du designa upplevelsen?
- **Syfte:** Introducera er till objektorienterad design och modellering med ett verkligt scenario. Fokusera på att välja lämpliga datatyper och tänka på hur olika objekt interagerar i ett system.
- **Tips:** Skapa en till Klass `WheelOfFortuneUseCase` där du i main metoden skriver upp ett scenario där du skapar en användare och låter den spela ett antal rundor (tex tills den är pank). På det sättet får du en bra ide av de viktiga stegen och kan sedan fundera ut hur den riktiga användaren ska hälsas och vilka val den ska få. Du kan skapa ett package fk.examples.onlinecasino för att spara dina nya klasser, alternativt skapa ett eget nytt projekt i din IDE.

### **2. Implementera Spellogiken**
- **Uppgift:** Implementera grundläggande spellogik. I `WheelOfFortune`, låt `spin`-metoden slumpmässigt välja ett resultat som bestämmer om spelaren vinner eller förlorar baserat på deras insats. Använd Java's `Random` klass för att generera slumpmässiga resultat. I `Roulette`, börja med en förenklad version där spelaren kan satsa på "rött" eller "svart".
- **Syfte:** Öva på att använda Java's standardbibliotek för att generera slumpmässiga nummer och implementera enkel spellogik. Lyft vikten av korrekta beräkningar när det gäller pengar.

## **Del 2: Grundläggande Git för Versionshantering (1,5 timmar)**

### **1. Git Setup och Första Commit**
- **Uppgift:** Initiera ett Git-repository i ert projekt med `git init`. Lägg till era Java-klassfiler till staging-området med `git add .` (notera punkten som lägger till alla filer) och gör er första commit med `git commit -m "Initial commit, added casino classes"`.
- **Syfte:** Introducera versionshantering som ett verktyg för att spåra och säkra er kodutveckling.

### **2. Förstå Commit och Push**
- **Uppgift:** Gör en ändring i någon av era klasser, till exempel genom att lägga till en ny metod eller ändra spellogiken. Använd `git diff` för att visa vilka ändringar ni gjort sedan senaste commit. Gör sedan en ny commit. Slutligen, skapa ett repository på GitHub och `push`a era ändringar med `git remote add origin [URL]` följt av `git push -u origin main`.
- **Syfte:** Lär er skillnaden mellan att spara ändringar lokalt med `commit` och att dela dem centralt med `push`. Förstå vikten av att regelbundet commit:a och säkert dela kod via GitHub.

