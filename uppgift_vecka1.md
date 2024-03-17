## Uppgift Vecka 1: Utforska och Modifiera ett Maven-projekt

### Översikt
Under veckans uppgift kommer du att arbeta med ett befintligt Maven-projekt. Målet är att bli bekant med projektstrukturen, utföra grundläggande Maven-kommandon och göra anpassningar i projektet. Denna uppgift ger en praktisk inblick i verktyg och processer som används i Java-utveckling.

### Delmoment och Uppgifter

#### Steg 1: Ladda ner och undersöka projektet
1. **Ladda ner projektet:** Starta med att ladda ner det tillhandahållna Maven-projektet till din dator.
2. **Utforska projektets filer:** Öppna projektets mapp och titta igenom de olika filerna. Om det finns filer du inte förstår dig på, använd ChatGPT för att få en förklaring.

#### Steg 2: Importera och bygga projektet
1. **Importera som Maven-projekt:** Öppna Eclipse och importera den nedladdade mappen som ett Maven-projekt.
2. **Exekvera Maven goal "install":** Använd Eclipse för att köra Maven-kommandot "install". Om du är osäker på hur man gör, fråga ChatGPT.

#### Steg 3: Utforska projektet post-byggnation
1. **Observera förändringar:** Efter att ha kört Maven "install", undersök projektstrukturen igen. Notera om det har skapats några nya filer eller om något annat har förändrats.
2. **Jar-filens exekvering:** Konstatera att jar-filen som skapades inte kan exekveras. Anpassa Maven-konfigurationen för att:
   a. Tvinga användning av Java version 17.
   b. Se till att jar-filen exekverar `BMICalculator` när man skriver `java -jar FILNAMN.jar` i kommandotolken.

#### Steg 4: Anpassningar och funktionstillägg
1. **Utöka BMICalculator:**
   a. Lägg till kategorin "Severely Obese".
   b. Skapa en `Person`-klass och instansiera karaktärerna "Skeletor" och "Jabba The Hut", som motsvarar kategorierna "Underweight" och "Severely Obese".
   c. Lägg till en metod `bmiStatusToString` i `BMICalculator` som skriver ut namnet och BMI-kategorin för en person, exempelvis: "Skeletor is Underweight".
   d. Lagra båda personerna i en array av typen `Person`.
   e. Modifiera programmet så att det skriver ut BMI-status för alla personer i arrayen.