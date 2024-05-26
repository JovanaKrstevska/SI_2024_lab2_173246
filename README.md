# Втора лабораториска вежба по Софтверско инженерство
## Јована Крстевска индекс 173246

## Control Flow Graph

![image](https://github.com/JovanaKrstevska/SI_2024_lab2_173246/assets/100038564/3617c328-e3f7-4511-8824-e68c9af4cd0d)


## Цикломатска комплексност
- Кога станува збор за цикломатска комплексност односно како ние го наоѓаме со тоа што во кодот имаме 7 if циклуси и 2 for циклуси. По формулата P + 1 ја одредуваме циклуматската комплексност со тоа што P е бројот на предикатни јазли. Во овој случај имаме 9 + 1 и како резултат цикломатската комплексност изнесува 10.


## Тест случаеви според критериумот на Every statment
Кога станува збор за ваков критериум треба да распознаваме односно да ги наоѓаме сите if-вови кои што се наоѓаат во SILab2.java кодот бидејќи еден if репрезентира критериум (Statment). Подоли ќе ги објасниме детално што претставуваат тие критериуми:
<br/>
  1. Тест Случај 1 "allitems == null":
     - Како влезен аргумент имаме allitems каде што има вредност null и payment некоја вредност. Во овој случај фрламе RuntimeExepction со порака "allitems list can't be null!"
  2. Тест Случај 2 "For loop allitems":
     - Овде имаме for циклус каде што листаме items
  3. Тест Случај 3 "item.getName() == null || item.getName().lengh() == 0":
     - Тука имаме if каде што проверуваме дали името на тој item е null односно нема никакво име. Како резултат ставаме default вредност кој што е unknown.
  4. Тест Случај 4 "item.getBarcode() == null":
     - Овој if услов проверуваме дали конкретниот item има баркод. Во овој случај кажуваме дека нема и се фрла RuntimeExeption и како порака дава "No barcode!".
  5. Тест Случај 5 "Check the barcode":
     - Овде го проверуваме баркодот на конкретниот item дали е валиден или не е валиден. Во случај доколку баркодот не е валиден фрламе RuntimeExeption каде што како порака печати "Invalid character in item barcode!"
  6. Тест Случај 6 "item.getDisciount() > 0":
     - Оваа проверка гледаме дали конкретниот item има попуст. Во случај докиолку тој item има попуст тогаш треба да биде поефтино од дадениот payment кој што е даден.
  7. Тест Случај 7 "sum<=payment":
     - Правиме провферка дали сумата е помала од дадениот payment кој што го имаме

## Тест случаеви според критериумот на Multiple Condition
Како за крај би објасниле за Multiple Condiion. Тука би го спомнеле условот "if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')". Тука можеме да наведема дека имаме 4 тест случаеви
<br/>
 1. Тест Случај 1 "Кога сите услови се вистинити односно true" (ТТТ) итерација
 2. Тест Случај 2 "Кога цената е помала од 300" (FXX) итерација
 3. Тест Случај 3 "Кога баркодот не почнува со 0" (TTF) итерација
 4. Тест Случај 4 "Попустот е 0" (TFX) итерација
