Процедура ПроверкаЧисел()

    ПонятнаяПеременная = 6; // Нет ошибки
    СекундВЧасе = 60 * 60; // Ошибкат на двух числах

    Если ТекущаяДатаИВремя > СекундВЧасе Тогда // Нет ошибки

        Результат = ?(Число1 = 11, Чтото, 3); // Ошибка на 11

    КонецЕсли;

    Если Описание = 4 Тогда // Ошибка на 4

        Возврат;

    КонецЕсли;

КонецПроцедуры

Если Описание2 > 11 Тогда // Ошибка на 11

    Чтото = Чтото + 1; // Нет ошибки из-за исключения
    Чтото = Чтото + 14; // Ошибка на 14

КонецЕсли;

ЭтоВоскресенье = ДеньНедели = 7; // Тут ошибка, хоть и вглядит нормально.
ДеньНеделиВоскресенье = 7;
ЭтоВоскресенье = ДеньНедели = ДеньНеделиВоскресенье; // А вот тут уже ошибки нет

// Далеше без ошибок
ПроверочноеПеречисление = Новый Массив;
ПроверочноеПеречисление.Добавить(1);
ПроверочноеПеречисление.Добавить(2);
ПроверочноеПеречисление.Добавить(3);

ПроверочнаяСтруктура = Новый Структура("Авто,ПростойВариант,СложныйВариант", 0, 1, 2);
ПроверочнаяСтруктура.Добавить("ЭкспертныйВариант", 3);