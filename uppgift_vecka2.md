## Uppgift: Utforska Datatyper och Precision i Java

### Översikt
I denna uppgift kommer du att använda och modifiera den givna "StrangeCalc"-koden för att utforska hur Java hanterar olika datatyper, särskilt när det gäller aritmetiska beräkningar och precision. Uppgiften är uppdelad i delar där varje del fokuserar på specifika koncept kring datatyper, konverteringar och precision.

### Delmoment och Uppgifter

#### Del 1: Granskning och Debugging
1. **Analysera och Debugga Kod:** Kör den givna "StrangeCalc"-koden i din IDE och använd debugging-verktygen för att stegvis gå igenom varje beräkningssektion (float, int, double och BigDecimal). Sätt breakpoints vid varje aritmetisk operation. Observera värdet av varje variabel precis före och efter varje aritmetisk operation. Notera hur värdena förändras, särskilt när du konverterar mellan olika datatyper.
2. **Diskutera Resultaten:** Efter att ha använt debugging, diskutera i par vilka observationer ni gjorde. Fokusera på frågor som:
   - Hur påverkar konverteringen mellan datatyper resultaten av beräkningarna?
   - Vilka avrundningsfel kunde ni identifiera vid konvertering mellan `float` och `double`?
   - Om du googlar efter "BigDecimal javadoc", vad hittar du då? Kan du förklara varför man ska använda BigDecimal istället för primitiva datatyper när man räknar på pengar? Och förreseten, vad är javadoc?
   - Varför blir det nästa `short` värdet negativ?

#### Del 2: Implementera en Enkel Räknare
Skapa en ny klass "MySimpleCalc" som låter användaren mata in två tal och välja en aritmetisk operation (addition, subtraktion, multiplikation, division). Utför beräkningen med `BigDecimal` och visa resultatet.

Interaktionen kan se som följande ut:

"Welcome to the basic calculator! Please enter the two numbers you want to process:"
> 15 16

Ok, what do you want to do with the two? Enter one of the numbers 1-4 accordingly: 1. add, 2. subtract, 3. multiply, 4. divide

> 1

You decided to add the values. The result is 15 + 16 = 31."

Kom ihåg att ChatGPT kan hjälpa en del, tex med hur man läser in från kommandoraden. Kan du få programmet att börja om efter att svaret har skrivits ut?

Vi har inte pratat om hantering av fel/Exceptions - men det blir aktuellt när man läser från kommandoraden. Du kan "slänga" felmeddelanden med "throw" kommandot enligt det som Eclipse pre-compiler rekommenderar - ChatGPT har säkert några tips där med om du åker fast.

#### Del 3: Encapsulation
I kapitel i boken skrivs det om de 3 egenskaper som objekt-orienterade program ska ha, och ett av de är inkapsling. `Person` klassen från uppgift 1 är ett exempel på dåligt inkapsling. Kan du förklara varför och hur man kan få till en bättre inkapsling?